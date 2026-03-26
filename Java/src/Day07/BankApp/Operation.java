package Day07.BankApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    ArrayList<User> users = new ArrayList<>();;
    Scanner sc = new Scanner(System.in);
    Encryption e=new Encryption();

    public void register(){
        System.out.print("enter username: ");
        String uname = sc.next();

        System.out.print("enter password: ");
        String pwd = sc.next();

        System.out.print("enter balance: ");
        double bal = sc.nextDouble();

        String encryptedPwd = e.encrypt(pwd);

        User newUser = new User(uname, encryptedPwd, bal, 101);

        users.add(newUser);

        System.out.println("registration successful");
    }


    public void login(){

        if(users.isEmpty()){
            System.out.println("no users found");
            return;
        }

        System.out.print("enter username: ");
        String uname = sc.next();

        System.out.print("enter password: ");
        String upassword = sc.next();

        String encryptedInput = e.encrypt(upassword);

        boolean found = false;

        for(User user : users){

            if(uname.equals(user.getUsername()) &&
                    encryptedInput.equals(user.getPassword())){

                System.out.println("login successful");
                System.out.println("balance " + user.getBalance());

                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("invalid credentials");
        }
    }

    }

