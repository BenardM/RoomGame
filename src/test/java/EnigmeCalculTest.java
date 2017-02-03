import game.EnigmeCalcul;
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
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul();
    }


    @Test
    public void checkValidate() {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul();
        enigmeCalcul.setValidate(true);
        assertEquals(enigmeCalcul.getIsValidate(), true);
    }

    @Test
    public void textIsGenerated() throws Exception {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul();
        enigmeCalcul.setTexteCalcul("63+37");
        assertEquals(enigmeCalcul.getTexteCalcul().isEmpty(), false);
        assertNotNull(enigmeCalcul.getTexteCalcul());
    }

    @Test
    public void resultatIsCorrect() throws Exception {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul();
        assertEquals(enigmeCalcul.getResultatCalcul(), enigmeCalcul.genererResultatCalcul(enigmeCalcul.getTexteCalcul()));
        assertNotEquals(enigmeCalcul.getResultatCalcul(), 0);
    }

    @Test
    public void answerIsCorrect() throws Exception {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul();
        String answer = String.valueOf(enigmeCalcul.getResultatCalcul());
        assertEquals(enigmeCalcul.answerIsCorrect(answer), true);
    }

    @Test
    public void answerIsWrong() throws Exception {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul();

        // +1 pour le getResultatCalcul afin d'avoir une mauvaise réponse
        String answer = String.valueOf(enigmeCalcul.getResultatCalcul()+1);
        assertEquals(enigmeCalcul.answerIsCorrect(answer), false);
    }


    @Test
    public void scenario() throws Exception {
        EnigmeCalcul enigmeCalcul = new EnigmeCalcul();
        System.out.println("Combien font "  + enigmeCalcul.getTexteCalcul() + " ?");
        System.out.println("Veuillez saisir un nombre :");
        // Remplacement de la saisie utilisateur
        String str = String.valueOf(enigmeCalcul.getResultatCalcul());
        // Vérifie si la saisie utilisateur est correcte au résultat
        enigmeCalcul.answerIsCorrect(str);

        assertEquals(enigmeCalcul.answerIsCorrect(str), true);
        assertEquals(enigmeCalcul.getIsValidate(), true);

        if(enigmeCalcul.getIsValidate()) {
            System.out.println("Vous avez gagné : " + str);
        }
        else {
            System.out.println("Vous avez perdu. La bonne réponse était " + enigmeCalcul.getResultatCalcul());
        }
    }
}