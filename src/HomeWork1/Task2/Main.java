package HomeWork1.Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

        arr = sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort (int[] arr){
            /** Метод сортировки пузырьком */
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
            return arr;
    }

}
