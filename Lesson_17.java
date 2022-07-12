package lesson14.alisheva26_interface;

import java.util.Arrays;

public class Lesson_17 {
    public static void main(String[] args) {
        int[]array = new int[]{2,3,4,5,6};
        //Arrays.fill(array, 6);

        System.arraycopy(array,2,array,1,2);
        System.out.println(Arrays.toString(array));

        int[]array2 = Arrays.copyOf(array, 9);
        System.out.println(Arrays.toString(array2));
    }
}
