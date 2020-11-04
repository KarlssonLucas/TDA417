import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        new BinarySearch().program();
    }

    public void program() {
        Scanner sc = new Scanner(System.in);
        int high = 500;
        int low = 0;
        boolean guessedRight = false;

        while (!guessedRight) {
            int guessedNumber = new Random().nextInt(high-low) + low;
            System.out.println(high + " " + low);
            System.out.println("Computer guessed: "+guessedNumber+" high/low/correct?");
            String s = sc.nextLine();
            switch (s) {
                case "high":
                    high = guessedNumber;
                    break;
                case "low":
                    low = guessedNumber;
                    break;
                case "correct":
                    guessedRight = true;
                    break;
            }
                
        }
    }
}
