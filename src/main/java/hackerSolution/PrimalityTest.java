package hackerSolution;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger nInt= new BigInteger(n);
        System.out.println(nInt.isProbablePrime(1));
        scanner.close();
    }
}
