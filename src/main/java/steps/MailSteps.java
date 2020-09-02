package steps;

import org.junit.Assert;
import pages.BasePage;
import pages.MailPage;

public class MailSteps {

    public void stepFindUnreadLetters() {
        MailPage mailPage = new MailPage(BaseSteps.getDriver());
        BaseSteps.createAttachment(mailPage.getUnreadLettersQuantity());
    }

    public void stepMarkAllLettersAsRead() {
        new MailPage(BaseSteps.getDriver()).markAllLettersAsRead();

    }
}
