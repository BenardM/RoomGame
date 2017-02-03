import game.Bombe;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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

    @Test
    public void genererExplodeWire() throws Exception {
        Bombe bombe = new Bombe();
        boolean isDone = false;

        for(int i = 0; i < bombe.getListeWires().size(); i++) {
            if(bombe.getListeWires().get(i).getType() == 3) {
                isDone = true;
            }
        }

        assertTrue(isDone);
    }
//
//    @Test
//    public void genererLoseTimeWire() throws Exception {
//        Bombe bombe = new Bombe();
//
//        for(int i = 0; i < bombe.getListWires().size(); i++) {
//            if(bombe.getListeWires().get(i).getType() == 2) {
//                assertEquals(bombe.getListeWires().get(i).getType(), 2);
//            }
//        }
//    }
}