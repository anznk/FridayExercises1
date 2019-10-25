package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    /**
     * Write a program that creates an ArrayList of Integers.
     * Fill the ArrayList with random numbers from 1 to 100.
     * Display the values in the ArrayList on the screen.
     * Then use a linear search to find the largest value in the ArrayList,
     * and display that value and its slot number.
     */
    public static void main(String[] args) {
        // Create an ArrayList of Integers.
        ArrayList<Integer> aList = new ArrayList<Integer>();
        int tmp = 0;
        int tmpSlot = 0;
        // Fill up the list with ten random numbers(1 - 100),
        Random random = new Random();
        for (int i = 0 ; i < 9 ; i++){
            aList.add(random.nextInt(100));
        }
        System.out.println("ArrayList: " + aList);

        // find LargestValue
        for (int i = 0; i < aList.size(); i++) {

            if (tmp < aList.get(i)){
                tmp = aList.get(i);
                tmpSlot = i;
            }
        }
        // display the largest value
        System.out.print("\nThe largest value is " + tmp + ", which is in slot " + tmpSlot);
    }
}
