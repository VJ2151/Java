package ASSIGNMENTS.ASS1and2;

import java.util.Scanner;

public class Factorial {
    public int facto(int n) {
        if (n <= 1) return 1;
        return n * facto(n - 1);
    }

    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number to find its ASSIGNMENTS.ASS1and2.Factorial: ");
        int n = sc.nextInt();
        System.out.println("factorial of given number is "+ f1.facto(n));
        sc.close();
    }
}
