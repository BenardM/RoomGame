package escaperoom;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Victor on 01/02/2017.
 */
public class EnigmeTexteTest {

    @Test
    public void firstTest() throws Exception {
        EnigmeTexte enigmeTexte = new EnigmeTexte();

        assertNotNull(enigmeTexte.getTexte());

    }

    @Test
    public void resultatIsValide() throws Exception {

        EnigmeTexte enigmeTexte = new EnigmeTexte();

        assertEquals(enigmeTexte.findReponse(), enigmeTexte.getReponse());
    }

    @Test
    public void texteNotIsEmpty() throws Exception {

        EnigmeTexte enigmeTexte = new EnigmeTexte();
        assertNotNull(enigmeTexte.getTexte());

    }
}
