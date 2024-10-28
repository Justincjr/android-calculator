package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

public interface Operation {
    public void calculate(int a, int b);
    public void print(ActivityInterface activityInterface);
}
