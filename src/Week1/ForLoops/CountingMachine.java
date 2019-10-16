package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count to: ");
        int num = Integer.parseInt(in.nextLine());
        for (int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }

    }
}
