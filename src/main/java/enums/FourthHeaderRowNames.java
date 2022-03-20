package enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum FourthHeaderRowNames implements HeaderColumnName{

    PRICE_ENTITY("Price entity"),
    DESCRIPTION("Description"),
    AFTER("After"),
    QUANTITY("Quantity"),
    PRICE("Price"),
    FOREIGN_PRICE("Foreign price"),
    LINE_TOTAL("Line total"),
    FOREIGN_LINE_TOTAL("Foreign line total");

    private final String text;

    FourthHeaderRowNames(String text) {
        this.text = text;
    }

    public static List<String> stringValues(){
        return Arrays.stream(FourthHeaderRowNames.values()).map(x -> x.text).collect(Collectors.toList());
    }

    public static List<FourthHeaderRowNames> valuess(){
        return Arrays.stream(FourthHeaderRowNames.values()).collect(Collectors.toList());
    }

    @Override
    public String getText() {
        return text;
    }
}
