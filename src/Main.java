import Decryption.Ceasar;
import Decryption.Fibonacci;

import java.util.ArrayList;

public class Main {

//    ceasar cypher plus fibonacci sequence
//
    public static void main(String[] args) {
        String text = "oppfjvbikhtygrngpdmfaixoandtfzdvlnnto";

        ArrayList<Integer> fibonacci = Fibonacci.fibonacci(text.length());

        Ceasar ceasar = new Ceasar();

        System.out.println(ceasar.decrypt(text, fibonacci));
    }
}