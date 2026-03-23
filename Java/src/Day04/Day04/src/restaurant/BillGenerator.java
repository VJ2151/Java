package restaurant;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant res = new Restaurant();
        int totalbill = 0;
        int choice;
        int quantity;
        System.out.println("Welcome to Restaurant");

        do {
            res.displayMenu();
            System.out.println("enter your choice");
            choice = sc.nextInt();
            System.out.println("ENTER QUANTITY");
            quantity = sc.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    totalbill += res.POHE * quantity;
                    break;
                case 2:
                    totalbill += res.DOSA * quantity;
                    break;
                case 3:
                    totalbill += res.IDLI * quantity;
                    break;
                case 4:
                    totalbill += res.MEDU_VADA * quantity;
                    break;
                case 5:
                    totalbill += res.UPMA * quantity;
                    break;
                default:
                    System.out.println("given choice is invalid");
            }
            System.out.println("TOTALBILL="+ totalbill);
        } while(choice!=0);
            res.displayMenu();
        sc.close();
    }
}