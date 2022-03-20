package enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum FirstHeaderRowNames implements HeaderColumnName {

    INVOICE_DATE("Invoice date"),
    INVOICE_NUMBER("Invoice number"),
    OPEN_CLOSED_("Open / Closed"),
    COMPANY("Company"),
    INVOICE_ADDRESS("Invoice address"),
    TAX("Tax"),
    NEW_TOTAL("Net total"),
    FOREIGN_NET_TOTAL("Foreign net total");

    private final String text;

    FirstHeaderRowNames(String text) {
        this.text = text;
    }

    public static List<String> stringValues(){
        return Arrays.stream(FirstHeaderRowNames.values()).map(x -> x.text).collect(Collectors.toList());
    }

    public static List<FirstHeaderRowNames> valuess(){
        return Arrays.stream(FirstHeaderRowNames.values()).collect(Collectors.toList());
    }

    @Override
    public String getText() {
        return text;
    }
}
