package Decryption;

import java.util.ArrayList;

public class Fibonacci {

    public static ArrayList<Integer> fibonacci(int N) {
        int num1 = 1;
        int num2 = 1;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            fibonacci.add(num1);

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
        return fibonacci;
    }
}
