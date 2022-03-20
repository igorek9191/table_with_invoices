package model.table;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enums.FirstHeaderRowNames;
import enums.FourthHeaderRowNames;
import enums.HeaderColumnName;
import enums.SecondHeaderRowNames;
import enums.ThirdHeaderRowNames;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$x;

public class Row {

    private SelenideElement rowElement;

    public Row(String xpath) {
        rowElement = $x(xpath);
    }

    public Row(SelenideElement element) {
        rowElement = element;
    }

    public String getTextFromCell(int index) {
        return rowElement.$x("./td[" +index+ "]").getText();
    }

    public String getTextFromCell(HeaderColumnName columnName) {
        int indexOfColumn = 0;

        ElementsCollection headerCells = rowElement
                .$$x(".//ancestor::table/thead[1]//th[text()='" +columnName.getText()+ "']//ancestor::tr/th");
        SelenideElement element = headerCells.findBy(exactText(columnName.getText()));
        if(FirstHeaderRowNames.valuess().contains(columnName)){
            indexOfColumn = headerCells.indexOf(element) + 1;
        }
        if(SecondHeaderRowNames.valuess().contains(columnName) ||
            ThirdHeaderRowNames.valuess().contains(columnName) ||
            FourthHeaderRowNames.valuess().contains(columnName)){
            indexOfColumn = headerCells.indexOf(element) + 2;
        }
        return getTextFromCell(indexOfColumn);
    }
}