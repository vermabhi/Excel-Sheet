package org.cid.foramtDecorator;

public class FormatFactory {

    public static Format getFormat(String formatType) {
        FormatEnum type = FormatEnum.getFormatEnum(formatType);
        switch (type){
            case BOLD -> {
                return new Bold();
            }
            case ITALIC -> {
                return new Italic();
            }
            case UNDERLINE -> {
                return new UnderLine();
            }
            case STRIKETHROUGH -> {
                return new StrikeThrough();
            }
            default -> {
                return null;
            }
        }
    }
}
