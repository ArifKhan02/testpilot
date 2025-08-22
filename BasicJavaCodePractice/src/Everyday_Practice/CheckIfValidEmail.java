package Everyday_Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfValidEmail {
    public static void main(String[] args) {
        String email = "user@example.com";

        if (isValidEmail(email)) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }

    private static boolean isValidEmail(String email) {
        // Define the regular expression pattern for a valid email address
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Create a matcher with the given email string
        Matcher matcher = pattern.matcher(email);
        //another method
        String s="arif";
        boolean is_match=s.matches(emailRegex);
        

        // Return true if the email matches the pattern, otherwise false
        return matcher.matches();
    }
}
