package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String name = in.nextLine();
        System.out.print("Ok, " + name + ", how old are you?");
        int age = Integer.parseInt(in.nextLine());
        if (age >=25){
            System.out.println("\nYou can do pretty much anything, " + name + ".");
        } else if (age >= 18 && age <= 24){
            System.out.println("\nYou can vote but not rent a car, " + name + ".");
        } else if (age >= 16 && age <= 17){
            System.out.println("\nYou can drive but not vote, " + name + ".");
        } else {
            System.out.println("\nYou can't drive, " + name + ".");
        }
    }
}
