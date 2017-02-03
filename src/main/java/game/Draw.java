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
            chrono = new Timer();
            C1.dessiner(this);

        }

        public void draw(){
            background(255,0);
            image(matrice, 0, 0);
            fill(255, 0, 0);
            PFont foncrono = createFont("Arial", 30);
            textFont(foncrono);
            text(chrono.minuteTimer()+":"+chrono.secondsTimer(), 175, 180);
            Bouton b1 = new Bouton(175, 70, color(255,0,0), 15, 40, 1, 1, "", this);
            Bouton b2 = new Bouton(190, 70, color(0,0,0), 15, 40, 1, 2, "", this);
            Bouton b3 = new Bouton(205, 70, color(0,0,255), 15, 40, 1, 1, "", this);
            Bouton b4 = new Bouton(220, 70, color(0,255,0), 15, 40, 1, 3, "", this);
            b1.wire(this);
            b2.wire(this);
            b3.wire(this);
            b4.wire(this);
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

