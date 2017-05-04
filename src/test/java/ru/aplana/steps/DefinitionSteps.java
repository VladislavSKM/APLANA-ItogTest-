package ru.aplana.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import org.junit.Assert;
import ru.aplana.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUsersSteps;


    @Given("пользователь открывает главную станицу mail.ru")
    public void givenTheUserIsOnTheMailHomePage() {
        endUsersSteps.is_the_dictionaryPage_page();
    }



    @When("вводим логин: '$login'")
    public void whenTheUserStriingLogin(String login) {
        endUsersSteps.enters_login(login);
    }

    @When("вводим пароль: '$pass'")
    public void whenTheUserStriingPass(String pass) {
        endUsersSteps.enters_pass(pass);
    }

    @When("выполняем вход в аккаунт")
    public void whenTheUserSignIn() {
        endUsersSteps.clickSignInButton();
    }

    @When("выбираем виджет настроек")
    public void whenTheUserSelectTheWidgetSettings() {
        endUsersSteps.clickSettingsButton();
    }

    @When("переходим в настройку личных даных")
    public void whenGoToSetupPersonalData() {
        endUsersSteps.clickPersonalInformationButton();
    }

    @When("вводим имя пользователя:'$name'")
    public void whenTheUserserInputName(String name) {
        endUsersSteps.enters_Name(name);
    }

    @When("вводим фамилию пользователя:'$lastName'")
    public void whenTheUserserInputLastName(String lastname) {
        endUsersSteps.enters_LastName(lastname);
    }

    @When("сохраняем изменения")
    public void whenTheUserSaveInformation() {
        endUsersSteps.clickSaveButton();
    }


    @Then("снова открываем виджет настроек и сверяем введенные данные '$checkName'")
    public void whenReturnTotTheMainPageOpenTheSettingsAndCheckTheEnteredData(String checkName) {
        endUsersSteps.clickSettingsButton();
        Assert.assertTrue(endUsersSteps.checkResult().equals(checkName));
    }
}

