package net.scilingo.tictactoe.persistence;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "MOVE", schema = "tictactoe")
public class TicTacToeMove {

    private TicTacToeGame game;
    private String upperLeft;
    private String upperMiddle;
    private String upperRight;
    private String middleLeft;
    private String middleMiddle;
    private String middleRight;
    private String lowerLeft;
    private String lowerMiddle;
    private String lowerRight;
    private Timestamp lastUpdated;


    @OneToOne(targetEntity = TicTacToeGame.class, optional = false, orphanRemoval = true)
    public TicTacToeGame getGame() {
        return game;
    }

    public void setGame(TicTacToeGame game){
        this.game = game;
    }

    @Basic
    @Column(name = "upper_left")
    public String getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(String upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Basic
    @Column(name = "upper_middle")
    public String getUpperMiddle() {
        return upperMiddle;
    }

    public void setUpperMiddle(String upperMiddle) {
        this.upperMiddle = upperMiddle;
    }

    @Basic
    @Column(name = "upper_right")
    public String getUpperRight() {
        return upperRight;
    }

    public void setUpperRight(String upperRight) {
        this.upperRight = upperRight;
    }

    @Basic
    @Column(name = "middle_left")
    public String getMiddleLeft() {
        return middleLeft;
    }

    public void setMiddleLeft(String middleLeft) {
        this.middleLeft = middleLeft;
    }

    @Basic
    @Column(name = "middle_middle")
    public String getMiddleMiddle() {
        return middleMiddle;
    }

    public void setMiddleMiddle(String middleMiddle) {
        this.middleMiddle = middleMiddle;
    }

    @Basic
    @Column(name = "middle_right")
    public String getMiddleRight() {
        return middleRight;
    }

    public void setMiddleRight(String middleRight) {
        this.middleRight = middleRight;
    }

    @Basic
    @Column(name = "lower_left")
    public String getLowerLeft() {
        return lowerLeft;
    }

    public void setLowerLeft(String lowerLeft) {
        this.lowerLeft = lowerLeft;
    }

    @Basic
    @Column(name = "lower_middle")
    public String getLowerMiddle() {
        return lowerMiddle;
    }

    public void setLowerMiddle(String lowerMiddle) {
        this.lowerMiddle = lowerMiddle;
    }

    @Basic
    @Column(name = "lower_right")
    public String getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(String lowerRight) {
        this.lowerRight = lowerRight;
    }

    @Id
    @Column(name = "last_updated")
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicTacToeMove that = (TicTacToeMove) o;
        return Objects.equals(upperLeft, that.upperLeft) &&
                Objects.equals(upperMiddle, that.upperMiddle) &&
                Objects.equals(upperRight, that.upperRight) &&
                Objects.equals(middleLeft, that.middleLeft) &&
                Objects.equals(middleMiddle, that.middleMiddle) &&
                Objects.equals(middleRight, that.middleRight) &&
                Objects.equals(lowerLeft, that.lowerLeft) &&
                Objects.equals(lowerMiddle, that.lowerMiddle) &&
                Objects.equals(lowerRight, that.lowerRight) &&
                Objects.equals(lastUpdated, that.lastUpdated) &&
                Objects.equals(game, that.game);
    }

    @Override
    public int hashCode() {

        return Objects.hash(upperLeft, upperMiddle, upperRight, middleLeft, middleMiddle, middleRight, lowerLeft, lowerMiddle, lowerRight, lastUpdated, game);
    }
}
