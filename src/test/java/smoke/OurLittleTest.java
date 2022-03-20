package smoke;

import io.qameta.allure.Story;
import model.table.Row;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page_objects.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static enums.FirstHeaderRowNames.COMPANY;
import static enums.FirstHeaderRowNames.INVOICE_ADDRESS;
import static enums.FourthHeaderRowNames.LINE_TOTAL;
import static enums.ThirdHeaderRowNames.GRADE;
import static enums.ThirdHeaderRowNames.WEIGHT;

@Story("Invoices")
public class OurLittleTest extends BaseTest{

    private MainPage mainPage;
    private SoftAssertions softAssertions = new SoftAssertions();

    private String correctCompanyName = "TEST CUSTOMER";
    private String correctInvoiceAddress = "TEST ADDRESS, TEST TOWN, 111111";
    private String correctGrade = "Mixed Municipal Waste";
    private String correctWeight = "0.460 T";
    private String correctLineTotal = "£100.00";
    private String correctLineTotalPerTonne = "£4.60";
    private String correctItemLineTotal = "£110.10";

    @BeforeAll
    public void beforeAll() {
        mainPage = open(url, MainPage.class);
        mainPage.getTable().scrollIntoView(true);
    }

    @DisplayName("Test that checks values for order 146566")
    @Test
    public void invoiceChecks() {
        String actualCompanyName = new Row(mainPage.getMainRowInOrder()).getTextFromCell(COMPANY);

        String actualInvoiceAddress = new Row(mainPage.getMainRowInOrder()).getTextFromCell(INVOICE_ADDRESS);

        String actualGrade = new Row(mainPage.getMixedMunicipalWasteRow()).getTextFromCell(GRADE);
        String actualWeight = new Row(mainPage.getMixedMunicipalWasteRow()).getTextFromCell(WEIGHT);
        String actualLineTotal = new Row(mainPage.getFlatChargeRow()).getTextFromCell(LINE_TOTAL);
        String actualLineTotalPerTonne = new Row(mainPage.getPerTonneRow()).getTextFromCell(LINE_TOTAL);
        String actualItemLineTotal = new Row(mainPage.getItemRow()).getTextFromCell(LINE_TOTAL);

        softAssertions.assertThat(actualCompanyName).as("Company name check")
                .isEqualTo(correctCompanyName);
        softAssertions.assertThat(actualInvoiceAddress).as("Invoice address check")
                .isEqualTo(correctInvoiceAddress);
        softAssertions.assertThat(actualGrade).as("Grade check").isEqualTo(correctGrade);
        softAssertions.assertThat(actualWeight).as("Weight check").isEqualTo(correctWeight);
        softAssertions.assertThat(actualLineTotal).as("Line total check").isEqualTo(correctLineTotal);
        softAssertions.assertThat(actualLineTotalPerTonne).as("Line total per tonne check")
                .isEqualTo(correctLineTotalPerTonne);
        softAssertions.assertThat(actualItemLineTotal).as("Item Line total check")
                .isEqualTo(correctItemLineTotal);

        softAssertions.assertAll();
    }
}