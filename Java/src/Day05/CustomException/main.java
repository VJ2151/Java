package Day05.CustomException;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(sc) {
            System.out.println("Enter name: ");
            String name = sc.next();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter email: ");
            String email = sc.next();
            Emp e = new Emp(name,age,email);
            System.out.println("created");

        }
        catch (AgeException ae){
            System.out.println(ae.getMessage());
        }
        sc.close();

    }
}
