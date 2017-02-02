package game;

import processing.core.PApplet;
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
        Controller C1= new Controller();

        @Override
        public void settings() {
            size(largeurFen, hauteurFen); //taille de la fenêtre
        }
        @Override
        public void setup() {
            matrice = loadImage("./img/bomba.jpg");
            image(matrice, 0, 0);
            frameRate(fps); // Affichage par défaut 20 FPS
            C1.dessiner(this);
        }
    }

