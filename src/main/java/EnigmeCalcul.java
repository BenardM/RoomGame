import java.util.Arrays;
import java.util.Random;

/**
 * Created by nicolas on 31/01/17.
 */
public class EnigmeCalcul extends Enigme {

    private int tabResultats[];
    private String tabCalculs[];

    public EnigmeCalcul (String name) {
        super(name);
        genererCalculs();
    }

    public void genererCalculs() {
        char tabOperateurs[] = {'+', '-', '*', '/'};

        Random rdm = new Random();

        for (int i = 0; i < 2; i++) {
            this.tabResultats[i] = rdm.nextInt(100) + tabOperateurs[rdm.nextInt(4)] + rdm.nextInt(100);
            this.tabCalculs[i] = Integer.toString(rdm.nextInt(100)) + tabOperateurs[rdm.nextInt(4)] + Integer.toString(rdm.nextInt(100));
        }
    }

    public int[] getTabResultats() {
        return tabResultats;
    }

    public void setTabResultats(int[] tabResultats) {
        this.tabResultats = tabResultats;
    }

    public String[] getTabCalculs() {
        return tabCalculs;
    }

    public void setTabCalculs(String[] tabCalculs) {
        this.tabCalculs = tabCalculs;
    }

    @Override
    public String toString() {
        return "Calcul{" +
                "tabResultats=" + Arrays.toString(tabResultats) +
                ", tabCalculs=" + Arrays.toString(tabCalculs) +
                '}';
    }
}


