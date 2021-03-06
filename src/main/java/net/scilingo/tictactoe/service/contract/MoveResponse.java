
package net.scilingo.tictactoe.service.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Move" type="{http://tictactoe.scilingo.net/move/}MoveType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveResponse", propOrder = {
    "responseMessage",
    "move"
})
public class MoveResponse {

    @XmlElement(name = "ResponseMessage", required = true)
    protected String responseMessage;
    @XmlElement(name = "Move", required = true)
    protected MoveType move;

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the move property.
     * 
     * @return
     *     possible object is
     *     {@link MoveType }
     *     
     */
    public MoveType getMove() {
        return move;
    }

    /**
     * Sets the value of the move property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoveType }
     *     
     */
    public void setMove(MoveType value) {
        this.move = value;
    }

}
