package ru.aplana.steps.serenity;

import ru.aplana.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void is_the_dictionaryPage_page() {

        dictionaryPage.open();
    }


    @Step
    public void enters_login(String keyword) {

        dictionaryPage.enterLogin(keyword);
    }


    @Step
    public void enters_pass(String keyword) {

        dictionaryPage.enterPass(keyword);
    }


    @Step
    public void clickSignInButton() {

        dictionaryPage.clickSignInButton();
    }


    @Step
    public void clickSettingsButton() {

        dictionaryPage.clickSettingsButton();
    }


    @Step
    public void clickPersonalInformationButton() {

        dictionaryPage.clickPersonalInformationButton();

    }


    @Step
    public void enters_Name(String keyword) {

        dictionaryPage.enterName(keyword);
    }


    @Step
    public void enters_LastName(String keyword) {

        dictionaryPage.enterLastName(keyword);
    }


    @Step
    public void clickSaveButton() {

        dictionaryPage.clickSaveButton();
    }


    @Step
    public String checkResult() {
        return dictionaryPage.getTextForMyName();
    }



}