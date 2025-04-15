package org.cid.foramtDecorator;

import org.cid.model.Cell;

public class UnderLine implements Format{

    @Override
    public String format(String value) {
        return "<u>"+value+"</u>";
    }
}
