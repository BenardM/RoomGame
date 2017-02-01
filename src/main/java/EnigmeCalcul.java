import java.util.Random;

/**
 * Created by nicolas on 31/01/17.
 */
public class EnigmeCalcul extends Enigme {

    private int resultatCalcul;
    private String texteCalcul;

    public EnigmeCalcul (String name) {
        super(name);

        // Valorisation de tabTexteCalcul[] et resultatTexte
        this.texteCalcul = this.genererTexteCalcul();
        this.resultatCalcul = this.genererResultatCalcul(this.texteCalcul);
    }

    public String genererTexteCalcul() {
        char tabOperateurs[] = {'+', '-', '*', '/'};
        String texteCalcul;
        Random random = new Random();

        texteCalcul = Integer.toString(random.nextInt(100) + 1) + String.valueOf(tabOperateurs[random.nextInt(4)]) + Integer.toString(random.nextInt(100) + 1);

        return texteCalcul;
    }

    public int genererResultatCalcul(String texteCalcul) {
        char operateurExtrait = 0;
        int positionOperateurExtrait = 0;

        for (int i = 0; i < texteCalcul.length(); i++) {
            if (isPresent(texteCalcul.charAt(i))) {
                operateurExtrait = texteCalcul.charAt(i);
                positionOperateurExtrait = i;
            }
        }

        int nombre1 = Integer.parseInt(texteCalcul.substring(0, positionOperateurExtrait));
        int nombre2 = Integer.parseInt(texteCalcul.substring(positionOperateurExtrait+1, texteCalcul.length()));

        switch(operateurExtrait) {
            case '*':
                resultatCalcul = nombre1 * nombre2;
                break;
            case '/':
                resultatCalcul = nombre1 / nombre2;
                break;
            case '+':
                resultatCalcul = nombre1 + nombre2;
                break;
            case '-':
                resultatCalcul = nombre1 - nombre2;
                break;
            default:
                resultatCalcul = 0;
        }

        return resultatCalcul;
    }

    public boolean answerIsCorrect(String answer) {
        boolean isCorrect = false;

        if (answer.equals(String.valueOf(this.getResultatCalcul()))) {
            isCorrect = true;
        }

        return isCorrect;
    }
    public int getResultatCalcul() {
        return resultatCalcul;
    }

    public void setResultatCalcul(int resultatCalcul) {
        this.resultatCalcul = resultatCalcul;
    }

    public String getTexteCalcul() {
        return texteCalcul;
    }

    public void setTexteCalcul(String texteCalcul) {
        this.texteCalcul = texteCalcul;
    }

    public boolean isPresent(char caractere) {
        char tabOperateurs[] = {'+', '-', '*', '/'};
        boolean present = false;

        for (int i = 0; i < tabOperateurs.length; i++) {
            if (tabOperateurs[i] == caractere) {
                present = true;
            }
        }

        return present;
    }
}