package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    /**
     * Create an array that can hold ten integers,
     * and fill each slot with a different random value from 1-50.
     * Display those values on the screen, and then prompt the user for an integer.
     * Search through the array, and if the item is present,
     * give the slot number where it is located.
     * If the value is not in the array, display a single message saying so.
     * If the value is present more than once,
     * you may either display the message as many times as necessary,
     * or display a single message giving the last slot number in which it appeared.
     */
    public static void main(String[] args) {
        // create two array( 10 int)
        int array[] = new int[11];
        boolean found = false;

        // create a random number (1 - 50)
        Random random = new Random();
        System.out.print("Array: ");
        for (int i = 0; i < array.length -1; i++){
            array[i] =random.nextInt(50);
            // display the contents of Array
            System.out.print(array[i] + " ");
        }
        // prompt the user for an integer
        System.out.print("\nValue to find: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        // Search through the array
        for (int i = 0; i < array.length -1; i++){
            if (array[i] == input){
                // if the item is present
                System.out.println(input + " is in slot " + i + ".");
                found = true;
            }
        }
        if (!found){
            // If the value is not in the array,
            System.out.println(input + " is not in the array.");
        }
    }
}
