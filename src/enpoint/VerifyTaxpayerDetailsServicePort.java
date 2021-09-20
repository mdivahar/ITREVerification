package enpoint;

import javax.jws.*;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import request.EvcThroughBankAccRequest;
import response.EvcThroughBankAccResponse;

@WebService(targetNamespace = "http://iec.incometax.gov.in/ditsecws")
public interface VerifyTaxpayerDetailsServicePort {

	@WebMethod(action = "")
    @WebResult(name = "DitResponse", targetNamespace = "http://iec.incometax.gov.in/ditsecws")
    @RequestWrapper(localName = "verifyTaxpayerDetails", targetNamespace = "http://iec.incometax.gov.in/ditsecws", className = "VerifyTaxpayerDetails")
    @ResponseWrapper(localName = "verifyTaxpayerDetailsResponse", targetNamespace = "http://iec.incometax.gov.in/ditsecws", className = "VerifyTaxpayerDetailsResponse")
	public EvcThroughBankAccResponse verifyTaxpayerDetails(@WebParam(name = "DitRequest", targetNamespace = "http://iec.incometax.gov.in/ditsecws") EvcThroughBankAccRequest ditRequest);
}
