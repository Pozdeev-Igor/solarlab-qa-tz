package steps;

import io.cucumber.java.en.Then;
import pages.MainPage;
import pages.SearchBar;

public class TenderSteps {
    MainPage page = new MainPage();
    SearchBar bar = new SearchBar();
    @Then("in footer click on {string} link")
    public void inFooterClickOnLink(String arg0) {
        page.clcLink(arg0);
    }

    @Then("in search bar click on {string} link")
    public void inSearchBarClickOnLink(String arg0) {
        bar.clcButton(arg0);
    }
}
