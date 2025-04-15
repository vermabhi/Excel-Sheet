package org.cid.operationStrategy;

public enum OperationEnum {
    ADD("add"),
    SUBTRACT("subtract"),
    MULTIPLICATION("multiply");

    OperationEnum(String operation) {
        this.operation = operation;
    }

    String operation;

    public static OperationEnum getOperationEnum(String ops){
        for(OperationEnum op: values()){
            if(op.operation.equalsIgnoreCase(ops)){
                return op;
            }
        }
        return null;
    }
}
