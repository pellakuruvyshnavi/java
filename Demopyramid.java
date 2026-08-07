package day4;

import java.util.Scanner;

public class Demopyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        char alpha = 'Z';

        for (int row = 1; row <= limit; row++) {

            
            for (int space = limit; space >= row; space--) {
                System.out.print(" ");
            }

            
            for (int column = 1; column < (row * 2); column++) {
                System.out.print(alpha + " ");
                alpha--;
                if (alpha < 'A') {
                    alpha = 'Z';   // Restart from Z after A
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}