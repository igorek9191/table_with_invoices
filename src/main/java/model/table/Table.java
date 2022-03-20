package model.table;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Table {

    private SelenideElement tableElement;

    public Table(String xpath){
        tableElement = $x(xpath);
    }
    public Table(SelenideElement element){
        tableElement = element;
    }

    public Row getRow(String xpath){
        return new Row(xpath);
    }

    public Row getRow(SelenideElement element){
        return new Row(element);
    }

}