package net.scilingo.tictactoe.persistence;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "GAME", schema = "tictactoe", catalog = "")
public class TicTacToeGame {
    private long id;
    private byte winnerPlayer;
    private String winnerSymbol;
    private Byte gameOver;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "winner_player")
    public byte getWinnerPlayer() {
        return winnerPlayer;
    }

    public void setWinnerPlayer(byte winnerPlayer) {
        this.winnerPlayer = winnerPlayer;
    }

    @Basic
    @Column(name = "winner_symbol")
    public String getWinnerSymbol() {
        return winnerSymbol;
    }

    public void setWinnerSymbol(String winnerSymbol) {
        this.winnerSymbol = winnerSymbol;
    }

    @Basic
    @Column(name = "game_over")
    public Byte getGameOver() {
        return gameOver;
    }

    public void setGameOver(Byte gameOver) {
        this.gameOver = gameOver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicTacToeGame that = (TicTacToeGame) o;
        return id == that.id &&
                winnerPlayer == that.winnerPlayer &&
                Objects.equals(winnerSymbol, that.winnerSymbol) &&
                Objects.equals(gameOver, that.gameOver);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, winnerPlayer, winnerSymbol, gameOver);
    }
}
