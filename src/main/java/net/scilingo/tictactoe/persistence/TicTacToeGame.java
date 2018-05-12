package net.scilingo.tictactoe.persistence;

import javax.persistence.*;
import java.io.Serializable;

public class TicTacToeGame implements IGame, Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "winner_player")
    private Integer winnerPlayer;

    @Column(name = "winner_symbol")
    private Character winnerSymbol;

    @Column(name = "game_over")
    private Boolean gameOver;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "game")
    private TicTacToeMove moveData;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Integer getWinnerPlayer() {
        return this.winnerPlayer;
    }

    @Override
    public Character getWinnerSymbol() {
        return this.winnerSymbol;
    }

    public TicTacToeMove getMoveData() {
        return moveData;
    }

    @Override
    public Boolean getGameOver() {
        return this.gameOver;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setWinnerPlayer(Integer winnerPlayer) {
        this.winnerPlayer = winnerPlayer;
    }

    @Override
    public void setWinnerSymbol(Character winnerSymbol) {
        this.winnerSymbol = winnerSymbol;
    }

    public void setMoveData(TicTacToeMove moveData) {
        this.moveData = moveData;
    }

    @Override
    public void setGameOver(Boolean gameOver) {
        this.gameOver = gameOver;
    }
}
