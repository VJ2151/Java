package restaurant;

public class Restaurant {
    public final int POHE = 30;
    public final int UPMA = 40;
    public final int IDLI = 20;
    public final int MEDU_VADA = 30;
    public final int DOSA = 50;

    public void displayMenu() {
        System.out.println("\n********** MENU CARD **********");
        System.out.println("1. POHE          : Rs " + POHE);
        System.out.println("2. UPMA          : Rs " + UPMA);
        System.out.println("3. IDLI          : Rs " + IDLI);
        System.out.println("4. MEDU VADA     : Rs " + MEDU_VADA);
        System.out.println("5. DOSA          : Rs " + DOSA);
        System.out.println("0. FINISH & BILL");
        System.out.println("*******************************");
    }

}