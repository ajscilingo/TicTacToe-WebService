import net.scilingo.tictactoe.persistence.TicTacToeGame;
import net.scilingo.tictactoe.persistence.TicTacToeMove;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class TicTacToeMoveManager {

    private static final SessionFactory ourSessionFactory;
    private static final Session session;
    private static final String getMoveDataQuery = "Select m from TicTacToeMove m where m.game = :game";

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
            session = getSession();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public TicTacToeMoveManager(){

    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

   public TicTacToeGame startNewGame() {
        Transaction transaction = null;
        TicTacToeGame newGame = null;
        try {
            transaction = session.getTransaction();
            transaction.begin();
            newGame = new TicTacToeGame();
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        finally {
            session.persist(newGame);
            transaction.commit();
        }

        return newGame;
   }

   public TicTacToeMove getMoveData(TicTacToeGame game) {
        final Query q = session.createQuery(getMoveDataQuery);
        q.setParameter("game", game);

        return (TicTacToeMove) q.getSingleResult();
   }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        session.close();
    }

}