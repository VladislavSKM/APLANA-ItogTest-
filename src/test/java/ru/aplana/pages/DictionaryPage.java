package ru.aplana.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://mail.ru/")

public class DictionaryPage extends PageObject {

    @FindBy(xpath = "//input[@id='mailbox__login']")

    private WebElementFacade login;

    @FindBy(xpath = "//*[@id='mailbox__password']")

    private WebElementFacade password;

    @FindBy(xpath = "//*[@id='mailbox__auth__button']")

    private WebElementFacade signInButton;

    @FindBy(xpath = "//i[@id='PH_user-email']")

    private WebElementFacade settingsButton;

    @FindBy(xpath = "//span[.='Личные данные']")

    private WebElementFacade  personalInformationButton;

    @FindBy(xpath = "//input[@id='FirstName']")

    private WebElementFacade name;

    @FindBy(xpath = "//input[@id='LastName']")

    private WebElementFacade lastName;

    @FindBy(xpath="//button [@class='btn btn_main btn_stylish']/descendant::span[.='Сохранить']")

    private WebElementFacade saveButton;


    @FindBy(xpath ="//div[@class='x-ph__auth_list__item__info__email__text']")

    private WebElementFacade myName;




    public void enterLogin(String keyword) {
        login.type(keyword);
    }


    public void enterPass(String keyword) {

        password.type(keyword);
    }


    public void clickSignInButton() {

        signInButton.click();
    }


    public void clickSettingsButton() {

        settingsButton.click();
    }


    public void clickPersonalInformationButton() {

        personalInformationButton.click();
    }


    public void enterName(String keyword) {
        name.type(keyword);
    }


    public void enterLastName(String keyword) {
        lastName.type(keyword);
    }


    public void clickSaveButton() {

        saveButton.click();
    }


    public String getTextForMyName() {
        return myName.getText();
    }



}