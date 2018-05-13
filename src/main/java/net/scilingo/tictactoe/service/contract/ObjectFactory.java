
package net.scilingo.tictactoe.service.contract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.scilingo.tictactoe.service.contract package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NewGameRequest_QNAME = new QName("http://tictactoe.scilingo.net/move/", "NewGameRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.scilingo.tictactoe.service.contract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecordMoveResponse }
     * 
     */
    public RecordMoveResponse createRecordMoveResponse() {
        return new RecordMoveResponse();
    }

    /**
     * Create an instance of {@link MoveResponse }
     * 
     */
    public MoveResponse createMoveResponse() {
        return new MoveResponse();
    }

    /**
     * Create an instance of {@link Void }
     * 
     */
    public Void createVoid() {
        return new Void();
    }

    /**
     * Create an instance of {@link NewGameResponse }
     * 
     */
    public NewGameResponse createNewGameResponse() {
        return new NewGameResponse();
    }

    /**
     * Create an instance of {@link GameResponse }
     * 
     */
    public GameResponse createGameResponse() {
        return new GameResponse();
    }

    /**
     * Create an instance of {@link RecordMoveRequest }
     * 
     */
    public RecordMoveRequest createRecordMoveRequest() {
        return new RecordMoveRequest();
    }

    /**
     * Create an instance of {@link MoveType }
     * 
     */
    public MoveType createMoveType() {
        return new MoveType();
    }

    /**
     * Create an instance of {@link GameType }
     * 
     */
    public GameType createGameType() {
        return new GameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tictactoe.scilingo.net/move/", name = "NewGameRequest")
    public JAXBElement<Void> createNewGameRequest(Void value) {
        return new JAXBElement<Void>(_NewGameRequest_QNAME, Void.class, null, value);
    }

}
