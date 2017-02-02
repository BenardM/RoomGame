package game;

import java.util.Random;

/**
 * Created by Ad on 01/02/2017.
 */
public class EnigmeMemoire {
    private int type = 1;
    private int liste[] = new int[10];

    public EnigmeMemoire() {
        this.type = type;
        this.liste = fillliste();
    }

    public int[] fillliste() {

        for (int i = 0 ; i < 10; i++ ) {
            Random random = new Random();
            liste[i] = random.nextInt(101);
        }
        return liste;
    }

    public int[] getListe() {
        return liste;
    }

    public void init() {
        int initListe[] = new int[10];
    }



}
