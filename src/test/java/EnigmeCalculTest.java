import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nicolas on 31/01/17.
 */
public class EnigmeCalculTest {
    private EnigmeCalcul enigmeCalcul;
    @Before
    public void setUp() throws Exception {
        enigmeCalcul = new EnigmeCalcul("Enigme 1");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void enigmeIsValidate() {
        enigmeCalcul.setValidate(true);
        assertEquals(true, enigmeCalcul.getValidate());
    }

    @Test
    public void enigmeIsNotValidate() {
        assertEquals(false, enigmeCalcul.getValidate());
    }

    @Test
    public void isInitialized() {
        assertEquals(true, enigmeCalcul.initialized());
    }

    @Test
    public void isGenerated() throws Exception {
        enigmeCalcul.genererCalculs();
        assertNotNull(enigmeCalcul.getTabCalculs());
        assertNotNull(enigmeCalcul.getTabResultats());
    }
}