package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hello.  What is your name?");
        String name = in.next();
        System.out.print("\nHi, " + name + "!  How old are you?");
        int currentAge = Integer.parseInt(in.next());
        int AgeAfterFive = currentAge + 5;
        int AgeBeferFive = currentAge - 5;
        System.out.println("\nDid you know that in five years you will be " + AgeAfterFive + " years old?");
        System.out.println("And five years ago you were " + AgeBeferFive + "! Imagine that!");


    }
}
