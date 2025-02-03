/*
 * Name: Rithikaa Redde
 * PRN: <Your PRN>
 * Batch: <Your Batch>
 */

import java.util.*;

public class Main {
    
    // Main method - entry point of the program
    public static void main(String args[]) {
        // Creating instances of UserInput and ArrayFunctions classes
        UserInput ui = new UserInput();
        ArrayFunctions fn = new ArrayFunctions();
        
        // Calling the oddEven method from ArrayFunctions to categorize numbers
        fn.oddEven(ui.arrayInput());
    }
}
