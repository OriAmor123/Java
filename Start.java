

public class Start {
    /*
     * Linear Search:
     * passes each number and search for the wanted value
     */
    public static int linearSearch(int[] arr, int wantedNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == wantedNumber) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Binary Search:
     * checks the middle number
     * if the middle is the wanted value --> returns middle
     * if the value is greater than the middle, eliminates the first half and do the same until the number is found
     * if the value is less than the middle, eliminates the second half and do the same until the number is found
     * if the number isn't found --> returns -1
     */
    public static int binarySearch(int[] arr, int value) {
        int start = 0, end = arr.length -1;
        
        do {
            int middleIndex = (int) Math.floor((start + end) / 2);
            if (value == arr[middleIndex]) {
                return middleIndex;
            } else if (value < arr[middleIndex]) {
                end = middleIndex - 1;
            } else if (value > arr[middleIndex]) {
                start = middleIndex + 1;
            }
            System.out.println("middle is " + middleIndex);
        } while (start <= end);
        return -1;
    }

    /*
     * Insertion Sort
     * taking a number to his correct spot
     * compares a number to the one before it, if the number is bigger, skip. if the number is less, swap between them.
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            if (arr[j] > arr[j-1]) {
                continue;
            }
            // if (arr[j] < arr[j-1])
            while (j > 0 && arr[j] < arr[j-1]) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                j--;
            }
        }
    }

    /*
     * Bubble Sort
     * taking the biggest number to the end of the array
     * compares a number to the one after it, if the number is bigger, swap. if the number is less, skip.
     */
    public static void bubbleSort(int[] arr) {
        for (int j = arr.length - 2; j >= 0; j--) {
            for(int i = 0; i <= j; i++) {
                if (arr[i] == arr[i + 1]) {
                    continue;
                } else if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        
    }

    
    public static void main(String[] args) {
        // int[] arr = {1,3,5,8,12,15,25,36,45,46,48,58,60};
        // int[] arr2 = {3,6,87,23,65,76,23,54,67,45,1,5,9};
        // bubbleSort(arr2);
        // bubbleSort(arr);
        // for (int i : arr2) {
        //     System.out.printf(i + " ");
        // }
    } 
}