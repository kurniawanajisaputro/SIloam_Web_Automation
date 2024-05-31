package com.juaracoding.takurniawan.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 30/05/2024 16:39
@Last Modified 30/05/2024 16:39
Version 1.0
*/

import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageUploadDokumen {
    private WebDriver driver;
    @FindBy(xpath = "//code[contains(text(),'UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIU')]")
    private WebElement validasiDokumenBelumLengkap;

    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    private WebElement validasiUploadDokumen;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    private WebElement btnUploadFaskesAwal;

    @FindBy(xpath = "//h4[@class='modal-title']")
    private WebElement validasiUploadFoto;

    @FindBy(xpath = "//div[@id='message']")
    private WebElement validasiUploadFotoError5Mb;

    @FindBy(xpath = "//span[@id='error_message']")
    private WebElement validasiUploadFotoErrorFile;

    @FindBy(xpath = "//input[@id='file']")
    private WebElement btnPilihFileFaskesAwal;

    @FindBy(xpath = "//button[@id='btnSave']")
    private WebElement btnPilihSaveFileFaskesAwal;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement btnDataBerhasilUploadFaskesAwal;

    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    private WebElement btnUploadFaskesTujuan;

    @FindBy(xpath = "//input[@id='file']")
    private WebElement btnPilihFileFaskesTujuan;

    @FindBy(xpath = "//button[@id='btnSave']")
    private WebElement btnPilihSaveFileFaskesTujuan;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement btnDataBerhasilUploadFaskesTujuan;

    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    private WebElement btnUploadTandaTangan;

    @FindBy(xpath = "//input[@id='file']")
    private WebElement btnPilihFileTandaTangan;

    @FindBy(xpath = "//button[@id='btnSave']")
    private WebElement btnPilihSaveFileTandaTangan;

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement btnDataBerhasilUploadTandaTangan;

    @FindBy(xpath = "//strong[normalize-space()='Terima kasih dokumen anda sudah lengkap !']")
    private WebElement validasiDokumenLengkap;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement btnSelanjutnya;


    public HomePageUploadDokumen(){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    public HomePageUploadDokumen(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
//    public String uploadDokumenPageValidation(){
//        return validasiUploadDokumen==null?"":validasiUploadDokumen.getText();
//    }

    public WebElement uploadDokumenPageValidation(){
        return validasiUploadDokumen;
    }

    public String uploadDokumenBelumLengkap(){
        return validasiDokumenBelumLengkap==null?"":validasiDokumenBelumLengkap.getText();
    }

    public String setValidasiUploadFoto(){
        return validasiUploadFoto==null?"":validasiUploadFoto.getText();
    }

    public String setValidasiUploadFotoError5Mb(){
        return validasiUploadFotoError5Mb==null?"":validasiUploadFotoError5Mb.getText();
    }

    public String setValidasiUploadFotoErrorFile(){
        return validasiUploadFotoErrorFile==null?"":validasiUploadFotoErrorFile.getText();
    }

    public void setBtnUploadFaskesAwal(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnUploadFaskesAwal)).click();
    }

    public void setBtnPilihFileFaskesAwal(String fotoFaskesAwal) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.elementToBeClickable(btnPilihFileFaskesAwal)).sendKeys(fotoFaskesAwal);
    }


    public void setBtnPilihSaveFileFaskesAwal(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnPilihSaveFileFaskesAwal)).click();
    }
    public void setBtnDataBerhasilUploadFaskesAwal(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDataBerhasilUploadFaskesAwal)).click();
    }

    public void setBtnUploadFaskesTujuan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnUploadFaskesTujuan)).click();
    }
//    public void setBtnPilihFileFaskesTujuan(){
//        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(btnPilihFileFaskesTujuan)).click();
//    }

    public void setBtnPilihFileFaskesTujuan(String fotoFaskesTujuan) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.elementToBeClickable(btnPilihFileFaskesTujuan)).sendKeys(fotoFaskesTujuan);
    }

    public void setBtnPilihSaveFileFaskesTujuan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnPilihSaveFileFaskesTujuan)).click();
    }
    public void setBtnDataBerhasilUploadFaskesTujuan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDataBerhasilUploadFaskesTujuan)).click();
    }

    public void setBtnUploadTandaTangan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnUploadTandaTangan)).click();
    }
//    public void setBtnPilihFileTandaTangan(){
//        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(btnPilihFileTandaTangan)).click();
//    }

    public void setBtnPilihFileTandaTangan(String fotoFaskesTujuan) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.elementToBeClickable(btnPilihFileTandaTangan)).sendKeys(fotoFaskesTujuan);
    }

    public void setBtnPilihSaveFileTandaTangan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnPilihSaveFileTandaTangan)).click();
    }
    public void setBtnDataBerhasilUploadTandaTangan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDataBerhasilUploadTandaTangan)).click();
    }

    public String setValidasiDokumenLengkap(){
        return validasiDokumenLengkap==null?"":validasiDokumenLengkap.getText();
    }
    public void setBtnSelanjutnya(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSelanjutnya)).click();
    }

}
