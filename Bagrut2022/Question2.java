package Bagrut2022;

public class Question2 {
    public static boolean isPerfect(int[] arr) {
        int index = arr[0];
        int numInIndex;
        int scan = 0;
        arr[0] = -1;
        while (index != 0) {
            numInIndex = arr[index];
            arr[index] = -1;
            index = numInIndex;
            scan++;
            if (scan == arr.length-1) {
                break;
            }
        }
        if (scan < arr.length - 1) {
            return false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != -1) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,6,0,2};
        int[] arr2 = {1,2,5,1,3,4};
        int[] arr3 = {2,2,3,2,0};
        System.out.println(isPerfect(arr));
        System.out.println(isPerfect(arr2));
        System.out.println(isPerfect(arr3));
    }
}
