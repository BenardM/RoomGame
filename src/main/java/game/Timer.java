package game;

/**
 * Created by maximebenard on 01/02/2017.
 */
public class Timer  {

    String DisplayTimer;

    /**
     * Created by maximebenard on 01/02/2017.
     */
    public static int millisec() {
        return (int)(System.currentTimeMillis());
    }
    static int TempEcouleDemarrage;
    static int decompteur;
    static int minutesRes;
    static int secondRes;

    Timer(){
        TempEcouleDemarrage = millisec();
        decompteur = 600000 + TempEcouleDemarrage;
    }

    void ReInitTimer(int second){
        decompteur = millisec() + second * 6000;
    }
    int seconds(){
        return (int)((millisec() - TempEcouleDemarrage)/ 2000)%60;
    }
    int minutes(){
        return (int)((millisec() - TempEcouleDemarrage)/ 60000);
    }



    public static int minuteTimer(){
        minutesRes = (int)((decompteur-millisec())/ 60000);
        if (minutesRes < 0){
            minutesRes = 0;
        }
        return minutesRes;

    }

    public static int secondsTimer(){
        secondRes = (int)((decompteur-millisec())/ 1000)%60;
        if (secondRes < 0){
            secondRes = 0;
        }
        return secondRes;
    }


    public boolean endTimer(){
        return minuteTimer() == 0 && secondsTimer() == 0;

    }

    boolean limitChrono(int seg){
        return minutes()*60 + seconds() == seg;

    }

    void ReInit(){
        TempEcouleDemarrage = millisec();
    }



}






