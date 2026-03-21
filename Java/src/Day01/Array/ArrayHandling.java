package Day01.Array;

public class ArrayHandling {
    public static void main(String[] args) {
        int iArray[] = new int[5];
        int j = 10;
        System.out.println("your array");

        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = j++;
            System.out.println(iArray[i]);
        }
        System.out.println(iArray);
    }
}
