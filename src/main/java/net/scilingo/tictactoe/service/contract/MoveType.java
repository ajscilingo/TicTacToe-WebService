
package net.scilingo.tictactoe.service.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a TicTacToe move
 * 
 * <p>Java class for MoveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GameId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UpperLeft" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UpperMiddle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UpperRight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MiddleLeft" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MiddleMiddle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MiddleRight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LowerLeft" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LowerMiddle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LowerRight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveType", propOrder = {
    "gameId",
    "upperLeft",
    "upperMiddle",
    "upperRight",
    "middleLeft",
    "middleMiddle",
    "middleRight",
    "lowerLeft",
    "lowerMiddle",
    "lowerRight"
})
public class MoveType {

    @XmlElement(name = "GameId")
    protected int gameId;
    @XmlElement(name = "UpperLeft")
    protected String upperLeft;
    @XmlElement(name = "UpperMiddle")
    protected String upperMiddle;
    @XmlElement(name = "UpperRight")
    protected String upperRight;
    @XmlElement(name = "MiddleLeft")
    protected String middleLeft;
    @XmlElement(name = "MiddleMiddle")
    protected String middleMiddle;
    @XmlElement(name = "MiddleRight")
    protected String middleRight;
    @XmlElement(name = "LowerLeft")
    protected String lowerLeft;
    @XmlElement(name = "LowerMiddle")
    protected String lowerMiddle;
    @XmlElement(name = "LowerRight")
    protected String lowerRight;

    /**
     * Gets the value of the gameId property.
     * 
     */
    public int getGameId() {
        return gameId;
    }

    /**
     * Sets the value of the gameId property.
     * 
     */
    public void setGameId(int value) {
        this.gameId = value;
    }

    /**
     * Gets the value of the upperLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperLeft() {
        return upperLeft;
    }

    /**
     * Sets the value of the upperLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperLeft(String value) {
        this.upperLeft = value;
    }

    /**
     * Gets the value of the upperMiddle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperMiddle() {
        return upperMiddle;
    }

    /**
     * Sets the value of the upperMiddle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperMiddle(String value) {
        this.upperMiddle = value;
    }

    /**
     * Gets the value of the upperRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperRight() {
        return upperRight;
    }

    /**
     * Sets the value of the upperRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperRight(String value) {
        this.upperRight = value;
    }

    /**
     * Gets the value of the middleLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleLeft() {
        return middleLeft;
    }

    /**
     * Sets the value of the middleLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleLeft(String value) {
        this.middleLeft = value;
    }

    /**
     * Gets the value of the middleMiddle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleMiddle() {
        return middleMiddle;
    }

    /**
     * Sets the value of the middleMiddle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleMiddle(String value) {
        this.middleMiddle = value;
    }

    /**
     * Gets the value of the middleRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleRight() {
        return middleRight;
    }

    /**
     * Sets the value of the middleRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleRight(String value) {
        this.middleRight = value;
    }

    /**
     * Gets the value of the lowerLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerLeft() {
        return lowerLeft;
    }

    /**
     * Sets the value of the lowerLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerLeft(String value) {
        this.lowerLeft = value;
    }

    /**
     * Gets the value of the lowerMiddle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerMiddle() {
        return lowerMiddle;
    }

    /**
     * Sets the value of the lowerMiddle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerMiddle(String value) {
        this.lowerMiddle = value;
    }

    /**
     * Gets the value of the lowerRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerRight() {
        return lowerRight;
    }

    /**
     * Sets the value of the lowerRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerRight(String value) {
        this.lowerRight = value;
    }

}
