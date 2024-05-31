package com.juaracoding.takurniawan.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 28/05/2024 17:51
@Last Modified 28/05/2024 17:51
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
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InputDataPositif {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage;
    private HomePageInput homePageInput;

    public InputDataPositif() {
        this.driver = LoginOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        homePageInput = new HomePageInput(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    /**
     * masuk kehalaman login
     */
    @When("Test006 Membuka Halaman Login")
    public void test006_membuka_halaman_login() {
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "Test006 Membuka Halaman Login");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    /**
     * membersihkan kotak username dan password jika terdapat isi nya yang tersimpan
     */
    @And("Test006 Clear Field Username Dan Password")
    public void test006_clear_field_username_dan_password() {
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test006 Clear Field Username Dan Password");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    /**
     * memasukan username yang benar (valid)
     */
    @And("^Test006 Input TextField (.*) Yang Valid One")
    public void test006_input_textfield_username_yang_valid_one(String username) {
        loginPage.setTxtUsername(username);
        extentTest.log(LogStatus.PASS, "Test006 Input TextField <username> Yang Valid One");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    /**
     * memasukan password yang benar (valid)
     */
    @And("^Test006 Input TextField (.*) Yang Valid Two")
    public void test006_input_textfield_password_yang_valid_two(String password) {
        loginPage.setTxtPassword(password);
        extentTest.log(LogStatus.PASS, "Test006 Input TextField <password> Yang Valid Two");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }

    /**
     * memencet tombol login
     */
    @And("Test006 Klik Tombol Login")
    public void test006_klik_tombol_login() {
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS, "Test006 Klik Tombol Login");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * melakukan validasi pada halaman home (DIKA | SILOAM)
     */
    @Then("Test006 Validasi Pada Halaman Home")
    public void test006_validasi_pada_halaman_home() {
        String homeValidation = homePageInput.homeSiloamValidation();
        org.junit.Assert.assertEquals(homeValidation, "DIKA | SILOAM");
        extentTest.log(LogStatus.PASS, "Test006 Validasi Pada Halaman Home");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memencet tombol input pada bagian kiri layar
     */
    @When("Test007 Klik Tombol Input")
    public void test007_klik_tombol_input() {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].click()", homePageInput.setBtnInput());
        extentTest.log(LogStatus.PASS, "Test007 Klik Tombol Input");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * melakukan validasi pada halaman input (Form Input)
     */
    @And("Test007 Validasi Halaman Form Input")
    public void test007_validasi_halaman_form_input() {
        String formInputValidation = homePageInput.getLogoFormInput();
        System.out.println(formInputValidation);
        Assert.assertEquals(formInputValidation, "Form Input");
        extentTest.log(LogStatus.PASS, "Test007 Validasi Halaman Form Input");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan nama ke dalam Form Input
     */
    @And("^Test007 Input TextField (.*) Valid Satu")
    public void test007_input_textfield_nama_valid_satu(String nama) {
        homePageInput.txtInputNama(nama);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField Nama Valid Satu");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan no BPJS ke dalam Form Input
     */
    @And("^Test007 Input TextField (.*) Valid Dua")
    public void test007_input_textfield_nobpjs_valid_dua(String noBpjs) {
        homePageInput.txtInputNoBPJS(noBpjs);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField No BPJS Valid Dua");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan no KTP ke dalam Form Input
     */
    @And("^Test007 Input TextField (.*) Valid Tiga")
    public void test007_input_textfield_noktp_valid_tiga(String noKtp) {
        homePageInput.txtInputNoKTP(noKtp);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField No KTP Valid Tiga");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan alamat ke dalam Form Input
     */
    @And("^Test007 Input TextField (.*) Valid Empat")
    public void test007_input_textfield_alamat_valid_empat(String alamat) {
        homePageInput.txtInputAlamat(alamat);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField Alamat Valid Empat");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan dan memilih kota KTP ke dalam Form Input menggunakan select dan input kata
     */
    @And("^Test007 Input TextField (.*) Valid Lima")
    public void test007_imput_textfield_kotaktp_valid_lima(String kotaKtp) {
        homePageInput.slctKotaKtp(kotaKtp);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField Kota KTP Valid Lima");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan kota faskes awal ke dalam Form Input
     */
    @And("^Test007 Input TextField (.*) Valid Enam")
    public void test007_input_textfield_faskesawal_valid_enam(String faskesAwal) {
        homePageInput.txtInputFaskesAwal(faskesAwal);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField Faskes Awal Valid Enam");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan dan memilih kota lokasi faskes tujuan ke dalam Form Input menggunakan select dan input kata
     */
    @And("^Test007 Input TextField (.*) Valid Tujuh")
    public void test007_input_textfield_faskestujuan_valid_tujuh(String faskesTujuan) {
        homePageInput.slctFaskesTujuan(faskesTujuan);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField Faskes Tujuan Valid Tujuh");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memasukan alasan pindah faskes, jika faskes awal dan faskes tujuan berbeda, ke dalam Form Input
     */
    @And("^Test007 Input TextField (.*) Valid Delapan")
    public void test007_input_textfield_alasan_valid_delapan(String alasan) {
        homePageInput.txtInputAlasan(alasan);
        extentTest.log(LogStatus.PASS, "Test007 Input TextField Alasan Valid Delapan");
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
    /**
     * memencet tombol simpan data, untuk menyimpan data yang telah di isi, dan melanjutkan ke tahapan upload dokumen
     */
    @When("Test007 Klik Tombol Simpan Data")
    public void test007_klik_tombol_simpan_data() {
        homePageInput.setBtnSimpanData();
        extentTest.log(LogStatus.PASS, "Test007 Klik Tombol Simpan Data");
        String formUploadDokumenValidation = homePageInput.uploadDokumenValidasi();
        System.out.println(formUploadDokumenValidation);
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        Assert.assertEquals(formUploadDokumenValidation, "UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIUPLOAD HARAP UNTUK DI LENGKAPI !");
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    }
}

