public class conditionEx {
    
    public static void main(String[] args){
        // ex1
        int num1 = 5;
        if (num1 < 0) {
            System.out.println(num1);
        } 

        // ex2
        int j = -34;
        if (j < 0) {
            System.out.println(-j);
        } else {
            System.out.println(j);
        }

        //ex3
        int k = -6;
        if ((k < 0 || k % 2 == 1) || (k < 0 && k % 2 == -1)) {
            System.out.println(k);
        }

        //ex4
        int l = -11;
        if (l < 0 && l % 2 == -1) {
            System.out.println(l);
        }

        // ex5
        double do1 = 4.5;
        double do2 = 3.7;
        if (do1 < do2) {
            System.out.println(do2);
        } else {
            System.out.println(do1);
        }
        
        //ex6
        double do3 = 99.9;
        if (do3 >= 100) {
            System.out.println(do3);
        } 

        // ex7
        short a = 5;
        short b = 4;
        short c = 10;
        if (a > b) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
