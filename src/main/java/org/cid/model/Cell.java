package org.cid.model;

import org.cid.foramtDecorator.Format;
import org.cid.foramtDecorator.FormatEnum;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    int colId;
    int rowId;
    String value;
    List<String> formats;

    public List<String> getFormats() {
        return formats;
    }

    public void setFormats(String format) {
        formats.add(format);
    }

    public Cell(int colId, int rowId, String value) {
        this.colId = colId;
        this.rowId = rowId;
        this.value = value;
        this.formats = new ArrayList<>();
    }

    public int getColId() {
        return colId;
    }

    public void setColId(int colId) {
        this.colId = colId;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
