package org.cid.operationStrategy;

public class SubtractOperation implements Operation{
    @Override
    public int operate(int val1, int val2) {
        return val1 - val2;
    }
}
