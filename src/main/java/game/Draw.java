package game;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

/**
 * Created by Ad on 01/02/2017.
 */
public class Draw extends PApplet {

        // fenetre graphique et demarrage de l'application

        int taille = 10;
        PImage matrice; // Arene du jeu
        int largeurFen=1000;
        int hauteurFen=700;
        int fps=20;
        int screen=1;
        String path;
        Controller C1= new Controller();
        float xPos;
        float yPos;
        int c;
        float widthB;
        float heightB;
        int pantallaActual;
        int pantallaDesti;
        PFont fontBouton;
        String texte;

        @Override
        public void settings() {
            fullScreen();
        }
        @Override
        public void setup() {
            path = gameImageController();
            matrice = loadImage(path);

            image(matrice, 0, 0);
            frameRate(fps); // Affichage par défaut 20 FPS
            C1.dessiner(this);
            /*wire();*/
        }

        public String gameImageController() {
            switch(screen){
                case 1: path = "./img/bomba.jpg"; break;
                case 2: path = "./img/bum.jpg";break;
                case 3: path = "./img/victory.jpg";break;
            }


        /*    if (chronometre.endTimer()){
                screen = 2;
            }*/

            return path;
        }

    public void winner() {
        String message=String.format("%s is the chosen one");
        fill(255,255,255);
        textSize(32);
        textAlign(CENTER);
        text(message,550,690/2);
    }

    void wire(){
        noStroke();
        fill(c, 255);
        rect(xPos, yPos, widthB, heightB, 5);
        fill(255);
        text (texte, xPos + 10, yPos + 20);

    }

    }

