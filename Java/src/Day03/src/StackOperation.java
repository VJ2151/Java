
public class StackOperation {
    int top = -1;
    int stack[] = new int[5];

    public double push(int value) {
        if (top == 4) {
            System.out.println("overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println("given number inserted into stack");
        }
        return 0;
    }

    public double pop() {
        if (top == -1) {
            System.out.println("underflow");
        }
        else {
            top--;
            System.out.println("given number deleted from stack");
        }
        return 0;

    }

    public double peek () {
        if (top == -1) {
            System.out.println("top is" + " " + stack[top] );

        }
        return 0;
    }

    }

