package Day07.BankApp;

public class Encryption{

    public String encrypt(String password){
        String result="";

        for(int i=0;i<password.length();i++){
            result+=(char)(password.charAt(i)+3);
        }
        return result;

    }

    public String decrypt(String password){
        String result1="";

        for(int i=0;i<password.length();i++){
            result1+=(char)(password.charAt(i)-3);
        }
            return result1;
    }

}























