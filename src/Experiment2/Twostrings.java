package Experiment2;
import java.util.Arrays;

public class Twostrings  {
    public static boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

     
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();


        Arrays.sort(sArray);
        Arrays.sort(tArray);

       
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Example 1: " + isAnagram(s1, t1)); 

        // Example 2
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Example 2: " + isAnagram(s2, t2)); 
    }
}


