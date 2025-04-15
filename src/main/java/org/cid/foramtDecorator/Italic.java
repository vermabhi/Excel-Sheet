package org.cid.foramtDecorator;

public class Italic implements Format{

    @Override
    public String format(String value) {
        return "<i>"+value+"</i>";
    }
}
