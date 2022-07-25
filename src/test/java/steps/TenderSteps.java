package steps;

import io.cucumber.java.en.Then;
import pages.MainPage;
import pages.ModalWindow;
import pages.SearchBar;
import pages.SearchWindow;

public class TenderSteps {
    MainPage page = new MainPage();
    SearchBar bar = new SearchBar();
    SearchWindow window = new SearchWindow();
    ModalWindow modalWindow = new ModalWindow();
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
}
