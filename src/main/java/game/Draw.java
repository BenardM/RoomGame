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
        int largeurFen=1148;
        int hauteurFen=693;
        int fps=20;
        Controller C1= new Controller(Controller.taille,Controller.taille,'z','q','s','d');
        Controller C2= new Controller(largeurFen-(4*Controller.taille),Controller.taille,'o','k','l','m');

        @Override
        public void settings() {
            size(largeurFen, hauteurFen); //taille de la fenêtre
        }
        @Override
        public void setup() {
            matrice = loadImage("./img/bomba.jpg");
            image(matrice, 0, 0);
            //demarrage(); // *** Interface de démarrage, mais sous le terminal ***
            frameRate(fps); // Affichage par défaut 20 FPS
        }
    }

