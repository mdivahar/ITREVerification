
package response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DitResponse", propOrder = {
    "errorCode",
    "errorDesc"
})
public class DitResponse{

    @XmlElement(name = "ErrorCode", namespace = "http://iec.incometax.gov.in/ditsecws/response")
    protected String errorCode;
    @XmlElement(name = "ErrorDesc", namespace = "http://iec.incometax.gov.in/ditsecws/response")
    protected String errorDesc;
    @XmlAttribute(required = true)
    protected String uniqueRequestId;


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    public String getUniqueRequestId() {
        return uniqueRequestId;
    }

    public void setUniqueRequestId(String value) {
        this.uniqueRequestId = value;
    }

}
