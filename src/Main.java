import Decryption.Ceasar;

public class Main {

//    ceasar cypher plus fibonacci sequence
//
    public static void main(String[] args) {
        String text = "oppfjvbikhtygrngpdmfaixoandtfzdvlnnto";

        Ceasar ceasar = new Ceasar();

        System.out.println(ceasar.decrypt(text));
    }
}