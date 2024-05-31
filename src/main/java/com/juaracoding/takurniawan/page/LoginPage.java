package com.juaracoding.takurniawan.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 28/05/2024 17:08
@Last Modified 28/05/2024 17:08
Version 1.0
*/
import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.connection.DriverSingleton;
import com.juaracoding.takurniawan.util.GlobalFunction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
    private WebElement logoSiloamLogin;

    @FindBy(xpath = "//label[normalize-space()='Username :']")
    private WebElement usernameLogo;

    @FindBy(xpath = "//label[normalize-space()='Password :']")
    private WebElement passwordLogo;

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement txtUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    public LoginPage() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public LoginPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String homeSiloamValidation(){
        return logoSiloamLogin==null?"":logoSiloamLogin.getText();
    }

    public void setBtnLogin(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnLogin)).click();
    }
    public WebElement setTxtUsername(String username){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtUsername)).sendKeys(username);
        return null;
    }
    public WebElement setTxtPassword(String password){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password);
        return null;
    }
    public boolean getValidationUsername(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", txtUsername);
    }

    public boolean getValidationPassword(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", txtPassword);
    }

    public void clear() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            /**Username dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtUsername)).clear();
            /**Password dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtPassword)).clear();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
