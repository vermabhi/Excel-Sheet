package org.cid.operationStrategy;

public class AddOperation implements Operation{
    @Override
    public int operate(int val1, int val2) {
        return val1+val2;
    }
}
