package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello.  What is your name?");
        String name = in.nextLine();
        System.out.println("\nHi, " + name + "!  How old are you?");
        int age = Integer.parseInt(in.nextLine());
        System.out.println("\n\nSo you're " + age + ", eh?  That's not old at all!\nHow much do you make, " + name + "?");
        double salary = Double.parseDouble(in.nextLine());
        System.out.println("\n" + salary + "!  I hope that's per hour and not per year! LOL!");
    }
}
