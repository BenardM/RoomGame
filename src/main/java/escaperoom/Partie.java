package escaperoom;

import game.Enigme;
import game.EnigmeCalcul;
import game.EnigmeMemoire;
import game.EnigmeTexte;

import java.util.Random;

/**
 * Created by Victor on 02/02/2017.
 */
public class Partie {

    private Enigme enigme;

    private Random rdm = new Random();
    private int indexEng;


    public Partie() {

        indexEng = rdm.nextInt(3);
        createEnigme();
    }


    public Object getEnigme() {

        return enigme;
    }

    public void createEnigme() {

        switch(indexEng) {

            case 0:
                enigme = new EnigmeTexte();
                break;
            case 1:
                enigme = new EnigmeCalcul();
                break;
            case 2:
                enigme = new EnigmeMemoire();
                break;
        }

    }


    public void finDePartie(String rep) {

        switch (indexEng) {

            case 0:

                if (enigme.answerIsCorrect(rep)) {

                    System.out.println("You WIN ! :D (serpentins, cotillons, toussa toussa)");

                } else {
                    System.out.println("You LOOSE ! You DIED ! Try again ! X'D");
                }
                break;
            case 1:

                if (enigme.answerIsCorrect(rep)) {

                    System.out.println("You WIN ! :D (serpentins, cotillons, toussa toussa)");

                } else {
                    System.out.println("You LOOSE ! You DIED ! Try again ! X'D");
                }
                break;
            case 2:

                if (enigme.answerIsCorrect(rep)) {

                    System.out.println("You WIN ! :D (serpentins, cotillons, toussa toussa)");

                } else {
                    System.out.println("You LOOSE ! You DIED ! Try again ! X'D");
                }
                break;
        }

    }

    public int getIndexEng() {
        return indexEng;
    }

}
