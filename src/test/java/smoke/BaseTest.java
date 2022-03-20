package smoke;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected URL url;

    @BeforeAll
    public void beforeAllInBaseTest() throws MalformedURLException {
        open();
        Selenide.webdriver().driver().getWebDriver().manage().window().maximize();
        File file = new File("src/main/resources/company_invoices.mhtml");
        url = new URL("file:///" + file.getAbsolutePath());
    }
}

