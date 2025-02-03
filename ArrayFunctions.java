/*
 * Name: Rithikaa Redde
 * PRN: <Your PRN>
 * Batch: <Your Batch>
 */

import java.util.*;

public class ArrayFunctions {
    
    // Method to display the array content
    public void display(ArrayList<Integer> arr) {
        System.out.println("Array: " + arr);
    }
    
    // Method to categorize numbers into odd and even arrays
    public void oddEven(int[] arr) {
        // Initializing ArrayLists for odd and even numbers
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> eve = new ArrayList<Integer>();
        
        // Iterating through the input array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                eve.add(arr[i]); // Add to even array
            } else {
                odd.add(arr[i]); // Add to odd array
            }
        }
        
        // Displaying the categorized numbers
        System.out.print("ODD NUMBERS: ");
        display(odd);
        System.out.print("EVEN NUMBERS: ");
        display(eve);
    }
}
