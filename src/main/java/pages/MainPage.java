package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement footerLink = $("a[href*=\"participants-223\"]");

    public void clcLink(String link) {
    footerLink.click();
}
}
