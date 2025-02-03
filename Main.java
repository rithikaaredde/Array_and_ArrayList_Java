public class Main {
    public static void main(String args[])
    {
        UserInput ui = new UserInput();
        ArrayFunctions fn = new ArrayFunctions();
        //fn.display(ui.arrayInput());
        fn.oddEven(ui.arrayInput());
    }
}
