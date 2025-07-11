package JavaTutorialsCWH;

import java.util.Scanner;

public class AlphaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            char ch = (char) ('E' - i); // Start from the Nth letter
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; // Move to the previous alphabet
            }
            System.out.println();
        }
    }
}
