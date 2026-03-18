package Assignments01;
import java.util.*;
public class PrimeNumber {
    public boolean findPrimeNumber(int input) {
        double squareroot = Math.sqrt(input);

        for (int i = 2; i <= squareroot; i++) {
            if (input % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input: ");
        int input = sc.nextInt();
        PrimeNumber PrimeNumber = new PrimeNumber();
        boolean s1 = PrimeNumber.findPrimeNumber(input);
        if (s1)
            System.out.println("prime");
        else
            System.out.println("Not prime");
    }
}
