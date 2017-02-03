package game;

import java.util.Random;

/**
 * Created by nicolas on 01/02/17.
 */

public class Wire {

    private float xPos;
    private float yPos;
    private int color;
    private int type;
    private boolean isCut;

    public Wire() {
        this.generateColor();
        this.setType(1);
        this.setCut(false);
    }

    public void generateColor() {
        Random random = new Random();
        this.setColor(random.nextInt(256));
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

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        if (color >= 0 && color <= 255) {
            this.color = color;
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type < 1 || type > 3) {
            this.type = 1;
        } else {
            this.type = type;
        }
    }

    public float getxPos() {
        return xPos;
    }

    public void setxPos(float xPos) {
        this.xPos = xPos;
    }

    public float getyPos() {
        return yPos;
    }

    public void setyPos(float yPos) {
        this.yPos = yPos;
    }
}