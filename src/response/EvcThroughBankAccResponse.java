package response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvcThroughBankAccResponse",  propOrder = {
    "nameBankAccnt",
    "panBankAccntLinkageFlag",
    "mobileVerFlag",
    "emailVerFalg",
    "accountStatus",
    "accountType"
    
})
public class EvcThroughBankAccResponse extends DitResponse{

	@XmlElement(name = "nameBankAccnt",namespace="http://iec.incometax.gov.in/ditsecws/response")
	protected String nameBankAccnt;
	@XmlElement(name = "panBankAccntLinkageFlag",namespace="http://iec.incometax.gov.in/ditsecws/response")
    protected String panBankAccntLinkageFlag;
	@XmlElement(name = "mobileVerFlag",namespace="http://iec.incometax.gov.in/ditsecws/response")
	protected String mobileVerFlag;
	@XmlElement(name = "emailVerFalg",namespace="http://iec.incometax.gov.in/ditsecws/response")
    protected String emailVerFalg;
	@XmlElement(name = "accountStatus",namespace="http://iec.incometax.gov.in/ditsecws/response")
    protected String accountStatus;
	@XmlElement(name = "accountType",namespace="http://iec.incometax.gov.in/ditsecws/response")
    protected String accountType;
	
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getNameBankAccnt() {
		return nameBankAccnt;
	}
	public void setNameBankAccnt(String nameBankAccnt) {
		this.nameBankAccnt = nameBankAccnt;
	}
	public String getPanBankAccntLinkageFlag() {
		return panBankAccntLinkageFlag;
	}
	public void setPanBankAccntLinkageFlag(String panBankAccntLinkageFlag) {
		this.panBankAccntLinkageFlag = panBankAccntLinkageFlag;
	}
	public String getMobileVerFlag() {
		return mobileVerFlag;
	}
	public void setMobileVerFlag(String mobileVerFlag) {
		this.mobileVerFlag = mobileVerFlag;
	}
	public String getEmailVerFalg() {
		return emailVerFalg;
	}
	public void setEmailVerFalg(String emailVerFalg) {
		this.emailVerFalg = emailVerFalg;
	}
	
}
