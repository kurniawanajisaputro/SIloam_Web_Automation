package com.juaracoding.takurniawan.page;

import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
    private WebElement logoSiloamLogin;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    private WebElement btnLogOut;

    @FindBy(xpath = "//span[normalize-space()='Home']")
    private WebElement masukHome;

    @FindBy(xpath = "//span[normalize-space()='Input']")
    private WebElement masukInput;

    @FindBy(xpath = "//span[normalize-space()='New']")
    private WebElement masukNew;

    @FindBy(xpath = "//i[@class='fa fa-angle-double-left']")
    private WebElement menutupNavigationMenu;


    public HomePage(){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    public HomePage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement getDropDownMenuInput() {
        return masukInput;
    }
    public String homeSiloamValidation(){
        return logoSiloamLogin==null?"":logoSiloamLogin.getText();
    }

//
//    public void inputUsername(String username){
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        try{
//            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                    .until(ExpectedConditions.visibilityOf(txtFieldUsername)).sendKeys(username);
//        }catch (Exception e){
//            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
//        }
//    }
//
//    public void inputPassword(String password){
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        try{
//            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                    .until(ExpectedConditions.visibilityOf(txtFieldPassword)).sendKeys(password);
//        }catch (Exception e){
//            System.out.println("Komponen Text Field Password Tidak Ditemukan !!");
//        }
//    }
//
//    public void clickLogin(){
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        try{
//            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                    .until(ExpectedConditions.visibilityOf(btnSubmit)).click();
//        }catch (Exception e){
//            System.out.println("Komponen Tombol Tidak Ditemukan !!");
//        }
//    }
//
//    public void clear(){
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        try{
//            /** Set Field Password Empty String */
//            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                    .until(ExpectedConditions.visibilityOf(txtFieldPassword)).clear();
//            /** Set Field Username Empty String */
//            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                    .until(ExpectedConditions.visibilityOf(txtFieldUsername)).clear();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public String notificationLoginError(){
//        return notifLoginError ==null?"": new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(notifLoginError)).getText();
//    }
//
//    public String loginFormValidation(){
//        return labelLogin==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(labelLogin)).getText();
//    }
}