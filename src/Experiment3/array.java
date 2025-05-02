package Experiment3;

public class array {

   public static void main(String[] args) {
        int[] array = {1, 5, 6, 2, 4}; 
        int n = array.length + 1; 
  int totalSum = n * (n + 1) / 2;
          int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }  
         int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
