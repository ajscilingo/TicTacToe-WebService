
package net.scilingo.tictactoe.service.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Game Response
 * 
 * <p>Java class for GameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Game" type="{http://tictactoe.scilingo.net/move/}GameType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GameResponse", propOrder = {
    "responseMessage",
    "game"
})
public class GameResponse {

    @XmlElement(name = "ResponseMessage", required = true)
    protected String responseMessage;
    @XmlElement(name = "Game", required = true)
    protected GameType game;

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
     * Gets the value of the game property.
     * 
     * @return
     *     possible object is
     *     {@link GameType }
     *     
     */
    public GameType getGame() {
        return game;
    }

    /**
     * Sets the value of the game property.
     * 
     * @param value
     *     allowed object is
     *     {@link GameType }
     *     
     */
    public void setGame(GameType value) {
        this.game = value;
    }

}
