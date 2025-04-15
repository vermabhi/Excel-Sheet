package org.cid.repository;

import org.cid.model.Cell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CellRepository {
    Map<Integer, Map<Integer, Cell>> cells;
    public CellRepository(int maxRow, int maxCol) {
        this.cells = new HashMap<>();
    }
    public void addCellValue(int rowId, int colId, String value){
        Cell cell = new Cell(colId, rowId, value);
        cells.put(colId, new HashMap<>());
        cells.get(colId).put(rowId,cell);
    }

    public String getCellValue(int rowId, int colId) {
       if(cells.containsKey(colId) && cells.get(colId).containsKey(rowId)){
           return cells.get(colId).get(rowId).getValue();
       }
       return "";
    }

    public Cell getCell(int colId, int rowid) {
        return cells.get(colId).get(rowid);
    }
}
