package game;

import java.util.Random;

/**
 * Created by nicolas on 01/02/17.
 */

public class Wire {

    float xPos;
    float yPos;
    int c;
    private String color;
    private int type;
    private boolean isCut;

    public Wire() {
        this.generateColor();
        this.setType(1);
        this.setCut(false);
    }

    private void generateColor() {
        Random random = new Random();
        String tabColor[] = {"blanc", "noir", "jaune", "orange", "bleu", "vert", "rouge"};
        setColor(tabColor[random.nextInt(tabColor.length)]);
    }



    public boolean isPresent(String color) {
        String tabColor[] = {"blanc", "noir", "jaune", "orange", "bleu", "vert", "rouge"};
        boolean present = false;

        for (int i = 0; i < tabColor.length; i++) {
            if (tabColor[i] == color) {
                present = true;
            }
        }

        return present;
    }

    public boolean isCut() {
        return isCut;
    }

    public void setCut(boolean cut) {
        isCut = cut;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type != 1 || type != 2 || type != 3) {
            this.type = 1;
        } else {
            this.type = type;
        }
    }
}