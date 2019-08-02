package com.BriteERP.pages;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import com.BriteERP.utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//b[text()='Sign in']")
    public WebElement signInLocator;

    @FindBy(id = "login")
    public WebElement emailInputElement;

    @FindBy(id = "password")
    public WebElement passwordInputElement;


    @FindBy(css = "[class='btn btn-primary']")
    public WebElement LoginBtnElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void login(String username, String password){



        emailInputElement.sendKeys(username);
        passwordInputElement.sendKeys(password);
        LoginBtnElement.click();
    }


}
