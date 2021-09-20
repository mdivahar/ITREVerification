package request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvcThroughBankAccRequest", namespace = "http://iec.incometax.gov.in/ditsecws/request", propOrder = {
    "pan",
    "name",
    "bankAccountNumber",
    "ifsc",
    "mobileNumber",
    "emailId"
})
public class EvcThroughBankAccRequest extends DitRequest{

	@XmlElement(name = "PAN",namespace="http://iec.incometax.gov.in/ditsecws/request")
    protected String pan;
	
	@XmlElement(name = "Name",namespace="http://iec.incometax.gov.in/ditsecws/request")
    protected String name;
	
	@XmlElement(name = "BankAccountNumber",namespace="http://iec.incometax.gov.in/ditsecws/request")
    protected String bankAccountNumber;
	
	@XmlElement(name = "IFSC",namespace="http://iec.incometax.gov.in/ditsecws/request")
    protected String ifsc;
    
    @XmlElement(name = "MobileNumber",namespace="http://iec.incometax.gov.in/ditsecws/request")
    protected String mobileNumber;
    
    @XmlElement(name = "EmailId",namespace="http://iec.incometax.gov.in/ditsecws/request")
    protected String emailId;    

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public EvcThroughBankAccRequest() {
		super();
	}

	@Override
	public String toString() {
		return "Request [pan=" + pan + ", name=" + name + ", bankAccountNumber=" + bankAccountNumber + ", ifsc=" + ifsc
				+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
	}

	public EvcThroughBankAccRequest(String pan, String name, String bankAccountNumber, String ifsc, String mobileNumber, String emailId) {
		super();
		this.pan = pan;
		this.name = name;
		this.bankAccountNumber = bankAccountNumber;
		this.ifsc = ifsc;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;		
	}
	
}
