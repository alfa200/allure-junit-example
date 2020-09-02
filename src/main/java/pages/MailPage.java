package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MailPage extends BasePage {

    public MailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "span[title=\"Пометить прочитанным\"]")
    List<WebElement> unreadLetter;


    public String getUnreadLettersQuantity() {
        return String.valueOf(unreadLetters().size());
    }


    public List<WebElement> unreadLetters() {
        return unreadLetter;
    }

    public void markAllLettersAsRead() {
        Actions actionProvider = new Actions(driver);
        for (WebElement wb : unreadLetter) {
            Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
            actionProvider.moveByOffset(100, 0).build().perform();
            wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
        }
    }


}
