public class bagrut {
    // A
    public static boolean equalIndex(int[] arr, int index) {
        int sumBefore = 0, sumAfter = 0;
        for (int i = 0; i < index; i++) {
            sumBefore += arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            sumAfter += arr[i];
        }
        return sumAfter == sumBefore;
    }

    public static boolean equalArray(int[] arr) {
        boolean arrayIsEqual = false;
        
        for (int i = 0; i < arr.length; i++) {
            arrayIsEqual = equalIndex(arr, i);
            if (arrayIsEqual) {
                break;
            }
        }

        return arrayIsEqual;
    }
}