import java.util.ArrayList;

/**
 * Created by nicolas on 01/02/17.
 */
public class Bombe {
    ArrayList<Wire> listWires = new ArrayList<>();

    public Bombe() {
        for(int i = 0; i < 4; i++) {
            this.listWires.add(new Wire());
        }

    }
}
