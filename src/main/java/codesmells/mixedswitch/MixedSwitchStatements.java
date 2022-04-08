package codesmells.mixedswitch;

public class MixedSwitchStatements {
    public String before(int someInput, boolean another) {
        
        switch (someInput) {
            case 1:

            default:
        }
        return "Do you feel lucky?";
    }
}
