import java.util.Scanner;
import java.util.Random;

import static java.lang.System.out;
public class guessing {
    public static void foobar(String [] args) {
        int randomNumber = new Random().nextInt(2) + 1;
        out.println(randomNumber);

        Scanner keyboard = new Scanner(System.in);
        out.print("Enter an int from 1 to 10: ");

        int inputNumber = keyboard.nextInt();

        if (inputNumber == randomNumber) {
            out.println("You win");
        }
        out.println("Thanks for playing");
    }
}
