package Decryption;


import java.util.ArrayList;
import java.util.HashMap;

public class Ceasar {
    private final HashMap<Integer, String> alphabet = new HashMap<>();
    private final HashMap<String, Integer> shiftlist = new HashMap<>();

    public Ceasar() {
        alphabet.put(1, "A");
        alphabet.put(2, "B");
        alphabet.put(3, "C");
        alphabet.put(4, "D");
        alphabet.put(5, "E");
        alphabet.put(6, "F");
        alphabet.put(7, "G");
        alphabet.put(8, "H");
        alphabet.put(9, "I");
        alphabet.put(10, "J");
        alphabet.put(11, "K");
        alphabet.put(12, "L");
        alphabet.put(13, "M");
        alphabet.put(14, "N");
        alphabet.put(15, "O");
        alphabet.put(16, "P");
        alphabet.put(17, "Q");
        alphabet.put(18, "R");
        alphabet.put(19, "S");
        alphabet.put(20, "T");
        alphabet.put(21, "U");
        alphabet.put(22, "V");
        alphabet.put(23, "W");
        alphabet.put(24, "X");
        alphabet.put(25, "Y");
        alphabet.put(26, "Z");

        shiftlist.put("A", 1);
        shiftlist.put("B", 2);
        shiftlist.put("C", 3);
        shiftlist.put("D", 4);
        shiftlist.put("E", 5);
        shiftlist.put("F", 6);
        shiftlist.put("G", 7);
        shiftlist.put("H", 8);
        shiftlist.put("I", 9);
        shiftlist.put("J", 10);
        shiftlist.put("K", 11);
        shiftlist.put("L", 12);
        shiftlist.put("M", 13);
        shiftlist.put("N", 14);
        shiftlist.put("O", 15);
        shiftlist.put("P", 16);
        shiftlist.put("Q", 17);
        shiftlist.put("R", 18);
        shiftlist.put("S", 19);
        shiftlist.put("T", 20);
        shiftlist.put("U", 21);
        shiftlist.put("V", 22);
        shiftlist.put("W", 23);
        shiftlist.put("X", 24);
        shiftlist.put("Y", 25);
        shiftlist.put("Z", 26);

    }

    private String shift(String input, int number){
        int shiftedNumber;
        int inputNumber = shiftlist.get(input.toUpperCase());
        int n1 = (inputNumber - number);
        while (n1 <= 0) {
            n1 = 26 + n1;
        }
        shiftedNumber = n1;
        return alphabet.get(shiftedNumber);
    }

    public String decrypt(String input, ArrayList<Integer> fibonacciSequence){
        String[] inputList = input.split("");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < inputList.length; i++) {
            output.append(shift(inputList[i], fibonacciSequence.get(i)));
        }
        return output.toString();
    }

}
