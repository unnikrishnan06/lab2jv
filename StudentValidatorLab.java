 
import java.util.*;
import java.util.regex.*;
 
 
public class StudentValidatorLab{
 
 
    public static void main(String[] args) {
 
 
        Scanner scanner = new Scanner(System.in);
 
 
        // =====================================================
        // PART 1 — NAME VALIDATION (String + Regex)
        // =====================================================
 
 
        // STEP 1:
        // Ask user to enter full name
 
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();
 
 
        // STEP 2:
        // Validate name
        // Only letters and spaces allowed
        // Use regex with matches()
       
        if (name.matches("[a-zA-Z ]+")) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Invalid name");
        }
        // =====================================================
        // PART 2 — STUDENT ID VALIDATION
        // Format: S-1234
        // =====================================================
        // STEP 3:
        // Ask user to enter student ID
        // STEP 4:
        // Validate format using regex
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        if (id.matches("S-\\d{4}")) {
            System.out.println(" id is valid");
        } else {
            System.out.println("Invalid id ");
        }
        // =====================================================
        // PART 3 — EMAIL VALIDATION
        // =====================================================
        // STEP 5:
        // Ask user to enter email
        // STEP 6:
        // Validate email format
 
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        if (email.matches(".+@.+\\..+")) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Invalid email");
        }
        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================
        // STEP 7:
        // Ask user to enter a sentence
        // STEP 8:
        // Count vowels using Character class
        // STEP 9:
        // Reverse sentence using StringBuilder
        // STEP 10:
        // Replace all digits in sentence with '*'
  System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        // count vowels
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        System.out.println("Vowel count: " + count);
        // reverse sentence
        String reversed = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed: " + reversed);
        // replaced digits 
        String replaced = sentence.replaceAll("\\d", "*");
        System.out.println("Digit replaced: " + replaced);
        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================
        // STEP 11:
        // Create string: "Math,Science,Java,English"
        // Split using comma
        // Print each course
 
 
 
 
        // =====================================================
        // PART 6 — PATTERN & MATCHER
        // =====================================================
        // STEP 12:
        // Create string: "Invoice number is 4567 and total is 890"
        // Use Pattern and Matcher to extract all numbers
 
 
 
 
        scanner.close();
    }
}
 
 