package game;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nicolas on 01/02/17.
 */
public class Bombe {
    private ArrayList<Wire> listeWires;
    private Timer timer;

    public Bombe() {
            this.setListeWires(genererWires(4));
            this.setListeWires(genererOneExplodeWire(this.getListeWires()));
            this.setListeWires(genererOneLoseTimeWire(this.getListeWires()));
            this.setTimer(new Timer());
    }

    private ArrayList<Wire> genererWires(int nombreFils) {
        ArrayList<Wire> listeWires = new ArrayList<>();

        for(int i = 0; i < nombreFils; i++) {
            listeWires.add(new Wire());
        }

        return listeWires;
    }

    private ArrayList<Wire> genererOneExplodeWire(ArrayList<Wire> listeWires) {
        Random random = new Random();
        boolean isDone = false;
        int position = 0;

        do {
            position = random.nextInt(listeWires.size());

            if(listeWires.get(position).getType() == 1) {
                listeWires.get(position).setType(3);
                isDone = true;
            }
        } while(!isDone);

        return listeWires;
    }

    private ArrayList<Wire> genererOneLoseTimeWire(ArrayList<Wire> listeWires) {
        Random random = new Random();
        boolean isDone = false;
        int position = 0;

        do {
            position = random.nextInt(listeWires.size());

            if(listeWires.get(position).getType() == 1) {
                listeWires.get(position).setType(2);
                isDone = true;
            }

        } while(!isDone);


        return listeWires;
    }

    public ArrayList<Wire> getListeWires() {
        return listeWires;
    }

    public void setListeWires(ArrayList<Wire> listWires) {
        this.listeWires = listWires;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}
