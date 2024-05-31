package com.juaracoding.takurniawan.impl;

import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.impl.LoginOutlineHooks;
import com.juaracoding.takurniawan.page.LoginPage;
import com.juaracoding.takurniawan.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginNegatif {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
//    private LoginPage homePage;

    public LoginNegatif(){
        this.driver = LoginOutlineHooks.driver;
        loginPage = new LoginPage(driver);
//        homePage = new LoginPage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    @When("Test102 Membuka Halaman Login")
    public void test102_membuka_halaman_login(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "Test002 Membuka Halaman Login");
    }

    @And("Test102 Clear Field Username Dan Password")
    public void test102_clear_field_username_dan_password(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test102 Clear Field Username Dan Password");
    }

    //    @And("^Pta001 Input (.*) dan (.*) Valid$")
    @And("Test102 Input TextField Username Kosong")
    public void test102_input_textfield_username_kosong(){
        loginPage.setTxtUsername("");//STEP-2
        extentTest.log(LogStatus.PASS, "Test102 Input TextField Username Kosong");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @And("^Test102 Input TextField Password Kosong")
//    public void pta001_input_valid_two(String password){
    public void test102_input_textfield_password_kosong(){
        loginPage.setTxtPassword("");//STEP-3
        extentTest.log(LogStatus.PASS, "Test102 Input TextField Password Kosong");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @Then("Test102 Klik Tombol Login Dan Validation")
    public void test102_klik_tombol_login_dan_validation(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.setBtnLogin();//STEP-4

        boolean isUsername = loginPage.getValidationUsername();
        boolean isPassword = loginPage.getValidationPassword();

        String notifikasiNegatif;
        if(!isUsername && !isPassword){
            notifikasiNegatif = "Test Case Login Empty Berhasil";
            System.out.println(notifikasiNegatif);
        }else {
            notifikasiNegatif = "Test Case Gagal";
            System.out.println(notifikasiNegatif);
        }
        Assert.assertEquals(notifikasiNegatif, "Test Case Login Empty Berhasil");
        extentTest.log(LogStatus.PASS, "Test102 Validation Test");
    }

    @And("Test103 Clear Field Username Dan Password")
    public void test103_clear_field_username_dan_password(){
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test103 Clear Field Username Dan Password");
    }

    //    @And("^Pta001 Input (.*) dan (.*) Valid$")
    @And("Test103 Input TextField Username Valid (.*)$")
    public void test103_input_textfield_username_Valid(String username){
        loginPage.setTxtUsername(username);//STEP-2
        extentTest.log(LogStatus.PASS, "Test103 Input TextField Username Valid");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @And("^Test103 Input TextField Password Invalid (.*)$")
//    public void pta001_input_valid_two(String password){
    public void test103_input_textfield_password_invalid(String password){
        loginPage.setTxtPassword(password);//STEP-3
        extentTest.log(LogStatus.PASS, "Test103 Input TextField Password Invalid");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @Then("Test103 Klik Tombol Login Dan Validation")
    public void test103_klik_tombol_login_dan_validation(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.setBtnLogin();//STEP-4

        boolean isUsername = loginPage.getValidationUsername();
        boolean isPassword = loginPage.getValidationPassword();

        String notifikasiNegatif;
        if(!isUsername && !isPassword){
            notifikasiNegatif = "Test Case Login Password Invalid Berhasil";
            System.out.println(notifikasiNegatif);
        }else {
            notifikasiNegatif = "Test Case Gagal";
            System.out.println(notifikasiNegatif);
        }
        Assert.assertEquals(notifikasiNegatif, "Test Case Login Password Invalid Berhasil");
        extentTest.log(LogStatus.PASS, "Test103 Validation Test");
    }

    @And("Test104 Clear Field Username Dan Password")
    public void test104_clear_field_username_dan_password(){
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test104 Clear Field Username Dan Password");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    //    @And("^Pta001 Input (.*) dan (.*) Valid$")
    @And("Test104 Input TextField Username Invalid (.*)$")
    public void test104_input_textfield_username_invalid(String username){
        loginPage.setTxtUsername(username);//STEP-2
        extentTest.log(LogStatus.PASS, "Test104 Input TextField Username Invalid");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @And("^Test104 Input TextField Password Valid (.*)$")
//    public void pta001_input_valid_two(String password){
    public void test104_input_textfield_password_valid(String password){
        loginPage.setTxtPassword(password);//STEP-3
        extentTest.log(LogStatus.PASS, "Test104 Input TextField Password Valid");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @Then("Test104 Klik Tombol Login Dan Validation")
    public void test104_klik_tombol_login_dan_validation() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.setBtnLogin();//STEP-4

        boolean isUsername = loginPage.getValidationUsername();
        boolean isPassword = loginPage.getValidationPassword();

        String notifikasiNegatif;
        if(!isUsername && !isPassword){
            notifikasiNegatif = "Test Case Login Username Invalid Berhasil";
            System.out.println(notifikasiNegatif);
        }else {
            notifikasiNegatif = "Test Case Gagal";
            System.out.println(notifikasiNegatif);
        }
        Assert.assertEquals(notifikasiNegatif, "Test Case Login Username Invalid Berhasil");
        extentTest.log(LogStatus.PASS, "Test104 Validation Test");
    }

    @And("Test105 Clear Field Username Dan Password")
    public void test105_clear_field_username_dan_password(){
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test105 Clear Field Username Dan Password");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    //    @And("^Pta001 Input (.*) dan (.*) Valid$")
    @And("Test105 Input TextField Username Invalid (.*)$")
    public void test105_input_textfield_username_invalid(String username){
        loginPage.setTxtUsername(username);//STEP-2
        extentTest.log(LogStatus.PASS, "Test104 Input TextField Username Invalid");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @And("^Test105 Input TextField Password Invalid (.*)$")
//    public void pta001_input_valid_two(String password){
    public void test105_input_textfield_password_invalid(String password){
        loginPage.setTxtPassword(password);//STEP-3
        extentTest.log(LogStatus.PASS, "Test105 Input TextField Password Valid");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @Then("Test105 Klik Tombol Login Dan Validation")
    public void test105_klik_tombol_login_dan_validation() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.setBtnLogin();//STEP-4

        boolean isUsername = loginPage.getValidationUsername();
        boolean isPassword = loginPage.getValidationPassword();

        String notifikasiNegatif;
        if(!isUsername && !isPassword){
            notifikasiNegatif = "Test Case Login Username dan Password Invalid Berhasil";
            System.out.println(notifikasiNegatif);
        }else {
            notifikasiNegatif = "Test Case Gagal";
            System.out.println(notifikasiNegatif);
        }
        Assert.assertEquals(notifikasiNegatif, "Test Case Login Username dan Password Invalid Berhasil");
        extentTest.log(LogStatus.PASS, "Test105 Validation Test");
    }
//    @Then("Pta001 Menutup Browser")
//    public void pta001_menutup_browser(){
//        DriverSingleton.closeObjectInstance();
//    }
}