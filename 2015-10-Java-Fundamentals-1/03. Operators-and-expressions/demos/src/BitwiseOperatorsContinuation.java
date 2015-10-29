import java.text.MessageFormat;
import java.util.Scanner;

public class BitwiseOperatorsContinuation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int position = scanner.nextInt();

        int mask = 1 << position;
        int result = mask & number;
        result = result >> position;

        if (result == 1) {
            WriteLine(true);
        }
        else if (result == 0) {
            WriteLine(false);
        }
        else {
            WriteLine("Your program does not work!");
        }
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}