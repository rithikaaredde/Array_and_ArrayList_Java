/*
 * Name: Rithikaa Redde
 * PRN: <Your PRN>
 * Batch: <Your Batch>
 */

import java.util.*;

public class UserInput {

    // Method to take input from the user and return an array of numbers
    int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // Define the array size (5)
        
        System.out.println("Enter 5 numbers: ");
        
        // Taking 5 numbers from the user and storing them in the array
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Returning the array
        return arr;
    }
}
