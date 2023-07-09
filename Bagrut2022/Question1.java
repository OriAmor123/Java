package Bagrut2022;

public class Question1 {
    public static int[] multiply(int[] arr1, int[] arr2) {
        int k = Math.min(arr1.length, arr2.length);
        int m = Math.max(arr1.length, arr2.length); 
        int[] arr3 = new int[m];
        
        for (int i = 0; i < k; i++) {
            arr3[i] = arr1[i] * arr2[i];
        }
        for (int i = k; i < m; i++) {
            if (arr1.length > arr2.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i];
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,6,7,-8,3,0};
        int[] arr2 = {2,6,8,-2,-7,3,8,2};
        int[] arr3 = multiply(arr1, arr2);
        
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
