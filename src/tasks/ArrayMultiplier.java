package tasks;

public class ArrayMultiplier {
    public static void array3 () {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        for (int j : arr3) {
            System.out.print(j + " ");
        }
    }
    }
