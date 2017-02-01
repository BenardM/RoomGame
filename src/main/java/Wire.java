import java.util.Random;

/**
 * Created by nicolas on 01/02/17.
 */

public class Wire {

    private String color;
    private int type;

    public Wire() {
        this.color = this.generateColor();
        this.setType(1);
    }

    private String generateColor() {
        Random random = new Random();
        String tabColor[] = {"blanc", "noir", "jaune", "orange", "bleu", "vert", "rouge"};

        return tabColor[random.nextInt(tabColor.length)];
    }

    public String getColor() {
        return color;
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

    public void setColor(String color) {
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type != 1 || type != 2 || type != 3) {
            this.type = type;
        } else {
            this.type = 1;
        }
    }
}