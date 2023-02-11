import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;

    System.out.println("I have generated a random number between 1 and 100. Try to guess it!");
    System.out.print("Your guess: ");
    int guess = input.nextInt();

    while (guess != number) {
      if (guess < number) {
        System.out.println("Too low, try again");
      } else {
        System.out.println("Too high, try again");
      }

      System.out.print("Your guess: ");
      guess = input.nextInt();
    }

    System.out.println("You guessed it! The number was " + number);
  }
}
