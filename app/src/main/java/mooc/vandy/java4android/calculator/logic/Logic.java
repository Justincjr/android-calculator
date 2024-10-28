package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        Operation op = getOperation(operation);
        op.calculate(argumentOne, argumentTwo);
        op.print(mOut);
    }
    private static Operation getOperation(int operationType) {
        switch (operationType) {
            case 1:
                return new Add();
            case 2:
                return new Subtract();
            case 3:
                return new Multiply();
            case 4:
                return new Divide();
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }
}
