import java.lang.*;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        String reversedString = "";

        // reverse the string using a for loop
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        System.out.println("The reversed string is: " + reversedString);
    }
}
