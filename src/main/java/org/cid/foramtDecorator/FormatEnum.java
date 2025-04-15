package org.cid.foramtDecorator;

public enum FormatEnum {

    BOLD("bold"),
    ITALIC("italic"),
    UNDERLINE("underline"),
    STRIKETHROUGH("strikethrough");


    FormatEnum(String type) {
        this.type = type;
    }

    public String type;

    public static FormatEnum getFormatEnum(String type){
        for(FormatEnum formatEnum: values()){
            if(formatEnum.type.equalsIgnoreCase(type)){
                return formatEnum;
            }
        }
        return null;
    }

}
