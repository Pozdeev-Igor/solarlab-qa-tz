package pages;

import com.codeborne.selenide.SelenideElement;
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
List<SelenideElement> elements = $$("#content > div[itemtype = \"http://schema.org/Product\"]");

    public void iterateElements() throws IOException {

            FileWriter writer = new FileWriter("D:\\SOLARLAB\\output.txt");


        WebDriverWait driverWait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(20, 1));
            driverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Notifications span")));
            driverWait.until(ExpectedConditions.elementToBeClickable(loadMoreButton.scrollIntoView(
                    "{behavior: \"instant\", block: \"center\", inline: \"center\"}")));
            if (!elements.isEmpty()){
                           loadMoreButton.click();
            }

                long price;
                long summ = 0;

        // ожидаю получения строки с количеством "извещений" и записываю её в count
        String count = driverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Notifications > b > span"))).getText();

        // ожидаю, пока количество "извещений" станет доступным для итерации
        driverWait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("#content > div[itemtype = \"http://schema.org/Product\"]"), Integer.parseInt(count)));
            if (!elements.isEmpty()){
                for (WebElement element : elements) {
                    writer.write("STARTING PRICE: " + element.findElement(By.cssSelector("[itemprop=\"price\"]")).getText() + "\n");
                    price = parseClass.parserToLong(element.findElement(By.cssSelector("[itemprop=\"price\"]")).getText());
                    summ = price + summ;
            }
                writer.close();
                String s = parseClass.formatter(summ);
                    logger.info("SUMMARY: " + s);
        }
    }
}
