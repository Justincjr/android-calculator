package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Divide operation.
 */
public class Divide implements Operation {
    private int result;
    private int remainder;
    private boolean isDivisionByZero = false; // Flag to indicate division by zero

    public void calculate(int a, int b) {
        if (b == 0) {
            isDivisionByZero = true; // Set flag if division by zero
            return;
        }
        result = a / b;
        remainder = a % b;
    }

    @Override
    public void print(ActivityInterface activityInterface) {
        if (isDivisionByZero) {
            activityInterface.print("Cannot divide by 0");
        } else {
            activityInterface.print(String.format("%d R: %d", result, remainder));
        }
    }
}
