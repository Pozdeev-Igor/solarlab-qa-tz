package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import helpful.ParseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SearchResult {

ParseClass parseClass = new ParseClass();

    private static final Logger logger = LogManager.getLogger();
    private final SelenideElement loadMoreButton = $("#load-more");
ElementsCollection elements = $$("[itemprop=\"price\"]");
//    ElementsCollection elements = $$("#content > div[itemtype = \"http://schema.org/Product\"]");


ElementsCollection navigateButtons = $$("#pager > li");

    public void iterateElements() throws IOException {

            FileWriter writer = new FileWriter("D:\\SOLARLAB\\output.txt");
                long price;
                long summ = 0;

        WebDriverWait driverWait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(60, 1));
        driverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#content > div")));

        SelenideElement el;
        for (int i = 1; i < navigateButtons.size(); i++){
            System.out.println(navigateButtons.get(i).getText());
                for (int index = 0; index < elements.size(); index++) {
                        el = elements.get(index);
                        sleep(300);
                        writer.write("Page: " + navigateButtons.get(i).getText() + " STARTING PRICE: " + el.getText() + "\n");
                        summ = parseClass.parserToLong(el.getText()) + summ;
                    }

            int indexx = i+1;
//            SelenideElement buttonLink = $("#pager > li:nth-child(" + indexx +")");
            if (indexx == navigateButtons.size() -1) {
                break;
            }
            driverWait.until(ExpectedConditions.elementToBeClickable((navigateButtons.get(indexx).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")))).click();
            sleep(200);
        }

        writer.close();
        String s = parseClass.formatter(summ);
        logger.info("SUMMARY: " + s);
    }
}
