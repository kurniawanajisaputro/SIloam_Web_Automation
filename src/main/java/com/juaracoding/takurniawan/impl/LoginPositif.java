package com.juaracoding.takurniawan.impl;

import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.impl.LoginOutlineHooks;
import com.juaracoding.takurniawan.page.HomePage;
import com.juaracoding.takurniawan.page.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 *  URL : https://practicetestautomation.com/practice-test-login/
 */
public class LoginPositif {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
//    private LoginPage homePage;

    public LoginPositif(){
        this.driver = LoginOutlineHooks.driver;
        loginPage = new LoginPage(driver);
//        homePage = new LoginPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("Test001 Membuka Halaman Login")
    public void test001_membuka_halaman_login(){
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "Test001 Membuka Halaman Login");
    }

    @And("Test001 Clear Field Username Dan Password")
    public void test001_clear_field_username_dan_password(){
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test001 Clear Field Username Dan Password");
    }

    //    @And("^Pta001 Input (.*) dan (.*) Valid$")
    @And("^Test001 Input TextField (.*) Yang Valid One")
    public void test001_input_textfield_username_yang_valid_one(String username){
        loginPage.setTxtUsername(username);//STEP-2
        extentTest.log(LogStatus.PASS, "Test001 Input TextField <username> Yang Valid One");
    }

    @And("^Test001 Input TextField (.*) Yang Valid Two")
//    public void pta001_input_valid_two(String password){
    public void test001_input_textfield_password_yang_valid_two(String password){
        loginPage.setTxtPassword(password);//STEP-3
        extentTest.log(LogStatus.PASS, "Test001 Input TextField <password> Yang Valid Two");
    }

    @Then("Test001 Klik Tombol Login")
    public void test001_klik_tombol_login(){
        loginPage.setBtnLogin();//STEP-4
        extentTest.log(LogStatus.PASS, "Test001 Klik Tombol Login");
    }



//    @Then("Pta001 Menutup Browser")
//    public void pta001_menutup_browser(){
//        DriverSingleton.closeObjectInstance();
//    }
}