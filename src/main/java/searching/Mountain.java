package searching;

import java.util.Arrays;

public class Mountain {
    private int[] pikes;

    public int[] getPikes() {
        return pikes;
    }

    public void setPikes(int[] pikes) {
        this.pikes = pikes;
    }

    boolean searchPike(Pike pike) {
        return Arrays.binarySearch(pikes, pike.getHeight()) >= 0;
    }
}
