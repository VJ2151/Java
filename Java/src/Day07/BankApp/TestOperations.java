package Day07.BankApp;

import java.util.Scanner;

public class TestOperations {
    public static void main(String[] args) {

        Operation op=new Operation();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{

            System.out.println("\n1.register\n 2.login\n3.exit\n");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    op.register();
                    break;
                case 2:
                    op.login();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid");
            }
        }
            while(true);

    }
}
