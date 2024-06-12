/*
Write a program that reads an email address from the user and validates it using a regular expression. An email address is considered valid if it follows the format local-part@domain, where the local-part and domain follow certain rules.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        boolean isValid = isValidEmail(email);
        System.out.println("Is the email address valid? " + isValid);
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}
