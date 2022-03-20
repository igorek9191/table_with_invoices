package page_objects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private SelenideElement table = $(By.id("MyYardDisclosure9577009378082_frm"));

    private SelenideElement mainRowInOrder = $x("(//tr[@class=\"gl-0\"])[4]");
    private SelenideElement mixedMunicipalWasteRow = $x("(//tr[@class=\"gl-2\"])[4]");
    private SelenideElement flatChargeRow = $x("(//tr[@class=\"gl-3\"])[4]");
    private SelenideElement perTonneRow = $x("(//tr[@class=\"gl-3\"])[5]");
    private SelenideElement itemRow = $x("(//tr[@class=\"gl-3\"])[6]");

    public SelenideElement getTable() {
        return table;
    }

    public SelenideElement getMainRowInOrder() {
        return mainRowInOrder;
    }

    public SelenideElement getMixedMunicipalWasteRow() {
        return mixedMunicipalWasteRow;
    }

    public SelenideElement getFlatChargeRow() {
        return flatChargeRow;
    }

    public SelenideElement getPerTonneRow() {
        return perTonneRow;
    }

    public SelenideElement getItemRow() {
        return itemRow;
    }
}
