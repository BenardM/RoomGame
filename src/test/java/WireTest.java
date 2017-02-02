import game.Wire;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nicolas on 01/02/17.
 */
public class WireTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void constructorWorks() throws Exception {
        Wire wire = new Wire();
    }

    @Test
    public void hasColor() throws Exception {
        Wire wire = new Wire();
        assertNotNull(wire.getColor());
    }

    @Test
    public void generateColor() throws Exception {
        String tabColor[] = {"blanc", "noir", "jaune", "orange", "bleu", "vert", "rouge"};
        Wire wire = new Wire();
        assertNotNull(wire.getColor());
    }

    @Test
    public void isPresent() throws Exception {
        Wire wire = new Wire();
        assertEquals(wire.isPresent(wire.getColor()), true);
    }

    @Test
    public void setType() throws Exception {
        Wire wire = new Wire();
        assertEquals(wire.getType(), 1);
    }

    @Test
    public void setWrongType() throws Exception {
        Wire wire = new Wire();
        wire.setType(4);
        assertEquals(wire.getType(), 1);
    }
}