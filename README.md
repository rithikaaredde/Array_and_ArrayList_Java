# Array_and_ArrayList
This repository contains Java code to categorize numbers into even and odd arrays, based on user input, and perform basic array-related operations.
The program is structured into multiple Java files to maintain clean code and modular design.

## File Structure:
### Main.java:
The entry point of the program. It coordinates user input, calls methods from UserInput and ArrayFunctions, and handles the program flow.

### UserInput.java:
Contains the method for accepting user input and storing the numbers into an array. It returns the array to the calling class.

### ArrayFunctions.java:
Contains utility methods for handling arrays. In this case, it categorizes numbers into odd and even arrays and displays them.

## Methods and Functions:
### Main.java
main(String[] args):
The entry point of the program.
Accepts user input for numbers and categorizes them as even or odd using methods from the UserInput and ArrayFunctions classes.
Repeats the input process until the user decides to exit.

### UserInput.java
arrayInput():
Prompts the user to input 5 integers.
Returns an array containing the user input.

### ArrayFunctions.java
display(ArrayList<Integer> arr):
Displays the content of the passed ArrayList.
oddEven(int[] arr):
Takes an integer array as input.
Categorizes numbers into two arrays: odd and even.
Calls display to print both arrays.
