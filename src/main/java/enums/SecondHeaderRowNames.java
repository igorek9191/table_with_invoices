package enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum SecondHeaderRowNames implements HeaderColumnName{

    JOB_DATE("Job date"),
    ORDER_ID("Order ID"),
    PO("PO"),
    QUANTITY("Quantity / In advance quantity"),
    SERVICE("Service"),
    ADDRESS("Address"),
    SUBTOTAL("Subtotal"),
    FOREIGN_SUBTOTAL("Foreign subtotal");

    private final String text;

    SecondHeaderRowNames(String text) {
        this.text = text;
    }

    public static List<String> stringValues(){
        return Arrays.stream(SecondHeaderRowNames.values()).map(x -> x.text).collect(Collectors.toList());
    }

    public static List<SecondHeaderRowNames> valuess(){
        return Arrays.stream(SecondHeaderRowNames.values()).collect(Collectors.toList());
    }

    @Override
    public String getText() {
        return text;
    }
}
