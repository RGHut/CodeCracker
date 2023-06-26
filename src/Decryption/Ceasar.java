package Decryption;


import java.util.HashMap;

public class Ceasar {
    private final HashMap<String, String> shiftList = new HashMap<>();

    public Ceasar() {
        shiftList.put("X", "A");
        shiftList.put("Y", "B");
        shiftList.put("Z", "C");
        shiftList.put("A", "D");
        shiftList.put("B", "E");
        shiftList.put("C", "F");
        shiftList.put("D", "G");
        shiftList.put("E", "H");
        shiftList.put("F", "I");
        shiftList.put("G", "J");
        shiftList.put("H", "K");
        shiftList.put("I", "L");
        shiftList.put("J", "M");
        shiftList.put("K", "N");
        shiftList.put("L", "O");
        shiftList.put("M", "P");
        shiftList.put("N", "Q");
        shiftList.put("O", "R");
        shiftList.put("P", "S");
        shiftList.put("Q", "T");
        shiftList.put("R", "U");
        shiftList.put("S", "V");
        shiftList.put("T", "W");
        shiftList.put("U", "X");
        shiftList.put("V", "Y");
        shiftList.put("W", "Z");

    }

    public String decrypt(String input){
        StringBuilder output = new StringBuilder();
        for (String letter:
             input.split("")) {
            output.append(shiftList.get(letter.toUpperCase()));
        }
        return output.toString();
    }
}
