import java.util.Scanner;
public class LargestSumOfDigits {

    public static int findLargestSumOfDigits(String[] arr) {
        int largestSum = 0;
        for (String str : arr) {
            int sumOfDigits = 0;
            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    sumOfDigits += Character.digit(c, 10);
                }
            }
            largestSum = Math.max(largestSum, sumOfDigits);
        }
        return largestSum;
    }

    public static void main(String[] args) {
        // maximum we can enter 10 strings
        String[] arr = new String[10];
        //Create a scanner object for user input
        Scanner str = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
           arr[i] = str.nextLine();
            // check if the length of string maximum of 12 if its not null
            if (arr[i] != null) {
                int stringlength = arr[i].length( );
                if (stringlength > 12) {
                    System.out.println ( "String length cannot exceed 12 characters. Please enter again." );
                    i--; // Decrement i to allow the user to input the string again
                    //  continue;
                }
            }

        }
        int largestSum = findLargestSumOfDigits(arr);
        System.out.println("Largest sum of digits: " + largestSum);
    }
}
