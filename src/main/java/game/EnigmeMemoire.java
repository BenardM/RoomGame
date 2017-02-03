package game;

import java.util.Random;
import java.util.Arrays;
/**
 * Created by Ad on 01/02/2017.
 */
public class EnigmeMemoire implements Enigme {
    private int type = 1;
    int liste[] = new int[10];
    int reponses[] = new int[10];
    Random rdm = new Random();

    public EnigmeMemoire() {
        this.type = type;
        selectTen();
    }


    public int[] getListe() {
        return liste;
    }

    public String getEnigme() {

        String reponse = "";

        for (int i = 0; i < 10; i++) {

            reponse += liste[i] + " ";

        }
        return reponse;
    }

    public void init() {
        int initListe[] = new int[10];
    }


    @Override
    public boolean answerIsCorrect(String reponse) {

        validateReponse(reponse);
        createReponse(reponse);

        Arrays.sort(reponses);

        return Arrays.equals(liste,reponses);
    }

    private void createReponse(String reponse) {
        for (int i = 0; i < 10; i++) {

            String s = reponse.split(";")[i];
            System.out.println("s="+s);
            reponses[i] = Integer.parseInt(s);
        }
    }

    public void selectTen(){
        for(int i=0;i<10;i++){
            liste[i]=rdm.nextInt(101);
            if(i>0){
                for(int j=i-1;j>=0;j--){
                    if(liste[i]==liste[j]){
                        liste[i]=rdm.nextInt(101);
                    }
                }
            }
        }
        Arrays.sort(liste);
    }


    public int[] getReponses() {
        return reponses;
    }

    public boolean validateReponse(String reponse) {
        String[] slices = reponse.split(";");

        boolean lengthValid = slices.length == 10;
        boolean contentValid = true;// f(slices):
        return lengthValid && contentValid;

    }
}
