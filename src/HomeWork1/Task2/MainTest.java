package HomeWork1.Task2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sort() {
        /** Тесты на проверку работы метода sort, в том числе и с дубликатами (дополнительное задание)*/
        int[] test1 = new int[]{5,6,3,2,5,1,4,9};
        int[] test2 = new int[]{11,25,33,25,11,54,4,4,54,25};
        int[] test3 = new int[]{11,42,44,9,5,2,2,44,3,4,3,6};
        int[] test4 = new int[]{4,7,3,3,11,3,2,4};
        int[] test5 = new int[]{11,13,13,14,12,1,4,5};

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 6, 9}, Main.sort(test1));
        assertArrayEquals(new int[]{4, 4, 11, 11, 25, 25, 25, 33, 54, 54}, Main.sort(test2));
        assertArrayEquals(new int[]{2, 2, 3, 3, 4, 5, 6, 9, 11, 42, 44, 44}, Main.sort(test3));
        assertArrayEquals(new int[]{2, 3, 3, 3, 4, 4, 7, 11}, Main.sort(test4));
        assertArrayEquals(new int[]{1, 4, 5, 11, 12, 13, 13, 14}, Main.sort(test5));

    }
}