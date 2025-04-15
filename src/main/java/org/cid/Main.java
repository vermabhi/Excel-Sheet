package org.cid;

import org.cid.foramtDecorator.Bold;
import org.cid.foramtDecorator.Format;
import org.cid.foramtDecorator.Italic;
import org.cid.operationStrategy.OperationEnum;
import org.cid.repository.CellRepository;
import org.cid.service.ExcelService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CellRepository cellRepository = new CellRepository(10,10);
        ExcelService excelService = new ExcelService(cellRepository);
        excelService.performOperation(1,1,3,5, "add");
        System.out.println(cellRepository.getCellValue(1,1));
        excelService.addFormat(1,1,"bold");
        excelService.addFormat(1,1, "italic");
        excelService.addFormat(1,1,"underline");
        System.out.println(excelService.getFormattedValue(1,1));
    }
}

//Features:
//Print entire excel sheet
//Update value of a cell
//Get value of a cell
//Add Basic formulae such as add, subtract, multiply
//Add range operations such as sum() over range.
//Formatting of each cells - Bold, Italics, Underline, Strikethrough

// Cell -> rowId, colId, value
// Sheet -> List<Cells>


//INTERFACE
// Format -> BOLD, ITALIC
// Operation ->
// RangeOperations -> SUM