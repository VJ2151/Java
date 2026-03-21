package Day02.AccessSpecifier4;

public class TestInterface {
    public static void main(String[] args) {
        IFly ifly=new Superman();
        ifly.fly();
        ifly=new Airplane();
        ifly.fly();
    }
}
