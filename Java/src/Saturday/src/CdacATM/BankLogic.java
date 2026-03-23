//package CdacATM;
//
//public class BankLogic {
//    public int deposit(double amount){
//        CdacATM.Account.balance +=amount;
//        System.out.println("rupees "+ amount + " is Added successfully in your bank account");
//        return CdacATM.Account.balance;
//    }
//    public boolean withdraw(double amount){
//        if (CdacATM.Account.balance>amount) {
//            CdacATM.Account.balance -= amount;
//            System.out.println("Ammount "+ amount +" withdrawed successfully");
//            return true;
//        }
//        else {
//            System.out.println("YOUR BALANCE IS " + CdacATM.Account.balance);
//            System.out.println("INSUFFICIENT BALANCE");
//            return false;
//        }
//    }
//    public void checkBalance(){
//        System.out.println("YOUR BALANCE IS "+ CdacATM.Account.balance);
//    }
//}
