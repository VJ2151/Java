package exception;

import java.util.Scanner;

public class ArithmaticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number one: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number one: ");
        int num2 = sc.nextInt();

        int result = 0;

        try {//code which might be throw an error
            String name = null;
            System.out.println(name.length());
            result = num1 / num2;


        }
        catch (ArithmeticException a) {
            System.out.println(a.getMessage());
            System.out.println("arithmetic exception occured");
        }
        catch (NullPointerException n) {
            System.out.println(n.getMessage());
            System.out.println("null ptr exception occured");
        }
        catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Cannot DIVIDED BY ZERO");
        }
        finally {
            System.out.println("LOGIC");
        }

        System.out.println(result);
        sc.close();
    }

}
