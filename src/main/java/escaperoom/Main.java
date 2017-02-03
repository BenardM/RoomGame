package escaperoom;

import game.EnigmeTexte;

import java.util.Scanner;

/**
 * Created by Victor on 01/02/2017.
 */
public class Main {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        Partie partie = new Partie();
        String reponse;

        partie.afficherEnigme();

        reponse = reader.next();

        partie.finDePartie(reponse);


    }

}
