import game.Bombe;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nicolas on 01/02/17.
 */
public class BombeTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void constructorWorks() throws Exception {
        Bombe bombe = new Bombe();
    }

//    @Test
//    public void genererExplodeWire() throws Exception {
//        Bombe bombe = new Bombe();
//        for(int i = 0; i < bombe.getListWires().size(); i++) {
//            if(bombe.getListWires().get(i).getType() == 3) {
//                assertEquals(bombe.getListWires().get(i).getType(), 3);
//                boolean passe = true;
//            }
//        }
//    }
//
//    @Test
//    public void genererLoseTimeWire() throws Exception {
//        Bombe bombe = new Bombe();
//
//        for(int i = 0; i < bombe.getListWires().size(); i++) {
//            if(bombe.getListWires().get(i).getType() == 2) {
//                assertEquals(bombe.getListWires().get(i).getType(), 2);
//            }
//        }
//    }
}