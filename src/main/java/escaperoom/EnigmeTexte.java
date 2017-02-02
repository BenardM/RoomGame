package escaperoom;

/**
 * Created by Victor on 01/02/2017.
 */
public class EnigmeTexte {


    private String texte;
    private String reponse;

    public EnigmeTexte() {

        this.texte = "le temps\note toujours\nle gout.";
        this.reponse = getReponse();
    }

    public String getTexte() {

        return texte;
    }

    public String findReponse() {
        
        reponse = texte.split("\n")[0].substring(0, 1) + texte.split("\n")[1].substring(0, 1) + texte.split("\n")[2].substring(0, 1);

        return reponse;
        
    }

    public String getReponse() {
        return reponse;
    }
}
