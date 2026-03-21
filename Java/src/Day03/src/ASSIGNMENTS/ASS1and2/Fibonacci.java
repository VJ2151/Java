package ASSIGNMENTS.ASS1and2;

import java.util.Scanner;

public class Fibonacci {

    public void printFibSeries(int n) {
        int first = 0;
        int second = 1;

        System.out.print("ASSIGNMENTS.ASS1and2.Fibonacci Series: \n");

        for (int i = 1; i <= n; i++) {
            System.out.println(i+" : "+first);

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fb = new Fibonacci();

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        fb.printFibSeries(n);

        sc.close();
    }
}