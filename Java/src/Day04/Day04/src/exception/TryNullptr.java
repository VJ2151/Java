package exception;

public class TryNullptr {
    public static void main(String[] args) {
        String s=null;

        try {
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("null pointer exception occured");
            e.printStackTrace();
        }
    }

}
