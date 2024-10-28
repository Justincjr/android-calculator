package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Operation{
    // TODO - add your solution here.
    private int result;
    @Override
    public void calculate(int a, int b) {
        result = a - b;
    }
    @Override
    public void print(ActivityInterface activityInterface) {
        activityInterface.print(String.valueOf(result));
    }
}
