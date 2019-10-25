package Week2.Arrays;

import java.util.Random;

public class FindingTheLargestValue {
    /**
     * Write a program that creates an array which can hold ten values.
     * Fill the array with random numbers from 1 to 100.
     * Display the values in the array on the screen.
     * Then use a linear search to find the largest value in the array,
     * and display that value.
     */
    public static void main(String[] args) {
        // create two array( 10 int)
        int array[] = new int[11];
        int tmp = 0;

        // create a random number
        Random random = new Random();
        // Fill the array with random numbers from 1 to 100.
        System.out.print("Array: ");
        for (int i = 0; i < array.length -1; i++){
            array[i] =random.nextInt(100);

            // find LargestValue
            if (tmp < array[i]){
                tmp = array[i];
            }
            // display the contents of Array
            System.out.print(array[i] + " ");
        }

        // display the largest value
        System.out.print("\nThe largest value is " + tmp);
    }
}
