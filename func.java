public class func {
    public static String[] swap(String[] strArray, int index1, int index2, int index3) {
        String tmp = strArray[index1];
        strArray[index1] = strArray[index2];
        strArray[index2] = strArray[index3];
        strArray[index3] = tmp;
        return strArray;
    }

    public static void main(String[] args) {
        String[] str = { "hey", "hello", "whatsapp" };
        String[] ne = swap(str, 0, 1, 2);
        for (String s : ne) {
            System.out.println(s);
            System.out.println("hey");
        }
    }
}