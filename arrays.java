public class arrays {
    public static void main(String[] args) {
        // ex1
        double[] dou = { 60.4, 78.3, 76.3, 10.86, 23.4 };
        // for (int i = 0; i < dou.length; i++) {
        // System.out.println(dou[i]);
        // }

        // ex2
        // dou[1] *=-1;
        // dou[2] -= 2*dou[2];
        // double minValue = dou[0];
        // for (int i=0; i<dou.length; i++) {
        // if (dou[i] > 0 && dou[i] < minValue) {
        // minValue = dou[i];
        // }
        // if (!(dou[i]==minValue)) {
        // System.out.println(dou[i]);
        // }
        // }
        boolean[] bool = { true, false, true, false, true };
        for (int i = 0; i < dou.length; i++) {
            if (bool[i]) {
                System.out.println(dou[i]);
            }
        }
    }
}
