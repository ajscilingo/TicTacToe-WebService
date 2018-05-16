package net.scilingo.tictactoe.service.impl;

import net.scilingo.tictactoe.TicTacToeManager;
import net.scilingo.tictactoe.persistence.TicTacToeGame;
import net.scilingo.tictactoe.persistence.TicTacToeMove;
import net.scilingo.tictactoe.service.contract.*;
import net.scilingo.tictactoe.service.contract.Void;

public class TicTacToeServiceImpl implements MovePort {

    private final static TicTacToeManager ticTacToeManager;

    static {
        ticTacToeManager = new TicTacToeManager();
    }

    @Override
    public RecordMoveResponse recordMove(RecordMoveRequest recordMoveRequest) {

        TicTacToeMove recordMove = null;

        if(recordMoveRequest != null){
            final TicTacToeGame existingGame = new TicTacToeGame();
            MoveType move = recordMoveRequest.getMoveParameter();
            if(move != null) {
                existingGame.setId(move.getGameId());
                recordMove = ticTacToeManager.getMoveData(existingGame);
            }

        }

    }

    @Override
    public NewGameResponse newGame(Void newGameRequest) {
        final TicTacToeGame newGame = ticTacToeManager.startNewGame();
        final NewGameResponse newGameResponse = new NewGameResponse();
        final GameResponse gameResponse = new GameResponse();
        final GameType gameType = new GameType();

        gameType.setGameOver(newGame.getGameOver());
        gameType.setId(newGame.getId());
        gameType.setWinnerPlayer(newGame.getWinnerPlayer());
        gameType.setWinnerSymbol(newGame.getWinnerSymbol());
        gameResponse.setGame(gameType);
        gameResponse.setResponseMessage("Creating New Game");
        newGameResponse.setResponse(gameResponse);
        return newGameResponse;
    }

    private boolean setLowerLeftMove(RecordMoveRequest moveRequest, TicTacToeMove recordMoveData) {
        if(!recordMoveData.getLowerLeft().equals("X") && !recordMoveData.getLowerLeft().equals("O")) {
            return true;
        }
        else
            return false;
    }
}
