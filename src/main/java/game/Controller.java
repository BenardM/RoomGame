package game;

import java.util.Scanner;

/**
 * Created by Ad on 01/02/2017.
 */
public class Controller {
    Draw d;
    int x;
    int y;
    static int taille=40;
    Bomb.Bouton b1, b2, b3, b4;




    public void dessiner(Draw d) {
        EnigmeTexte E1 = new EnigmeTexte();
        Bouton b1 = new Bouton(175, 70, d.color(255,0,0), 15, 40, 1, 1, "", d);
        Bouton b2 = new Bouton(190, 70, d.color(0,0,0), 15, 40, 1, 2, "", d);
        Bouton b3 = new Bouton(205, 70, d.color(0,0,255), 15, 40, 1, 1, "", d);
        Bouton b4 = new Bouton(220, 70, d.color(0,255,0), 15, 40, 1, 3, "", d);
        d.textSize(26);
        d.text(E1.getTexte(),x+4*taille/3,y+3*taille/4 );

        b1.wire(d);
        b2.wire(d);
        b3.wire(d);
        b4.wire(d);




    }

}
