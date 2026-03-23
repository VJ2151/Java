import java.util.Scanner;

public class TestOperation {
    public static void main(String[] args) {
        StackOperation s1=new StackOperation();
        Scanner sc = new Scanner(System.in);

        System.out.println(" TEST OPERTAIONS");
        System.out.println("1. PUSH NUMBER ");
        System.out.println("2. POP NUMBER");
        System.out.println("3. PEEK NUMBER");


        System.out.print("ENTER YOUR CHOICE  ");
        int choice = sc.nextInt();
        int value;

        switch (choice) {

            case 1:
                System.out.print("Enter value: ");
                value = sc.nextInt();
                s1.push(value);
                break;

            case 2:
                s1.pop();
                break;

            case 3:
                s1.peek();
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}