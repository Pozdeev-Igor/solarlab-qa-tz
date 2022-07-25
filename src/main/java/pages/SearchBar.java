package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchBar {
    private final SelenideElement  searchButton = $x("//*[@id=\"dnn_ctr1253_HtmlModule_lblContent\"]/div/div/div[1]/a");

    public void clcButton(String link) {
        searchButton.click();
    }
}
