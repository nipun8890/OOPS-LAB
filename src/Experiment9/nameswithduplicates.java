package Experiment9;
import java.util.HashSet;

public class nameswithduplicates {
    public static void main(String[] args) {
        // 1. Array with duplicate names
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        // 2. Store names in a HashSet to remove duplicates
        HashSet<String> uniqueNames = new HashSet<>();

        for (String name : names) {
            uniqueNames.add(name); // HashSet automatically handles duplicates
        }

        // 3. Check if a specific name exists in the set
        String checkName = "Sourabh";
        if (uniqueNames.contains(checkName)) {
            System.out.println(checkName + " is in the set.");
        } else {
            System.out.println(checkName + " is not in the set.");
        }

        // 4. Print all unique names
        System.out.println("Unique Names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
