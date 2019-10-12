package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        int number = Integer.parseInt(in.nextLine());
        int sum = 0;
        while(number != 0){
            sum += number;
            System.out.println("The total so far is " + sum);
            System.out.print("Number: ");
            number = Integer.parseInt(in.nextLine());

        }
        System.out.print("\nThe total is " + sum + ".");
    }
}
