import java.util.Random;

/**
 * Created by nicolas on 31/01/17.
 */
public class EnigmeCalcul extends Enigme {

    private int resultatCalcul;
    private String tabTexteCalcul[];

    public EnigmeCalcul (String name) {
        super(name);

        // Valorisation de tabTexteCalcul[]
        this.tabTexteCalcul = genererTexteCalcul();
        this.resultatCalcul = genererResultatCalcul(this.tabTexteCalcul);
    }

    public String[] genererTexteCalcul() {
        String tabTexteCalcul[] = new String[3];
        Random random = new Random();
        char tabOperateurs[] = {'+', '-', '*', '/'};

        for(int i = 0; i < 3; i++) {
            if ((i % 2) == 0) {
                tabTexteCalcul[i] = Integer.toString(random.nextInt(100) + 1);
            } else {
                tabTexteCalcul[i] = Integer.toString(tabOperateurs[random.nextInt(4)]);
            }
        }

        return tabTexteCalcul;
    }

    public int genererResultatCalcul(String[] tabTexteCalcul) {

        String operateurExtrait = tabTexteCalcul[1];
        int nombre1 = Integer.parseInt(tabTexteCalcul[0]);
        int nombre2 = Integer.parseInt(tabTexteCalcul[2]);

        switch(operateurExtrait) {
            case "*":
                resultatCalcul = nombre1 * nombre2;
                break;
            case "/":
                resultatCalcul = nombre1 / nombre2;
                break;
            case "+":
                resultatCalcul = nombre1 + nombre2;
                break;
            case "-":
                resultatCalcul = nombre1 - nombre2;
                break;
        }

        return resultatCalcul;
    }

    public int getResultatCalcul() {
        return resultatCalcul;
    }

    public void setResultatCalcul(int resultatCalcul) {
        this.resultatCalcul = resultatCalcul;
    }

    public String[] getTabTexteCalcul() {
        return tabTexteCalcul;
    }

    public void setTabTexteCalcul(String[] tabTexteCalcul) {
        this.tabTexteCalcul = tabTexteCalcul;
    }
}


