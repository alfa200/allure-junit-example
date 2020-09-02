package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(id = "mailbox:login")
    WebElement loginInput;

    @FindBy(id = "mailbox:password")
    WebElement passwordInput;

    @FindBy(id = "mailbox:domain")
    WebElement domainDroplist;

    @FindBy(css = "input.o-control")
    WebElement enterPasswordButton;

    @FindBy(css = "input.o-control")
    WebElement enterButton;


    public void selectDomain(String domain) {
        Select selectDomain = new Select(domainDroplist);
        selectDomain.selectByVisibleText("@" + domain);
    }

    public void pressEnterPasswordButton() {
        enterPasswordButton.click();
    }

    public void pressEnterButton() {
        enterButton.click();
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getLoginInput() {
        return loginInput;
    }

}
