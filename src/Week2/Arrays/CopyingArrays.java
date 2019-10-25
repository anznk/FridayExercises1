package Week2.Arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class CopyingArrays {
    /**
     * Write a program that creates an array of ten integers.
     * It should put ten random numbers from 1 to 100 in the array.
     * It should copy all the elements of that array into another array of the same size.
     * Then display the contents of both arrays. To get the output to look like mine,
     * you'll need a several for loops.
     */
    public static void main(String[] args) {
        // create two array( 10 int)
        int array1[] = new int[11];
        int array2[] = new int[11];

        // create a random number (1 - 100)
        Random random = new Random();

        System.out.print("Array 1: ");
        for (int i = 0; i < array1.length -1; i++){
            array1[i] =random.nextInt(100);
            // display the contents of Array1
            System.out.print(array1[i] + " ");
        }

        // copy all the elements Array1 to Array2

        System.out.print("\nArray 2: ");
        for (int i = 0; i < array1.length -1; i++){
            array2[i] = array1[i];
            // display the contents of Array2
            System.out.print(array2[i] + " ");
        }
    }
}
