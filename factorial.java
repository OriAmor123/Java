public class factorial {
    public static int factNumber(int num) {
        if (num == 1) {
            return num;
        }
        return num * factNumber(num - 1);
    }
    public static void main(String[] args) {
        int fact = 5;
        System.out.println(factNumber(fact));

    }
}
