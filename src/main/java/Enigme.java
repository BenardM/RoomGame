/**
 * Created by nicolas on 31/01/17.
 */
public class Enigme extends Game {

    private String name;
    private boolean validate;


    public Enigme(String name) {
        this.name = name;
    }

    public static boolean initialized() {
        /* todo */
        return true;
    }

    public boolean getValidate() {
        return validate;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }
}