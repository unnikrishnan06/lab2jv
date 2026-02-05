import java.util.ArrayList;
import java.util.Arrays;
 
public class Lab4 {
    public static void main(String[] args) {
 
        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
 
        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================
        String[] groceries = {
            // TODO: Fill in your grocery items
            "Milk",
            "Eggs",
            "Bread",
            "Apples",
            "Chicken",
            "Rice",
            "oranges",
        };
 
 
        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
       System.out.println(Arrays.toString(groceries));
 
 
        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
 
    for (String item : groceries) {
        groceryList.add(item);
    }
        // TODO: Loop through the array and add items to groceryList
        
 
 
        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================
        groceryList.add("mango");
        groceryList.add("cereal");
        groceryList.remove("Eggs");
        System.out.println(groceryList);
 
 
 
        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ================================================
        int vowelCount = 0;
        for (String item : groceryList) {
            String lowerItem = item.toLowerCase();

            if (lowerItem.startsWith("a") ||
             lowerItem.startsWith("e") ||
             lowerItem.startsWith("i") ||
             lowerItem.startsWith("o") ||
             lowerItem.startsWith("u")) {
                vowelCount++;
            }
        }
 
 
        // ================================================
        // STEP 6: Print the final results
        // ================================================
        
System.out.println("items that start with a vowel: " + vowelCount);
    }
}