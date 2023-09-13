import static ibio.Helpers.*;
public class Main {
    public static void main(String[] args) {

        boolean running = true;
        while (running == true)
        {
            String operation = inputString("give operation: ");
            if (operation == "end")
                running = false;
            else
            {

                int A = inputInt("give first integer operand: ");
                int B = inputInt("give second integer operand: ");
                if (operation.equals("add"))
                    output(A+B);
                else if (operation.equals("sub"))
                    output(A-B);
                else
                    output("unknown operation");

            }
        }
    }
}