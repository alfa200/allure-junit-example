package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {

    @Step("Ввод логина {0} и домена {1}")
    public void stepInputLoginAndDomain(String login, String domain){
        MainPage mainPage = new MainPage(BaseSteps.getDriver());
        mainPage.fillField(mainPage.getLoginInput(), login);
        mainPage.selectDomain(domain);
    }

    @Step("Нажатие 'Ввести пароль'")
    public void stepPressEnterPasswordButton(){
        new MainPage(BaseSteps.getDriver()).pressEnterPasswordButton();
    }

    @Step("Ввод пароля {0}")
    public void stepInputPassword(String password) {
        MainPage mainPage = new MainPage(BaseSteps.getDriver());
        mainPage.fillField(mainPage.getPasswordInput(), password);
    }

    @Step("Нажатие 'Войти'")
    public void stepPressEnterButton(){
        new MainPage(BaseSteps.getDriver()).pressEnterButton();
    }


}