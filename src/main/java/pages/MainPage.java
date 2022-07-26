package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
//    private final SelenideElement footerLink = $x("//*[@id=\"footer-common\"]/section[1]/div/div[2]/div/nav[2]/ul[1]/li[1]/a");
    private final SelenideElement footerLink = $("a[href*=\"participants-223\"]");

    public void clcLink(String link) {
    footerLink.click();
}
}
