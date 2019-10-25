package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    /**
     * Create an ArrayList that can hold Integers,
     * and fill each slot with a different random value from 1-50.
     * Display those values on the screen, and then prompt the user for an integer.
     * Search through the ArrayList, and if the item is present,
     * give the slot number where it is located.
     * If the value is not in the ArrayList, display a single message saying so.
     * If the value is present more than once,
     * you may either display the message as many times as necessary,
     * or display a single message giving the last slot number in which it appeared.
     */
    public static void main(String[] args) {
        // Create an ArrayList of Integers.
        ArrayList<Integer> aList = new ArrayList<Integer>();
        boolean found = false;
        // Fill up the list with ten random numbers(1 - 50),
        Random random = new Random();
        for (int i = 0 ; i < 9 ; i++){
            aList.add(random.nextInt(50));
        }
        System.out.println("ArrayList: " + aList);

        // prompt the user for an integer
        System.out.print("Value to find: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        // Search through the ArrayList
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i) == input){
                // if the item is present
                System.out.println(input + " is in the ArrayList " + i + ".");
                found = true;
            }
        }

        // if the value was not found
        if (!found){
            System.out.println(input + " is not in the ArrayList.");
        }

    }
}
