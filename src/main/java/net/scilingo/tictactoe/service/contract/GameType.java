
package net.scilingo.tictactoe.service.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="WinnerPlayer" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="WinnerSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GameOver" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GameType", propOrder = {
    "id",
    "winnerPlayer",
    "winnerSymbol",
    "gameOver"
})
public class GameType {

    protected long id;
    @XmlElement(name = "WinnerPlayer")
    protected byte winnerPlayer;
    @XmlElement(name = "WinnerSymbol", required = true)
    protected String winnerSymbol;
    @XmlElement(name = "GameOver")
    protected byte gameOver;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the winnerPlayer property.
     * 
     */
    public byte getWinnerPlayer() {
        return winnerPlayer;
    }

    /**
     * Sets the value of the winnerPlayer property.
     * 
     */
    public void setWinnerPlayer(byte value) {
        this.winnerPlayer = value;
    }

    /**
     * Gets the value of the winnerSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinnerSymbol() {
        return winnerSymbol;
    }

    /**
     * Sets the value of the winnerSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinnerSymbol(String value) {
        this.winnerSymbol = value;
    }

    /**
     * Gets the value of the gameOver property.
     * 
     */
    public byte getGameOver() {
        return gameOver;
    }

    /**
     * Sets the value of the gameOver property.
     * 
     */
    public void setGameOver(byte value) {
        this.gameOver = value;
    }

}
