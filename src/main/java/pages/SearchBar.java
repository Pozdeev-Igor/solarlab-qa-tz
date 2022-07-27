package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class SearchBar {
    private final SelenideElement  searchButton = $("a[href*=\"poisk-223-fz\"]");

    public void clcButton(String link) {
        searchButton.click();
    }
}
