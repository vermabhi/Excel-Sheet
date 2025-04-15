package org.cid.service;

import org.cid.foramtDecorator.FormatEnum;
import org.cid.foramtDecorator.FormatFactory;
import org.cid.model.Cell;
import org.cid.operationStrategy.Operation;
import org.cid.operationStrategy.OperationEnum;
import org.cid.operationStrategy.OperationFactory;
import org.cid.repository.CellRepository;

public class ExcelService {

    CellRepository cellRepository;

    public ExcelService(CellRepository cellRepository) {
        this.cellRepository = cellRepository;
    }

    public void performOperation(int colId, int rowId, int val1, int val2, String operationEnum){
        Operation operation = OperationFactory.getOperationHandler(operationEnum);
        Integer result = operation.operate(val1,val2);
        cellRepository.addCellValue(colId, rowId, result.toString());
    }

    public void addFormat(int colId, int rowId, String format){
        cellRepository.getCell(colId, rowId).setFormats(format);
    }

    public String getFormattedValue(int colId, int rowId){
        Cell cell = cellRepository.getCell(colId, rowId);
        String formattedValue = cell.getValue();
        for(String type: cell.getFormats()){
            formattedValue = FormatFactory.getFormat(type).format(formattedValue);
        }
        return formattedValue;
    }
}
