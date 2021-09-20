package implementor;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import enpoint.VerifyTaxpayerDetailsServicePort;
import request.EvcThroughBankAccRequest;
import response.EvcThroughBankAccResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.bct.bpms.rest.services.RestCall;

@WebService(endpointInterface = "enpoint.VerifyTaxpayerDetailsServicePort", serviceName = "VerifyTaxpayerDetailsService", targetNamespace = "http://iec.incometax.gov.in/ditsecws/")
public class VerifyTaxpayerDetails implements VerifyTaxpayerDetailsServicePort {

	private HttpServletRequest request;
	@Resource
	WebServiceContext context;

	@WebMethod(operationName = "getInfo")
	public void dBConfiguration() {
	
	}

	public String getInfo() {
		request = (HttpServletRequest) context.getMessageContext().get(MessageContext.SERVLET_REQUEST);
		String ipAddress = request.getHeader("x-forwarded-for");
		if (ipAddress == null) {
			ipAddress = request.getHeader("X_FORWARDED_FOR");
			if (ipAddress == null) {
				ipAddress = request.getRemoteAddr();
			}
		}
		return ipAddress;
	}

	@Override
	public EvcThroughBankAccResponse verifyTaxpayerDetails(@WebParam EvcThroughBankAccRequest ditRequest) {
		
		Map<String, String> input = new HashMap<String, String>();
		String remoteIp = getInfo();
		String uniqueRequestId = ditRequest.getUniqueRequestId();
		input.put("remoteIp", remoteIp);
		input.put("uniqueRequestId", uniqueRequestId);
		input.put("pan", ditRequest.getPan());
		input.put("name", ditRequest.getName());
		input.put("accNo", ditRequest.getBankAccountNumber());
		input.put("ifsc", ditRequest.getIfsc());
		input.put("mobileNumber", ditRequest.getMobileNumber());
		input.put("emailId", ditRequest.getEmailId());

		Map<String, Map<String, String>> inputDataToService = new HashMap<String, Map<String, String>>();
		inputDataToService.put("in_msg", input);

		HashMap<Object, Object> serviceData = new HashMap<Object, Object>();
		serviceData.put("inputVariables", inputDataToService);

		RestCall restCall = new RestCall();
		//String url = "https://www.kvbankonline.com/bpms/rest/CueRest/invokeESBService";
		String url = "https://172.21.1.44/bpms/rest/CueRest/invokeESBService";
		String listenerName = "VerifyTaxpayerDetails";
		long timeOut = 60000;
		Map returnHashMap = restCall.invokeService(url, listenerName, serviceData, timeOut);
		Map output = (Map) returnHashMap.get("out_msg");
		String errorCode = String.valueOf(output.get("errorCode"));
		EvcThroughBankAccResponse evcResponse = new EvcThroughBankAccResponse();
		evcResponse.setUniqueRequestId(uniqueRequestId);
		if ("00".equals(errorCode)) {
			evcResponse.setNameBankAccnt(String.valueOf(output.get("nameBankAccnt")));
			evcResponse.setMobileVerFlag(String.valueOf(output.get("mobileVerFlag")));
			evcResponse.setEmailVerFalg(String.valueOf(output.get("emailVerFalg")));
			evcResponse.setPanBankAccntLinkageFlag(String.valueOf(output.get("panBankAccntLinkageFlag")));
			evcResponse.setAccountStatus(String.valueOf(output.get("accountStatus")));
			evcResponse.setAccountType(String.valueOf(output.get("accountType")));
		} else {
			evcResponse.setErrorCode(errorCode);
			String errorDesc = String.valueOf(output.get("errorDesc"));
			evcResponse.setErrorDesc(errorDesc);
		}

		return evcResponse;

	}

}