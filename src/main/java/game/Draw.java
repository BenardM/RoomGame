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
        Timer chrono;
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
            chrono = new Timer();

        }

        public void draw(){
            background(255,0);
            image(matrice, 0, 0);
            fill(255, 0, 0);
            PFont foncrono = createFont("Arial", 30);
            textFont(foncrono);
            text(chrono.minuteTimer()+":"+chrono.secondsTimer(), 175, 180);
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
}

