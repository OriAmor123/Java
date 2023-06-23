public class forLoops {
    
    public static void main(String[] args) {
        
        //ex1
        for (int i = 0; i< 21; i++) {
            System.out.println(i);
        }

        // ex2
        for (int i = 20; i >=0; i-=2) {
            System.out.println(i);
        }

        //ex3
        for (int i = 20; i >=0; i-=2) {
            System.out.print(i + "\t");
        }

        //ex4
        // double sum = 0;
        // double j = 1;
        // for (int i = 0; i <= 1000000; i++, j*=2) {
        //     sum += 1/j;
        // }
        // System.out.println(sum);

        //ex5
        for (int i = 20; i <31; i++) {
            int secondNum = i % 10;
            int firstNum = (i-secondNum) / 10;
            int sumOfI= secondNum + firstNum;
            System.out.print(i + ": ");
            for (int j = 1; j<20; j++) {
                int sumOfJ;
                if (j <10) {
                    sumOfJ = j;
                } else{
                    int secondNum2 = j % 10;
                    int firstNum2 = (j-secondNum2) / 10;
                    sumOfJ = secondNum2 + firstNum2;
                }
                if (sumOfI == sumOfJ) {
                    System.out.print(j + ", ");
                }
            
            }
            System.out.println();
        }
    }
}
