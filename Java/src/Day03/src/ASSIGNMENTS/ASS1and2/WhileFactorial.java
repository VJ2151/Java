package ASSIGNMENTS.ASS1and2;

public class WhileFactorial {

    public int facto(int n) {
        if (n <= 1)
            return 1;
        return n * facto(n - 1);
    }

    public static void main(String[] args) {
        WhileFactorial f1 = new WhileFactorial();
        int num = 1;
        int currentFact = 0;

        while (true) {
            currentFact = f1.facto(num);
            if (currentFact > 1000) break;
            System.out.println("ASSIGNMENTS.ASS1and2.Factorial of " + num + " : " + currentFact);
            num++;
        }
    }
}