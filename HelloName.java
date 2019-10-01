import java.util.Scanner;

public class HelloName {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String temp;

    System.out.println("What is your name? ");
    temp = keyboard.nextLine();
    System.out.println("Hello " + temp);

    keyboard.close();
  }
}
