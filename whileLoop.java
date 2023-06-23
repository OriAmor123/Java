public class whileLoop {
    public static void main(String[] args) {
         // ex1
        int i = 0;
        while (i < 21) {
            System.out.println(i);
            i++;
        }

        System.out.println();
        // ex2
        i = 20;
        while (i >=0) {
            System.out.print(i + "\t");
            i -=2;
        }
        System.out.println();

        // ex4
        i = 0;
        double j = 1;
        double sum = 0;
        while (i <= 1000000) {
            sum += (1/j);
            j *=2; i++;
        }
        System.out.println(sum);
    }
}
