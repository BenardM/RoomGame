package game;

import game.Enigme;
import game.EnigmeCalcul;
import game.EnigmeMemoire;
import game.EnigmeTexte;

import java.util.Random;

/**
 * Created by Victor on 02/02/2017.
 */
public class Partie {

    Enigme enigme;

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

    public void afficherEnigme() {

        switch(indexEng) {

            case 0:
                System.out.println(enigme.getEnigme());
                break;
            case 1:
                System.out.println(enigme.getEnigme());
                break;
            case 2:
                System.out.println(enigme.getEnigme());
                System.out.println("Veuillez saisir de la façon suivante :\nchiffre;chiffre;chiffre;...");
                break;
        }

    }

    public void finDePartie(String rep) {

        if (enigme.answerIsCorrect(rep)) {

            System.out.println("You WIN ! :D (serpentins, cotillons, toussa toussa)");

        } else {
            System.out.println("You LOOSE ! You DIED ! Try again ! X'D");
        }

    }

    public int getIndexEng() {
        return indexEng;
    }

}
