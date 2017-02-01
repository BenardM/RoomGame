import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nicolas on 31/01/17.
 */
public class EnigmeCalculTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void constructorWorks() {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul("Enigme 1");
    }


    @Test
    public void checkValidate() {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul("Enigme 1");
        enigmeCalcul.setValidate(true);
        assertEquals(true, enigmeCalcul.getValidate());
    }

    @Test
    public void textIsGenerated() throws Exception {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul("Enigme 1");
        assertNotEquals("", enigmeCalcul.getTabTexteCalcul());
        assertNotNull(enigmeCalcul.getTabTexteCalcul());
    }

    @Test
    public void resultatIsCorrect() throws Exception {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul("Enigme 1");
        assertEquals(enigmeCalcul.getResultatCalcul(), enigmeCalcul.genererResultatCalcul(enigmeCalcul.getTabTexteCalcul()));
    }
}