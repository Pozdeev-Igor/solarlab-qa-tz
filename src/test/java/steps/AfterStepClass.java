package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;

public class AfterStepClass {

    @After
    public void teardown() {
        WebDriverRunner.getWebDriver().quit();
    }
}


