package net.scilingo.tictactoe.persistence;

import java.util.Calendar;

public interface IMove {

    IGame getGame();
    Character getUpperLeft();
    Character getUpperMiddle();
    Character getUpperRight();
    Character getMiddleLeft();
    Character getMiddleMiddle();
    Character getMiddleRight();
    Character getLowerLeft();
    Character getLowerMiddle();
    Character getLowerRight();
    Calendar getLastUpdated();

    void setGame(IGame game);
    void setUpperLeft(Character upperLeft);
    void setUpperMiddle(Character upperMiddle);
    void setUpperRight(Character upperRight);
    void setMiddleLeft(Character middleLeft);
    void setMiddleMiddle(Character middleMiddle);
    void setMiddleRight(Character middleRight);
    void setLowerLeft(Character lowerLeft);
    void setLowerMiddle(Character lowerMiddle);
    void setLowerRight(Character lowerRight);
    void setLastUpdated(Calendar lastUpdated);
}
