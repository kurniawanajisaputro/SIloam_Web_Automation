package com.juaracoding.takurniawan.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 30/05/2024 22:20
@Last Modified 30/05/2024 22:20
Version 1.0
*/
import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.page.HomePageInput;
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
import org.testng.Assert;

public class InputDataNegatif {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage;
    private HomePageInput homePageInput;

    public InputDataNegatif() {
        this.driver = LoginOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        homePageInput = new HomePageInput(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }
    @When("Test106 Membuka Halaman Login")
    public void test106_membuka_halaman_login(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "Test006 Membuka Halaman Login");
    }

    @And("Test106 Clear Field Username Dan Password")
    public void test106_clear_field_username_dan_password(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test106 Clear Field Username Dan Password");
    }

    //    @And("^Pta001 Input (.*) dan (.*) Valid$")
    @And("Test106 Input TextField Username Kosong")
    public void test106_input_textfield_username_kosong(){
        loginPage.setTxtUsername("");//STEP-2
        extentTest.log(LogStatus.PASS, "Test106 Input TextField Username Kosong");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @And("^Test106 Input TextField Password Kosong")
//    public void pta001_input_valid_two(String password){
    public void test106_input_textfield_password_kosong(){
        loginPage.setTxtPassword("");//STEP-3
        extentTest.log(LogStatus.PASS, "Test106 Input TextField Password Kosong");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @Then("Test106 Klik Tombol Login Dan Validation")
    public void test106_klik_tombol_login_dan_validation(){
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
        extentTest.log(LogStatus.PASS, "Test106 Validation Test");
    }

    @And("Test107 Clear Field Username Dan Password")
    public void test107_clear_field_username_dan_password(){
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test107 Clear Field Username Dan Password");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    //    @And("^Pta001 Input (.*) dan (.*) Valid$")
    @And("Test107 Input TextField Username Invalid (.*)$")
    public void test107_input_textfield_username_invalid(String username){
        loginPage.setTxtUsername(username);//STEP-2
        extentTest.log(LogStatus.PASS, "Test107 Input TextField Username Invalid");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @And("^Test107 Input TextField Password Invalid (.*)$")
//    public void pta001_input_valid_two(String password){
    public void test1077_input_textfield_password_invalid(String password){
        loginPage.setTxtPassword(password);//STEP-3
        extentTest.log(LogStatus.PASS, "Test107 Input TextField Password Valid");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    @Then("Test107 Klik Tombol Login Dan Validation")
    public void test107_klik_tombol_login_dan_validation() {
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
        extentTest.log(LogStatus.PASS, "Test107 Validation Test");
    }
    /**
     * membersihkan kotak username dan password jika terdapat isi nya yang tersimpan
     */
    @And("Test108 Clear Field Username Dan Password")
    public void test108_clear_field_username_dan_password() {
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test108 Clear Field Username Dan Password");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    /**
     * memasukan username yang benar (valid)
     */
    @And("^Test108 Input TextField (.*) Yang Valid One")
    public void test008_input_textfield_username_yang_valid_one(String username) {
        loginPage.setTxtUsername(username);
        extentTest.log(LogStatus.PASS, "Test008 Input TextField <username> Yang Valid One");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    /**
     * memasukan password yang benar (valid)
     */
    @And("^Test108 Input TextField (.*) Yang Valid Two")
    public void test008_input_textfield_password_yang_valid_two(String password) {
        loginPage.setTxtPassword(password);
        extentTest.log(LogStatus.PASS, "Test008 Input TextField <password> Yang Valid Two");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    /**
     * memencet tombol login
     */
    @And("Test108 Klik Tombol Login")
    public void test108_klik_tombol_login() {
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS, "Test108 Klik Tombol Login");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * melakukan validasi pada halaman home (DIKA | SILOAM)
     */
    @Then("Test108 Validasi Pada Halaman Home")
    public void test108_validasi_pada_halaman_home() {
        String homeValidation = homePageInput.homeSiloamValidation();
        org.junit.Assert.assertEquals(homeValidation, "DIKA | SILOAM");
        extentTest.log(LogStatus.PASS, "Test108 Validasi Pada Halaman Home");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memencet tombol input pada bagian kiri layar
     */
    @When("Test109 Klik Tombol Input")
    public void test109_klik_tombol_input() {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].click()", homePageInput.setBtnInput());
        extentTest.log(LogStatus.PASS, "Test109 Klik Tombol Input");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * melakukan validasi pada halaman input (Form Input)
     */
    @And("Test109 Validasi Halaman Form Input")
    public void test109_validasi_halaman_form_input() {
        String formInputValidation = homePageInput.getLogoFormInput();
        System.out.println(formInputValidation);
        org.junit.Assert.assertEquals(formInputValidation, "Form Input");
        extentTest.log(LogStatus.PASS, "Test109 Validasi Halaman Form Input");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan nama ke dalam Form Input
     */
    @And("^Test109 Input TextField Nama (.*)$")
    public void test109_input_textfield_nama(String nama) {
        homePageInput.txtInputNama(nama);
        extentTest.log(LogStatus.PASS, "Test109 Input TextField Nama Valid Satu");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan no BPJS ke dalam Form Input
     */
    @And("^Test109 Input TextField noBpjs (.*)$")
    public void test109_input_textfield_nobpjs(String noBpjs) {
        homePageInput.txtInputNoBPJS(noBpjs);
        extentTest.log(LogStatus.PASS, "Test109 Input TextField No BPJS");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan no KTP ke dalam Form Input
     */
    @And("^Test109 Input TextField noKtp (.*)$")
    public void test109_input_textfield_noktp(String noKtp) {
        homePageInput.txtInputNoKTP(noKtp);
        extentTest.log(LogStatus.PASS, "Test109 Input TextField No KTP");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan alamat ke dalam Form Input
     */
    @And("^Test109 Input TextField Alamat (.*)$")
    public void test109_input_textfield_alamat(String alamat) {
        homePageInput.txtInputAlamat(alamat);
        extentTest.log(LogStatus.PASS, "Test109 Input TextField Alamat");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan dan memilih kota KTP ke dalam Form Input menggunakan select dan input kata
     */
    @And("^Test109 Input TextField KotaKtp (.*)$")
    public void test109_imput_textfield_kotaktp(String kotaKtp) {
        homePageInput.slctKotaKtp(kotaKtp);
        extentTest.log(LogStatus.PASS, "Test109 Input TextField Kota KTP");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan kota faskes awal ke dalam Form Input
     */
    @And("^Test109 Input TextField FaskesAwal (.*)$")
    public void test109_input_textfield_faskesawal(String faskesAwal) {
        homePageInput.txtInputFaskesAwal(faskesAwal);
        extentTest.log(LogStatus.PASS, "Test109 Input TextField Faskes Awal");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan dan memilih kota lokasi faskes tujuan ke dalam Form Input menggunakan select dan input kata
     */
    @And("^Test109 Input TextField FaskesTujuan (.*)$")
    public void test109_input_textfield_faskestujuan(String faskesTujuan) {
        homePageInput.slctFaskesTujuan(faskesTujuan);
        extentTest.log(LogStatus.PASS, "Test109 Input TextField Faskes Tujuan");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan alasan pindah faskes, jika faskes awal dan faskes tujuan berbeda, ke dalam Form Input
     */
    @And("^Test109 Input TextField Alasan (.*)$")
    public void test109_input_textfield_alasan(String alasan) {
        homePageInput.txtInputAlasan(alasan);
        extentTest.log(LogStatus.PASS, "Test109 Input TextField Alasan");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    @Then("Test109 Klik Tombol Submit Dan Validation")
    public void test109_klik_tombol_submit_dan_validation() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePageInput.setBtnSimpanData();

        boolean isNama = homePageInput.getValidationNama();
        boolean isBpjs = homePageInput.getValidationBpjs();
        boolean isKtp = homePageInput.getValidationKtp();
        boolean isAlamat = homePageInput.getValidationAlamat();
//        boolean isKotaKtp = homePageInput.getValidationKotaKtp();
        boolean isFaskesAwal = homePageInput.getValidationFaskesAwal();
        boolean isAlasan = homePageInput.getValidationAlasan();
//        boolean isFaskesTujuan = homePageInput.getValidationFaskesTujuan();

        String notifikasiNegatif;
        if(!isNama && !isBpjs && !isKtp && !isAlamat && !isFaskesAwal && !isAlasan){
            notifikasiNegatif = "Test Case Input Nama Berhasil";
            System.out.println(notifikasiNegatif);
//            System.out.println("1");
        }else {
            notifikasiNegatif = "Test Case Gagal";
            System.out.println(notifikasiNegatif);
//            System.out.println("2");
        }
        Assert.assertEquals(notifikasiNegatif, "Test Case Gagal");
        extentTest.log(LogStatus.PASS, "Test109 Validation Test");
    }
    /**
     * memencet tombol input pada bagian kiri layar
     */
    @When("Test110 Klik Tombol Input")
    public void test110_klik_tombol_input() {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].click()", homePageInput.setBtnInput());
        extentTest.log(LogStatus.PASS, "Test109 Klik Tombol Input");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * melakukan validasi pada halaman input (Form Input)
     */
    @And("Test110 Validasi Halaman Form Input")
    public void test110_validasi_halaman_form_input() {
        String formInputValidation = homePageInput.getLogoFormInput();
        System.out.println(formInputValidation);
        org.junit.Assert.assertEquals(formInputValidation, "Form Input");
        extentTest.log(LogStatus.PASS, "Test110 Validasi Halaman Form Input");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    @And("^Test110 Input TextField Nama (.*)$")
    public void test110_input_textfield_nama(String nama) {
        homePageInput.txtInputNama(nama);
        extentTest.log(LogStatus.PASS, "Test110 Input TextField Nama Valid Satu");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan no BPJS ke dalam Form Input
     */
    @And("^Test110 Input TextField noBpjs (.*)$")
    public void test110_input_textfield_nobpjs(String noBpjs) {
        homePageInput.txtInputNoBPJS(noBpjs);
        extentTest.log(LogStatus.PASS, "Test110 Input TextField No BPJS");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan no KTP ke dalam Form Input
     */
    @And("^Test110 Input TextField noKtp (.*)$")
    public void test110_input_textfield_noktp(String noKtp) {
        homePageInput.txtInputNoKTP(noKtp);
        extentTest.log(LogStatus.PASS, "Test110 Input TextField No KTP");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan alamat ke dalam Form Input
     */
    @And("^Test110 Input TextField Alamat (.*)$")
    public void test110_input_textfield_alamat(String alamat) {
        homePageInput.txtInputAlamat(alamat);
        extentTest.log(LogStatus.PASS, "Test110 Input TextField Alamat");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan dan memilih kota KTP ke dalam Form Input menggunakan select dan input kata
     */
    @And("^Test110 Input TextField KotaKtp (.*)$")
    public void test110_imput_textfield_kotaktp(String kotaKtp) {
        homePageInput.slctKotaKtp(kotaKtp);
        extentTest.log(LogStatus.PASS, "Test110 Input TextField Kota KTP");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan kota faskes awal ke dalam Form Input
     */
    @And("^Test110 Input TextField FaskesAwal (.*)$")
    public void test110_input_textfield_faskesawal(String faskesAwal) {
        homePageInput.txtInputFaskesAwal(faskesAwal);
        extentTest.log(LogStatus.PASS, "Test110 Input TextField Faskes Awal");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan dan memilih kota lokasi faskes tujuan ke dalam Form Input menggunakan select dan input kata
     */
    @And("^Test110 Input TextField FaskesTujuan (.*)$")
    public void test110_input_textfield_faskestujuan(String faskesTujuan) {
        homePageInput.slctFaskesTujuan(faskesTujuan);
        extentTest.log(LogStatus.PASS, "Test110 Input TextField Faskes Tujuan");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan alasan pindah faskes, jika faskes awal dan faskes tujuan berbeda, ke dalam Form Input
     */
    @And("^Test110 Input TextField Alasan (.*)$")
    public void test110_input_textfield_alasan(String alasan) {
        homePageInput.txtInputAlasan(alasan);
        extentTest.log(LogStatus.PASS, "Test110 Input TextField Alasan");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    @Then("Test110 Klik Tombol Submit Dan Validation")
    public void test110_klik_tombol_submit_dan_validation() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePageInput.setBtnSimpanData();

        boolean isNama = homePageInput.getValidationNama();
        boolean isBpjs = homePageInput.getValidationBpjs();
        boolean isKtp = homePageInput.getValidationKtp();
        boolean isAlamat = homePageInput.getValidationAlamat();
//        boolean isKotaKtp = homePageInput.getValidationKotaKtp();
        boolean isFaskesAwal = homePageInput.getValidationFaskesAwal();
        boolean isAlasan = homePageInput.getValidationAlasan();
//        boolean isFaskesTujuan = homePageInput.getValidationFaskesTujuan();

        String notifikasiNegatif;
        if(!isNama && !isBpjs && !isKtp && !isAlamat && !isFaskesAwal && !isAlasan){
            notifikasiNegatif = "Test Case Input BPJS Berhasil";
            System.out.println(notifikasiNegatif);
//            System.out.println("1");
        }else {
            notifikasiNegatif = "Test Case Gagal";
            System.out.println(notifikasiNegatif);
//            System.out.println("2");
        }
        Assert.assertEquals(notifikasiNegatif, "Test Case Gagal");
        extentTest.log(LogStatus.PASS, "Test110 Validation Test");
    }
    /**
     * memencet tombol input pada bagian kiri layar
     */
    @When("Test111 Klik Tombol Input")
    public void test111_klik_tombol_input() {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].click()", homePageInput.setBtnInput());
        extentTest.log(LogStatus.PASS, "Test109 Klik Tombol Input");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * melakukan validasi pada halaman input (Form Input)
     */
    @And("Test111 Validasi Halaman Form Input")
    public void test111_validasi_halaman_form_input() {
        String formInputValidation = homePageInput.getLogoFormInput();
        System.out.println(formInputValidation);
        org.junit.Assert.assertEquals(formInputValidation, "Form Input");
        extentTest.log(LogStatus.PASS, "Test109 Validasi Halaman Form Input");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    @And("^Test111 Input TextField Nama (.*)$")
    public void test111_input_textfield_nama(String nama) {
        homePageInput.txtInputNama(nama);
        extentTest.log(LogStatus.PASS, "Test111 Input TextField Nama Valid Satu");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan no BPJS ke dalam Form Input
     */
    @And("^Test111 Input TextField noBpjs (.*)$")
    public void test111_input_textfield_nobpjs(String noBpjs) {
        homePageInput.txtInputNoBPJS(noBpjs);
        extentTest.log(LogStatus.PASS, "Test111 Input TextField No BPJS");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan no KTP ke dalam Form Input
     */
    @And("^Test111 Input TextField noKtp (.*)$")
    public void test111_input_textfield_noktp(String noKtp) {
        homePageInput.txtInputNoKTP(noKtp);
        extentTest.log(LogStatus.PASS, "Test111 Input TextField No KTP");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan alamat ke dalam Form Input
     */
    @And("^Test111 Input TextField Alamat (.*)$")
    public void test111_input_textfield_alamat(String alamat) {
        homePageInput.txtInputAlamat(alamat);
        extentTest.log(LogStatus.PASS, "Test111 Input TextField Alamat");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan dan memilih kota KTP ke dalam Form Input menggunakan select dan input kata
     */
    @And("^Test111 Input TextField KotaKtp (.*)$")
    public void test111_imput_textfield_kotaktp(String kotaKtp) {
        homePageInput.slctKotaKtp(kotaKtp);
        extentTest.log(LogStatus.PASS, "Test111 Input TextField Kota KTP");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan kota faskes awal ke dalam Form Input
     */
    @And("^Test111 Input TextField FaskesAwal (.*)$")
    public void test111_input_textfield_faskesawal(String faskesAwal) {
        homePageInput.txtInputFaskesAwal(faskesAwal);
        extentTest.log(LogStatus.PASS, "Test111 Input TextField Faskes Awal");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan dan memilih kota lokasi faskes tujuan ke dalam Form Input menggunakan select dan input kata
     */
    @And("^Test111 Input TextField FaskesTujuan (.*)$")
    public void test111_input_textfield_faskestujuan(String faskesTujuan) {
        homePageInput.slctFaskesTujuan(faskesTujuan);
        extentTest.log(LogStatus.PASS, "Test111 Input TextField Faskes Tujuan");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan alasan pindah faskes, jika faskes awal dan faskes tujuan berbeda, ke dalam Form Input
     */
    @And("^Test111 Input TextField Alasan (.*)$")
    public void test111_input_textfield_alasan(String alasan) {
        homePageInput.txtInputAlasan(alasan);
        extentTest.log(LogStatus.PASS, "Test111 Input TextField Alasan");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    @Then("Test111 Klik Tombol Submit Dan Validation")
    public void test111_klik_tombol_submit_dan_validation() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        homePageInput.setBtnSimpanData();

        boolean isNama = homePageInput.getValidationNama();
        boolean isBpjs = homePageInput.getValidationBpjs();
        boolean isKtp = homePageInput.getValidationKtp();
        boolean isAlamat = homePageInput.getValidationAlamat();
//        boolean isKotaKtp = homePageInput.getValidationKotaKtp();
        boolean isFaskesAwal = homePageInput.getValidationFaskesAwal();
        boolean isAlasan = homePageInput.getValidationAlasan();
//        boolean isFaskesTujuan = homePageInput.getValidationFaskesTujuan();

        String notifikasiNegatif;
        if(!isNama && !isBpjs && !isKtp && !isAlamat && !isFaskesAwal && !isAlasan){
            notifikasiNegatif = "Test Case Input KTP Berhasil";
            System.out.println(notifikasiNegatif);
//            System.out.println("1");
        }else {
            notifikasiNegatif = "Test Case Gagal";
            System.out.println(notifikasiNegatif);
//            System.out.println("2");
        }
        Assert.assertEquals(notifikasiNegatif, "Test Case Gagal");
        extentTest.log(LogStatus.PASS, "Test110 Validation Test");
    }
}
