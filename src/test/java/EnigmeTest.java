import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nicolas on 31/01/17.
 */
public class EnigmeTest {
    private Enigme enigme;
    @Before
    public void setUp() throws Exception {
        this.enigme = new Enigme("Enigme 1");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void enigmeIsValidate() {
        enigme.setValidate(true);
        assertEquals(true, enigme.getValidate());
    }

    @Test
    public void enigmeIsNotValidate() {
        assertEquals(false, enigme.getValidate());
    }

    @Test
    public void isInitialized() {
        assertEquals(true, enigme.initialized());
    }
}