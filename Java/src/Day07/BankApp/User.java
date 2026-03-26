package Day07.BankApp;

import java.util.Objects;

public class User {
    String username;
    String password;
    Double balance;

    public User(String username,String password,double balance,int userId){
        this.username=username;
        this.balance=balance;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
