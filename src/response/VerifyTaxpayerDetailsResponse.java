
package response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"ditResponse"})
@XmlRootElement(name = "verifyTaxpayerDetailsResponse")
public class VerifyTaxpayerDetailsResponse {

	 @XmlElement(name = "DitResponse")
    protected EvcThroughBankAccResponse ditResponse;
 
    public EvcThroughBankAccResponse getDitResponse() {
        return ditResponse;
    }

    public void setDitResponse(EvcThroughBankAccResponse value) {
        this.ditResponse = value;
    }

}
