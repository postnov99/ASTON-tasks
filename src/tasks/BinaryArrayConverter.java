package tasks;

public class BinaryArrayConverter {
    public static void array1 () {
        int[] arr1 = {0, 0, 0, 1, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (arr1[i] == 0) ? 1 : 0;
        }
        for (int j : arr1) {
            System.out.print(j + " ");
        }
    }
}
