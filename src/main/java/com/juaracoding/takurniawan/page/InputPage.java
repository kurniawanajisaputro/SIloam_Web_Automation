package com.juaracoding.takurniawan.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 28/05/2024 11:19
@Last Modified 28/05/2024 11:19
Version 1.0
*/
import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.connection.DriverSingleton;
import com.juaracoding.takurniawan.util.GlobalFunction;
import com.juaracoding.takurniawan.page.HomePage_Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputPage {
    private WebDriver driver;
    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement menuTitle;
    @FindBy(xpath = "//span[normalize-space()='Input']")
    private WebElement masukInput;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement txtNama;
    @FindBy(xpath = "//input[@id='no_bpjs']")
    private WebElement txtNoBPJS;
    @FindBy(xpath = "//input[@id='no_ktp']")
    private WebElement txtNoKTP;
    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement txtAlamat;
    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    private WebElement selectKota;
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
    private WebElement BtnSubmit;
    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    private WebElement strAlamatHarusDiisi;
    @FindBy(xpath = "//code[contains(text(),'UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIU')]")
    private WebElement validasibelumlengkapUploadDokumen;
    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    private WebElement validasiUploadDokumen;

    public InputPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public String InputPageValidation(){
        return menuTitle==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(menuTitle)).getText();
    }
    public void inputNama(String Nama){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtNama)).sendKeys(Nama);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void InputNoBPJS(String NoBPJS){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtNoBPJS)).sendKeys(NoBPJS);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void InputNoKTP(String NoKTP){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtNoKTP)).sendKeys(NoKTP);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void InputAlamat(String Alamat){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtAlamat)).sendKeys(Alamat);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void slctKotaKtp(String kotaKtp) {
        // Klik pada Select2 input
        selectKota.click();

        GlobalFunction.delay(Constants.TIMEOUT_DELAY);

        // Masukkan teks kota yang dicari
        txtKotaKtp.sendKeys(kotaKtp);

        // Tunggu hingga opsi muncul dan klik opsi yang cocok
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
        WebElement optionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), '" + kotaKtp + "')]")));
        optionElement.click();
    }
    public void InputFaskesAwal(String FaskesAwal){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFaskesAwal)).sendKeys(FaskesAwal);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
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
    public void InputAlasan(String Alasan){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtAlasan)).sendKeys(Alasan);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void setBtnSimpanData(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(BtnSubmit)).click();
    }

    public String uploadDokumenValidasi(){
        return validasiUploadDokumen==null?"":validasiUploadDokumen.getText();
    }

}
