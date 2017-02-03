package escaperoom;

import java.util.Scanner;

/**
 * Created by Victor on 01/02/2017.
 */
public class Main {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);

        EnigmeTexte enigmeTexte = new EnigmeTexte();

        System.out.println(enigmeTexte.getTexte());

        String rep = reader.next();

        if (enigmeTexte.findReponse().equals(rep)) {
            System.out.println("WIN ! :*");
        } else {
            System.out.println("LOOSE ! X'D");
        }



    }

}
