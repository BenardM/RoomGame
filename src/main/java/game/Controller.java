package game;

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
        d.textSize(26);
        d.text(E1.getTexte(),x+4*taille/3,y+3*taille/4 );




    }

}
