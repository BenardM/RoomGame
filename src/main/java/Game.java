import processing.core.*;
import processing.core.PApplet;
import processing.core.PGraphics;
/**
 * Created by maximebenard on 31/01/2017.
 */
public class Game extends PApplet {

    public static void main(String args[]) {
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new Bomb());
    }

}
