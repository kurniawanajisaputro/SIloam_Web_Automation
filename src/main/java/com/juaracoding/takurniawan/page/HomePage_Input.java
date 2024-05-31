package com.juaracoding.takurniawan.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 28/05/2024 17:03
@Last Modified 28/05/2024 17:03
Version 1.0
*/
import com.juaracoding.takurniawan.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage_Input {
    private WebDriver driver;
    @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
    private WebElement logoSiloam;

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


    public HomePage_Input(){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    public HomePage_Input(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
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
