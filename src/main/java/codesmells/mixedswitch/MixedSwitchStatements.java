package codesmells.mixedswitch;

public class MixedSwitchStatements {

    /**
     * A method containing a mixed back of function calls and a switch statement that sometimes returns and sometimes breaks
     * Code smells:
     * - The switch block is mixed into a bigger method with other function calls
     * - Return statements scattered at different levels within the nested blocks
     */
    public String before(int someInput, boolean another) {
        int myVariable = 0;
        muchMoreBar(someInput);
        switch (someInput) {
            case 1:
                return "foo";
            case 2:
                myVariable = doBar(someInput);
                break;
            case 3:
                myVariable = 3;
                break;
            default:
                myVariable = 42;
        }
        return "The answer is " + myVariable;
    }

    private void muchMoreBar(int someInput) {
//        nothing really matters here
    }

    private int doBar(int someInput) {
        return someInput * 2;
    }
}
