
package request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ditRequest"
})
@XmlRootElement(name = "verifyTaxpayerDetails")
public class VerifyTaxpayerDetails {

    @XmlElement(name = "DitRequest")
    protected EvcThroughBankAccRequest ditRequest;

    public EvcThroughBankAccRequest getDitRequest() {
        return ditRequest;
    }

    public void setDitRequest(EvcThroughBankAccRequest value) {
        this.ditRequest = value;
    }

}
