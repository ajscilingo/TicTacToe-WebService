
package net.scilingo.tictactoe.service.contract;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "movePort", targetNamespace = "http://tictactoe.scilingo.net/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovePort {


    /**
     * 
     * @param recordMoveRequest
     * @return
     *     returns net.scilingo.tictactoe.service.contract.RecordMoveResponse
     */
    @WebMethod(operationName = "RecordMove")
    @WebResult(name = "RecordMoveResponse", targetNamespace = "http://tictactoe.scilingo.net/move/", partName = "RecordMoveResponse")
    public RecordMoveResponse recordMove(
        @WebParam(name = "RecordMoveRequest", targetNamespace = "http://tictactoe.scilingo.net/move/", partName = "RecordMoveRequest")
        RecordMoveRequest recordMoveRequest);

    /**
     * 
     * @param newGameRequest
     * @return
     *     returns net.scilingo.tictactoe.service.contract.NewGameResponse
     */
    @WebMethod(operationName = "NewGame")
    @WebResult(name = "NewGameResponse", targetNamespace = "http://tictactoe.scilingo.net/move/", partName = "NewGameResponse")
    public NewGameResponse newGame(
        @WebParam(name = "NewGameRequest", targetNamespace = "http://tictactoe.scilingo.net/move/", partName = "NewGameRequest")
        Void newGameRequest);

}
