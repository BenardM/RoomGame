package game;

/**
 * Created by Ad on 01/02/2017.
 */
public class Controller {
    Draw d;
    int x;
    int y;
    static int taille=40;
    char H;
    char G;
    char B;
    char D;

    public Controller(int x, int y, char H, char G, char B, char D) {
        this.x = x;
        this.y = y;
        this.H = H;
        this.G = G;
        this.B = B;
        this.D = D;
    }



    public void dessiner(Draw d) {
        d.stroke(255,255,255);
        d.strokeWeight(3);
        d.noFill();
        d.textSize(26);
        d.rect(x+taille,y,taille,taille);
        d.text(H,x+4*taille/3,y+3*taille/4 );

        d.rect(x,y+taille,taille,taille);
        d.text(G,x+taille/3,y+7*taille/4 );

        d.rect(x+taille,y+taille,taille,taille);
        d.text(B,x+4*taille/3,y+7*taille/4 );

        d.rect(x+2*taille,y+taille,taille,taille);
        d.text(D,x+7*taille/3,y+7*taille/4 );
    }
}
