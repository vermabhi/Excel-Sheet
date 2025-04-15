package org.cid.operationStrategy;

import static org.cid.operationStrategy.OperationEnum.ADD;

public class OperationFactory {

    public static Operation getOperationHandler(String operation){
        OperationEnum op = OperationEnum.getOperationEnum(operation);
        switch (op){
            case ADD:
                return new AddOperation();
            case SUBTRACT:
                return new SubtractOperation();
            case MULTIPLICATION:
                return new MultiplyOperation();
            default:
                return null;
        }
    }
}
