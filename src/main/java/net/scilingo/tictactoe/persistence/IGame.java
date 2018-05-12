package net.scilingo.tictactoe.persistence;

public interface IGame {

    Long getId();
    Integer getWinnerPlayer();
    Character getWinnerSymbol();
    Boolean getGameOver();

    void setId(Long id);
    void setWinnerPlayer(Integer winnerPlayer);
    void setWinnerSymbol(Character winnerSymbol);
    void setGameOver(Boolean gameOver);

}
