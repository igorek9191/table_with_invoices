package model.table;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Cell {

    private SelenideElement cellElement;

    public Cell(String xpath){
        cellElement = $x(xpath);
    }

    public Cell(SelenideElement element){
        cellElement = element;
    }

    public String getStringValue(){
        return cellElement.getValue();
    }
}
