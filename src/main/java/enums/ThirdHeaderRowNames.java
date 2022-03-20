package enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ThirdHeaderRowNames implements HeaderColumnName {

    GRADE("Grade"),
    WEIGHT("Weight");

    private final String text;

    ThirdHeaderRowNames(String text) {
        this.text = text;
    }

    public static List<String> stringValues(){
        return Arrays.stream(ThirdHeaderRowNames.values()).map(x -> x.text).collect(Collectors.toList());
    }

    public static List<ThirdHeaderRowNames> valuess(){
        return Arrays.stream(ThirdHeaderRowNames.values()).collect(Collectors.toList());
    }

    @Override
    public String getText() {
        return text;
    }
}
