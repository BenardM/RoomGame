package game;

import game.Enigme;
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

    @Test
    public void repIsValide() throws Exception {


        EnigmeMemoire enigmeMemoire = new EnigmeMemoire();
        String var = "";
        for (int i = 0; i< 10; i++) {

            enigmeMemoire.liste[i] = i;

        }
        assertTrue(enigmeMemoire.answerIsCorrect("0;1;2;3;4;5;6;7;8;9"));

    }
     @Test
     public void reponseIsValide()  {
        String reponse = "1;2;3;4;5;6;7;8;9;0";


         EnigmeMemoire enigmeMemoire = new EnigmeMemoire();

         assertTrue(enigmeMemoire.validateReponse(reponse));

     }
    @Test
    public void reponseIsNotValide()  {

        EnigmeMemoire enigmeMemoire = new EnigmeMemoire();

        assertFalse(enigmeMemoire.validateReponse("1;2;3;4;5;6;7;8;9"));
       // assertFalse(enigmeMemoire.validateReponse("1;2;3;4;5;6;7;8;9;A"));

    }

}
