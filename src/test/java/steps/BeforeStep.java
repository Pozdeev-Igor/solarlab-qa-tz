package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class BeforeStep {
    @Given("Open webpage {string}")
    public void openWebpage(String arg0) {
        Selenide.open(arg0);
    }
}
