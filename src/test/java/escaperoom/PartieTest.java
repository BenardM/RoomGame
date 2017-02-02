package escaperoom;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Victor on 02/02/2017.
 */
public class PartieTest {

    @Test
    public void enigmeIsCreate() throws Exception {

        Partie partie = new Partie();

        assertNotNull(partie.getEnigme());

    }
}
