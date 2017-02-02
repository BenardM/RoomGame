import game.EnigmeMemoire;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ad on 01/02/2017.
 */
public class EnigmeMemoireTest {
    @Test
    public void fillliste() throws Exception {
        EnigmeMemoire enigmeMemoire = new EnigmeMemoire();

    }

    @Test
    public void getListe() throws Exception {
        EnigmeMemoire enigmeMemoire = new EnigmeMemoire();
        assertEquals(10, enigmeMemoire.getListe().length);
    }


}
