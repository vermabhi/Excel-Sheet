package org.cid.foramtDecorator;

import org.cid.model.Cell;

public class StrikeThrough implements Format{

    @Override
    public String format(String value) {
        return "<s>"+value+"</s>";
    }
}
