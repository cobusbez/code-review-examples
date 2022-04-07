package codesmells.nestedifblocks;

import java.time.LocalDate;

public class NestedIfBlocks {

    LocalDate date;

    public NestedIfBlocks(LocalDate date) {
        this.date = date;
    }

    /**
     * A simple example of nested if statements
     * Code smells:
     * - The combined use of if and if-else statements in a nested fashion.
     * - Return statements scattered at different levels within the nested blocks
     * - Null return value is specific cases
     */
    public String before(String someInput, boolean another) {
        if (someInput == null) {
            if (another) {
                return "I'm gonna make him an offer he can't refuse.";
            } else {
                return "Here's looking at you, kid.";
            }
        } else if (someInput.trim().isEmpty()) {
//            Some arbitrary check dependent on external factors of input
            if (date.getDayOfMonth() % 2 == 0) {
                return "Go ahead, make my day.";
            }
            return null;
        }
        return "Frankly, my dear, I don't give a damn.";
    }

    /**
     * Avoid nested if statements by checking each condition in turn and returning the appropriate result
     * Advantages:
     * - This makes reading through the code easier because it eliminates each condition and return a distinct value if the condition matches, or it falls through to the next statement
     * - Preconditions can be checked and handled early in the method (null checks etc.)
     */
    public String after(String someInput, boolean another) {
        if (someInput == null) {
//            Use ternary if statements when it improves readability
            return another
                    ? "I'm gonna make him an offer he can't refuse."
                    : "Here's looking at you, kid.";
        }

        if (!someInput.trim().isEmpty()) {
            return "Frankly, my dear, I don't give a damn.";
        }

        if (date.getDayOfMonth() % 2 == 0) {
            return "Go ahead, make my day.";
        }
        return null;
    }

}
