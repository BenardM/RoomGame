package game;
import processing.core.PApplet;
/**
 * Created by maximebenard on 03/02/2017.
 */
public class question extends PApplet{

    Partie p = new Partie();
    int enigme = p.getIndexEng();

        int currentString = 0;
        String current = "";
        String art1B =  p.enigme.getEnigme();
        String art2B = "";

        int art1Bc= 150;
        int art2Bc= 150;


        int art1Bp;
        int art2Bp;
        public void settings(){
            size(800,500);
        }
        public void setup(){

            background(256);
        }

        public void draw() {

            float art1Bp = textWidth (art1B);

            float art2Bp = textWidth (art2B);
            stroke(100);

            if (mouseX >= 250 && mouseX <= 900 &&
                    mouseY >= 100 && mouseY <= 220) {
                if(mousePressed){
                    currentString = 2;
                    current = art1B;
                }
            }
            fill(art1Bc);
            rect(130,100,650,120,10);

            if (mouseX >= 250 && mouseX <= 900 &&
                    mouseY >= 290 && mouseY <= 410) {
                if(mousePressed){
                    currentString = 4;
                    current = art2B;
                }
            }
            fill(art2Bc);
            rect(130,290,650,120,10);

            fill(0);
            stroke(0);


            if(currentString == 2){
                line(art1Bp+260, 105, art1Bp+260, 125);
                art1B = current;
                art1Bc= 250;
                art2Bc= 150;

            }else if(currentString == 4) {
                line(art2Bp+260, 295, art2Bp+260, 315);
                art2B = current;
                art1Bc =150;
                art2Bc =250;
            }



            fill(0, 102, 153, 51);
            text("R�soudre cette Enigme !!!",250,95);
            textSize(25);
            fill(0, 100, 159, 151);
            text(art1B, 260, 120);
            fill(0, 102, 153, 51);
            text("Votre R�ponse",250,285);
            textSize(25);
            fill(0, 100, 159, 151);
            text(art2B,260,310);

        }

        public void keyPressed() {
            if (keyCode == BACKSPACE) {
                if (current.length() > 0) {
                    current = current.substring(0, current.length()-1);
                }
            } else if (keyCode != SHIFT && keyCode != CONTROL && keyCode != ALT) {
                current = current + key;
            }else  {
                String resp = art2B;
                if (p.finDePartie(resp)==true){
                    Draw d = new Draw();
                    d.gameImageController(3);
                }else  {
                    Draw d = new Draw();
                    d.gameImageController(2);
                }


            }
        }
    }

