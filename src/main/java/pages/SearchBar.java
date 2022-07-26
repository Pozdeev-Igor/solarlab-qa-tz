package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SearchBar {
    private final SelenideElement  searchButton = $("a[href*=\"poisk-223-fz\"]");

    public void clcButton(String link) {
        searchButton.click();
    }
}
