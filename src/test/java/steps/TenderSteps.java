package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.*;

import java.io.IOException;

public class TenderSteps {

    static Logger log = LogManager.getLogger();
    MainPage page = new MainPage();
    SearchBar bar = new SearchBar();
    SearchWindow window = new SearchWindow();
    ModalWindow modalWindow = new ModalWindow();


    SearchResult result = new SearchResult();


    @Then("in footer click on {string} link")
    public void inFooterClickOnLink(String arg0) {
        page.clcLink(arg0);
    }

    @Then("in search bar click on {string} link")
    public void inSearchBarClickOnLink(String arg0) {
        bar.clcButton(arg0);
    }

    @Then("in search window click on {string} button")
    public void inSearchWindowClickOnButton(String arg0) {
        window.clcTuneButton(arg0);
    }

    @Then("in opened modal click on {string} checkbox")
    public void inOpenedModalClickOnCheckbox(String arg0) {
        modalWindow.clckCheckbox(arg0);
    }

    @And("click on {string} checkbox")
    public void clickOnCheckbox(String arg0) {
        modalWindow.jointPurchasesClick(arg0);
    }

    @And("click on {string} region checkbox")
    public void clickOnRegionCheckbox(String arg0) {
        modalWindow.clickOnRegionCollapse(arg0);
    }

    @And("select date TODAY")
    public void selectDateTODAY() {
        modalWindow.selectDate();
    }

    @And("click on {string} button")
    public void clickOnButton(String arg0) {
        modalWindow.clickSubmitButton(arg0);
    }

    @Then("iterate all elements")
    public void iterateAllElements() {
        try {
            result.iterateElements();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
