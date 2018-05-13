package net.scilingo.tictactoe.service.impl;

import net.scilingo.tictactoe.TicTacToeMoveManager;
import net.scilingo.tictactoe.persistence.TicTacToeGame;
import net.scilingo.tictactoe.service.contract.*;
import net.scilingo.tictactoe.service.contract.Void;

public class TicTacToeMoveService implements MovePort {

    private final static TicTacToeMoveManager ticTacToeMoveManager;

    static {
        ticTacToeMoveManager = new TicTacToeMoveManager();
    }

    @Override
    public RecordMoveResponse recordMove(RecordMoveRequest recordMoveRequest) {
        return null;
    }

    @Override
    public NewGameResponse newGame(Void newGameRequest) {
        final TicTacToeGame newGame = ticTacToeMoveManager.startNewGame();
        final NewGameResponse newGameResponse = new NewGameResponse();
        final GameResponse gameResponse = new GameResponse();
        final GameType gameType = new GameType();

        gameType.setGameOver(newGame.getGameOver());
        gameType.setId(newGame.getId());
        gameType.setWinnerPlayer(newGame.getWinnerPlayer());
        gameType.setWinnerSymbol(newGame.getWinnerSymbol());
        gameResponse.setGame(gameType);
        newGameResponse.setResponse(gameResponse);

        return newGameResponse;

    }
}
