package HomeWork1.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {

        /** Тесты на проверку работы метода find*/
        int[][] array1 = new int[][]{{1,3,5,7,32},{5,6,2,4,35},{3,54,7,9,88},{4,2,1,1,45},{2,3,4,8,85}};
        int[][] array2 = new int[][]{{99,2,5,7,98},{4,2,5,4,35},{3,54,75,9,88},{4,2,2,9,45},{2,3,33,33,2}};
        int[] result1 = new int[]{1,88,416};
        int[] result2 = new int[]{2,99,625};
        assertArrayEquals(result1,Main.find(array1));
        assertArrayEquals(result2,Main.find(array2));
    }
}