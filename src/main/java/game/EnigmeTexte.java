package game;

/**
 * Created by Victor on 01/02/2017.
 */
public class EnigmeTexte {


    private String texte;
    private String reponse;

    public EnigmeTexte() {

        this.texte = "koala faché\ncache toujours\nderrière l'arbre\nquelque chose.";
        this.reponse = findReponse();
    }

    public String getTexte() {

        return texte;
    }

    public String findReponse() {

        this.reponse = "";

        for (int i = 0; i < texte.split("\n").length; i++) {

            this.reponse += texte.split("\n")[i].substring(0, 1);

        }
        return reponse;
    }

    public String getReponse() {
        return reponse;
    }
}
