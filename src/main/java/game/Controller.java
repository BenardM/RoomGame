package game;

import processing.core.PApplet;
import processing.core.PGraphics;

/**
 * Created by Ad on 01/02/2017.
 */
public class Controller {
    Draw d;
    int x;
    int y;
    static int taille=40;




    public void dessiner(Draw d) {

        //String question;
        //String reponse;
        //Integer reponseInt;

        String[] args = {"TwoFrameTest"};
        question c = new question();
        PApplet.runSketch(args,c);













    }

}
