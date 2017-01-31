/**
 * Created by nicolas on 31/01/17.
 */
public class Enigme extends Game {

    private String name;
    private boolean validate;


    public Enigme(String name) {
        this.name = name;
        this.validate = false;
    }

    public static boolean initialized() {
        return true;
    }

    public boolean getValidate() {
        return validate;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }
}