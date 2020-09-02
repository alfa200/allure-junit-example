package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;


public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MailSteps mailSteps = new MailSteps();

    @When("^Нажата кнопка Ввести пароль$")
    public void pressEnterPasswordButton(){
        mainSteps.stepPressEnterPasswordButton();
    }

    @When("^Введен логин и домен:$")
    public void fillLoginAndDomain(DataTable fields){
        Map<String, String> hMap = fields.asMap(String.class, String.class);
        mainSteps.stepInputLoginAndDomain(hMap.get("Логин"), hMap.get("Домен"));
    }

    @When("^Введен пароль:$")
    public void fillPassword(DataTable fields){
        Map<String, String> hMap = fields.asMap(String.class, String.class);
        mainSteps.stepInputPassword(hMap.get("Пароль"));
    }

    @When("^Нажата кнопка Войти$")
    public void pressEnterButton(){
        mainSteps.stepPressEnterButton();
    }

    @When("^Осуществляется поиск непрочитанных писем$")
    public void findUnreadLetters(){
        mailSteps.stepFindUnreadLetters();
    }

    @Then("^Отмечаются все письма, как прочитанные$")
    public void markAllLettersAsRead() {
        mailSteps.stepMarkAllLettersAsRead();
    }

}