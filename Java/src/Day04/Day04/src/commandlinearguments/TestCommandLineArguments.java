package commandlinearguments;

public class TestCommandLineArguments {
    public static void main(String[] args) {
        if (args[0] != null ) {
            System.out.println(args[0]);
        }
        else
            System.out.println("No Parameters given");

    }
}

