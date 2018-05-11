package net.scilingo.tictactoe.service.impl;

import net.scilingo.tictactoe.service.contract.MovePort;
import net.scilingo.tictactoe.service.contract.MoveResponse;
import net.scilingo.tictactoe.service.contract.RecordMoveRequest;
import net.scilingo.tictactoe.service.contract.RecordMoveResponse;

public class TicTacToeMoveService implements MovePort {

    /**
     *
     * @param recordMoveRequest
     * @return RecordMoveResponse
     */

    @Override
    public RecordMoveResponse recordMove(RecordMoveRequest recordMoveRequest) {
        RecordMoveResponse response = new RecordMoveResponse();

    }
}
