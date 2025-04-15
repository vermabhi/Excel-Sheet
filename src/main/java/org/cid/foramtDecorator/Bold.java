package org.cid.foramtDecorator;

import org.cid.model.Cell;

public class Bold implements Format{

    @Override
    public String format(String value) {
        return "<b>"+value+"</b>";
    }
}
