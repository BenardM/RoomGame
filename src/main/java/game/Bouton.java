package game;

import processing.core.PFont;

import static java.awt.Font.createFont;
import static javafx.scene.paint.Color.color;

/**
 * Created by Ad on 02/02/2017.
 */
public class Bouton {
    float xPos;
    float yPos;
    int c;
    float widthB;
    float heightB;
    int pantallaActual;
    int pantallaDesti;
    PFont fontBouton;
    String texte;

    public Bouton(Draw d){
        xPos = d.width/2;
        yPos = d.height/2;
        c = d.color(255);
        widthB = 50;
        heightB = 25;
        //pantall = écran
        pantallaActual = 1;
        pantallaDesti = 2;
        fontBouton = d.createFont("Georgia", 12);
        d.textFont(fontBouton);
        texte = "Boto";
    }
    public Bouton(float x, float y, int col, float w, float h, int inici, int fi, String t, Draw d){
        fontBouton = d.createFont("Georgia", 12);
        d.textFont(fontBouton);
        xPos = x;
        yPos = y;
        c = col;
        widthB = w;
        heightB = h;
        pantallaActual = inici;
        pantallaDesti = fi;
        texte = t;
    }

    void wire(Draw d){
        d.noStroke();
        d.fill(c, 255);
        d.rect(xPos, yPos, widthB, heightB, 5);
        d.fill(255);
        d.text (texte, xPos + 10, yPos + 20);

    }

    void appuyer(Draw d){
        if ((xPos <= d.mouseX && d.mouseX <= xPos + widthB) && (yPos <= d.mouseY && d.mouseY <= yPos + heightB) && d.screen == pantallaActual){
            d.screen = pantallaDesti;
           d.chrono.ReInitTimer(16);
        }
    }
}
