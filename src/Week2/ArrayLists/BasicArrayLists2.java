package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    /**
     * Create an ArrayList of Integers.
     * Fill up the list with ten random numbers,
     * each from 1 to 100.
     * Then display the contents of the ArrayList on the screen.
     * You must use a loop to fill up the list.
     * However, you may display it the easy way (no loop needed) like so:
     */
    public static void main(String[] args) {
        // Create an ArrayList of Integers.
        ArrayList<Integer> aList = new ArrayList<Integer>();

        // Fill up the list with ten random numbers(1 - 100),
        Random random = new Random();
        for (int i = 0 ; i < 9 ; i++){
            aList.add(random.nextInt(100));
        }
        System.out.println("ArrayList: " + aList);
    }
}
