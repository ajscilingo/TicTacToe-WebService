
package net.scilingo.tictactoe.service.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MoveParameter" type="{http://tictactoe.scilingo.net/move/}MoveType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "moveParameter"
})
@XmlRootElement(name = "RecordMoveRequest")
public class RecordMoveRequest {

    @XmlElement(name = "MoveParameter", required = true)
    protected MoveType moveParameter;

    /**
     * Gets the value of the moveParameter property.
     * 
     * @return
     *     possible object is
     *     {@link MoveType }
     *     
     */
    public MoveType getMoveParameter() {
        return moveParameter;
    }

    /**
     * Sets the value of the moveParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveType }
     *     
     */
    public void setMoveParameter(MoveType value) {
        this.moveParameter = value;
    }

}
