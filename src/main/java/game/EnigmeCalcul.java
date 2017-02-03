package game;

import java.util.Random;

/**
 * Created by nicolas on 31/01/17.
 */
public class EnigmeCalcul implements Enigme {

    private boolean isValidate;
    private int resultatCalcul; // Résultat du calcul
    private String texteCalcul; // Calcul sous forme de String

    public EnigmeCalcul () {

        this.setValidate(false);
        this.texteCalcul = this.genererTexteCalcul();
        this.resultatCalcul = this.genererResultatCalcul(this.texteCalcul);
    }

    /**
     * @return texteCalcul
     * Retourne un calcul avec 2 nombres et un opérateur sous forme de texte
     */
    public String genererTexteCalcul() {
        char tabOperateurs[] = {'+', '-', '*', '/'};
        String texteCalcul;
        Random random = new Random();

        texteCalcul = Integer.toString(random.nextInt(100) + 1) + String.valueOf(tabOperateurs[random.nextInt(4)]) + Integer.toString(random.nextInt(100) + 1);

        return texteCalcul;
    }

    /**
     * @param texteCalcul
     * @return resultatCalcul
     * Retourne le résultat en entier d'un calcul avec opérateur d'un String
     */
    public int genererResultatCalcul(String texteCalcul) {
        char operateurExtrait = 0;
        int positionOperateurExtrait = 0;

        /* Parcours de la String du texteCalcul
           afin de chercher la position de l'opérateur
        */
        for (int i = 0; i < texteCalcul.length(); i++) {
            if (isPresent(texteCalcul.charAt(i))) {
                operateurExtrait = texteCalcul.charAt(i);
                positionOperateurExtrait = i;
            }
        }

        // Valorisation de nombre1 et nombre2 en fonction de leur position par rapport à l'opérateur
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

    /**
     * @param answer
     * @return isCorrect
     * Retourne true si la réponse est correcte au résultat
     * Passe la propriété privée validate de l'énigme à true
     */
    public boolean answerIsCorrect(String answer) {

        if (answer.equals(String.valueOf(this.getResultatCalcul()))) {
            this.setValidate(true);
        }

        return this.getIsValidate();
    }
    /**
     * @param caractere
     * @return present
     * Vérifie si un caractère est présent dans un tableau d'opérateurs
     */
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

    public boolean getIsValidate() {
        return isValidate;
    }

    public void setValidate(boolean validate) {
        isValidate = validate;
    }
}
