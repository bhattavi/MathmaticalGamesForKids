import java.util.Scanner;
import java.util.Random;

public class MultiplicationGame {

  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    int randomOne, randomTwo, product, userInput;
    boolean playingGame = true;

    while (playingGame) {
      randomOne = Math.abs(rand.nextInt() % 10);
      randomTwo = Math.abs(rand.nextInt() % 10);

      product = randomOne * randomTwo;

      System.out.println("How much is " + randomOne + " times " + randomTwo + "?");
      userInput = scan.nextInt();

      while (userInput != -1 && product != userInput) {
        System.out.println("No. Please try again.");
        System.out.println("How much is " + randomOne + " times " +
            randomTwo + "?");
        userInput = scan.nextInt();
      }
      if (product == userInput) {
        System.out.println("Very Good!");
      } else {
        playingGame = false;
      }
    }

    scan.close();
  }
}