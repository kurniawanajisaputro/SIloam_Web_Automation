package com.juaracoding.takurniawan.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 30/05/2024 16:16
@Last Modified 30/05/2024 16:16
Version 1.0
*/
import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.connection.DriverSingleton;
import com.juaracoding.takurniawan.util.GlobalFunction;
import com.juaracoding.takurniawan.page.HomePage_Input;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageInput {
    private WebDriver driver;
    @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
    private WebElement logoSiloam;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    private WebElement logoProfil;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    private WebElement btnLogOut;

    @FindBy(xpath = "//span[normalize-space()='Home']")
    private WebElement btnHome;

    @FindBy(xpath = "//span[normalize-space()='Input']")
    private WebElement btnInput;

    @FindBy(xpath = "//span[normalize-space()='New']")
    private WebElement btnNew;

    @FindBy(xpath = "//i[@class='fa fa-angle-double-left']")
    private WebElement menutupNavigationMenu;

    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement formInputData;

    @FindBy(xpath = "//label[@for='name']")
    private WebElement strNama;

    @FindBy(xpath = "//label[@for='no_bpjs']")
    private WebElement strNoBpjs;

    @FindBy(xpath = "//label[@for='no_ktp']")
    private WebElement strNoKtp;

    @FindBy(xpath = "//label[@for='address']")
    private WebElement strAlamat;

    @FindBy(xpath = "//label[@for='ktp_city']")
    private WebElement strKotaKtp;

    @FindBy(xpath = "//label[@for='origin_faskes']")
    private WebElement strFaskesAwal;

    @FindBy(xpath = "//label[@for='destination_faskes']")
    private WebElement strFaskesTujuan;

    @FindBy(xpath = "//label[@for='reason']")
    private WebElement strAlasan;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement txtNama;

    @FindBy(xpath = "//input[@id='no_bpjs']")
    private WebElement txtBpjs;

    @FindBy(xpath = "//input[@id='no_ktp']")
    private WebElement txtKtp;

    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement txtAlamat;

    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    private WebElement selectKotaKtp;

    @FindBy(xpath = "//input[@role='textbox']")
    private WebElement txtKotaKtp;


    @FindBy(xpath = "//input[@id='origin_faskes']")
    private WebElement txtFaskesAwal;

    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    private WebElement selectFaskesTujuan;

    @FindBy(xpath = "//input[@role='textbox']")
    private WebElement txtFaskesTujuan;

    @FindBy(xpath = "//textarea[@id='reason']")
    private WebElement txtAlasan;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSimpanData;

    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    private WebElement strAlamatHarusDiisi;

    @FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
    private WebElement strAlasanHarusDiisi;


    @FindBy(xpath = "//code[contains(text(),'UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIU')]")
    private WebElement strValidasiUploadDokumen;


    public HomePageInput(){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    public HomePageInput(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String homeSiloamValidation(){
        return logoSiloam==null?"":logoSiloam.getText();
    }
    public void setLogoProfil(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(logoProfil)).click();
    }

    public void setBtnLogOut(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnLogOut)).click();
    }

    public void setBtnHome(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnHome)).click();
    }
    public WebElement setBtnInput(){
        return btnInput;
    }
    public void setBtnNew(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnNew)).click();
    }
    public String getLogoFormInput(){
        return formInputData==null?"":formInputData.getText();
    }
    public void txtInputNama(String nama) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtNama)).sendKeys(nama);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void txtInputNoBPJS(String noBpjs) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtBpjs)).sendKeys(noBpjs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void txtInputNoKTP(String noKtp) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtKtp)).sendKeys(noKtp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void txtInputAlamat(String alamat) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtAlamat)).sendKeys(alamat);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void slctKotaKtp(String kotaKtp) {
        // Klik pada Select2 input
        selectKotaKtp.click();

        GlobalFunction.delay(Constants.TIMEOUT_DELAY);

        // Masukkan teks kota yang dicari
        txtKotaKtp.sendKeys(kotaKtp);

        // Tunggu hingga opsi muncul dan klik opsi yang cocok
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
        WebElement optionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), '" + kotaKtp + "')]")));
        optionElement.click();
    }

    //public void inputKotaKtp(String kotaKtp) {
//    GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//    try {
//        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(txtKotaKtp)).sendKeys(kotaKtp);
//    } catch (Exception e) {
//        throw new RuntimeException(e);
//    }
//}
    public void txtInputFaskesAwal(String faskesAwal) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFaskesAwal)).sendKeys(faskesAwal);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    public void slctFaskesTujuan(String faskesTujuan) {
//        Select strSelect = new Select(selectFaskesTujuan);
//        strSelect.selectByValue(faskesTujuan);
//    }

    //    public void slctFaskesTujuan(){
//        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(selectFaskesTujuan)).click();
//    }
//
//    public void txtInputFaskesTujuan(String faskesTujuan) {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        try {
//            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                    .until(ExpectedConditions.visibilityOf(txtFaskesTujuan)).sendKeys(faskesTujuan);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
    public void slctFaskesTujuan(String faskesTujuan) {
        // Klik pada Select2 input
        selectFaskesTujuan.click();

        GlobalFunction.delay(Constants.TIMEOUT_DELAY);

        // Masukkan teks kota yang dicari
        txtFaskesTujuan.sendKeys(faskesTujuan);

        // Tunggu hingga opsi muncul dan klik opsi yang cocok
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
        WebElement optionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), '" + faskesTujuan + "')]")));
        optionElement.click();
    }


    public void txtInputAlasan(String alasan) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtAlasan)).sendKeys(alasan);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void setBtnSimpanData(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSimpanData)).click();
    }

    public String uploadDokumenValidasi(){
        return strValidasiUploadDokumen==null?"":strValidasiUploadDokumen.getText();
    }
    public boolean getValidationNama(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", txtNama);
    }
    public boolean getValidationBpjs(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", txtBpjs);
    }
    public boolean getValidationKtp(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", txtKtp);
    }
    public boolean getValidationAlamat(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", txtAlamat);
    }
    public boolean getValidationKotaKtp(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", selectKotaKtp);
    }
    public boolean getValidationFaskesAwal(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", txtFaskesAwal);
    }
    public boolean getValidationAlasan(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", txtAlasan);
    }
    public boolean getValidationFaskesTujuan(){
        return (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", selectFaskesTujuan);
    }
    public void clear() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            /**Nama dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtNama)).clear();
            /**NoBpjs dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtBpjs)).clear();
            /**NoKtp dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtKtp)).clear();
            /**Alamat dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtAlamat)).clear();
            /**KotaKtp dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(selectKotaKtp)).clear();
            /**FaskesAwal dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFaskesAwal)).clear();
            /**Alasan dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtAlasan)).clear();
            /**FaskesTujuan dikosongkan**/
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(selectFaskesTujuan)).clear();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
