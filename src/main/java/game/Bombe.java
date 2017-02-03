package game;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nicolas on 01/02/17.
 */
public class Bombe {
    ArrayList<Wire> listWires = new ArrayList<>();
//    ArrayList<Enigme> listeEnigmes = new ArrayList<>();

    public Bombe() {
            this.genererWires(4);
    }

    private void genererWires(int nombreFils) {
        for(int i = 0; i < nombreFils; i++) {
            this.listWires.add(new Wire());
        }

        this.genererExplodeWire();
        //this.genererLoseTimeWire();
    }

    private void genererExplodeWire() {
        Random random = new Random();
        listWires.get(random.nextInt(listWires.size())).setType(3);
    }

//    private void genererLoseTimeWire() {
//    }

    public ArrayList<Wire> getListWires() {
        return listWires;
    }

    public void setListWires(ArrayList<Wire> listWires) {
        this.listWires = listWires;
    }
}
