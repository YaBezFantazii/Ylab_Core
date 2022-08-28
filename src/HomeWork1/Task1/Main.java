package HomeWork1.Task1;

public class Main {

    public static void main(String[] args) {
        /** Получаем случайное число на основе текущего времени */
        int rand = Math.abs((int) System.currentTimeMillis());
        rand = rand % 100;

        int[][] arr = new int[5][5];

        /** Заполняем массив arr 5х5 */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                /** С помощью различных условий и вычислений заполняем массив arr числами на основе изначального rand */
                if (rand % 2 == 0) {
                    rand = rand * (j + i + 1) / 3;
                    if (rand > 100) {
                        rand = rand / 5;
                    }
                } else {
                    rand = rand + i + 9 / 3;
                    if (rand > 100) {
                        rand = rand / 5;
                    }
                }
                arr[i][j] = rand;
            }
        }

        /** Печать массива arr */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int result[]= find(arr);

        System.out.println("\n"+"Минимальное число: "+result[0]);
        System.out.println("Максимальное число: "+result[1]);
        System.out.println("Среднее арифметическое: "+(float) result[2]/25);
    }

/** Поиск минимального result[0], максимального result[1] и среднего арифметического result[2] числа*/
    public static int[] find (int[][] arr){
        int[] result = new int[] {arr[0][0] , arr[0][0] , 0} ;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (result[0]>arr[i][j]) {
                    result[0] = arr[i][j];
                }
                if (result[1]<arr[i][j]) {
                    result[1] = arr[i][j];
                }
                result[2] = result[2] + arr[i][j];
            }
        }
        return result;
    }
}
