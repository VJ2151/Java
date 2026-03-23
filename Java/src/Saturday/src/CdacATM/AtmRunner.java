package CdacATM;

import java.util.Scanner;

public class AtmRunner {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
//        BankLogic bank = new BankLogic();

        do{
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();
            if (choice==4){
                break;
            }
            System.out.println("1. Deposit, 2. Withdraw, 3. Balance, 4. Exit.");
            switch (choice){
                case 1:
//                    bank.deposit();
            }
        }while(choice!=4);
    }
}
