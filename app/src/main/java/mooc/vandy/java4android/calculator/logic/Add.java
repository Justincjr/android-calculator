package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Add operation.
 */
public class Add implements Operation{
    private int result;
    // TODO - add your solution here.
    @Override
    public void calculate(int a, int b) {
        result = a + b;
    }

    @Override
    public void print(ActivityInterface activityInterface) {
        activityInterface.print(String.valueOf(result));
    }
}
