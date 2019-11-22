import java.util.Scanner;
public class CharOccurrenceString{
  public static int count(String str, char a) {
    return count(str, a, str.length() - 1);
  }
  private static int count(String str, char ch, int high) {
    if (high < 0) // Base case
        return 0;
    else if (str.charAt(high) ==  ch) {
        return 1 + count(str, ch, high - 1);
    }
    else
        return count(str, ch, high - 1);
  }
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string and a character: ");
    String[] str = input.nextLine().split("[ ]");
    System.out.println("The character \'" + str[1] + "\' occurs " + count(str[0], str[1].charAt(0)) + " times in \"" + str[0] + "\".");
  }
}
