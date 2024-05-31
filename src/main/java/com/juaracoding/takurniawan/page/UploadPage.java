package com.juaracoding.takurniawan.page;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 28/05/2024 12:12
@Last Modified 28/05/2024 12:12
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

public class UploadPage {
    private WebDriver driver;
    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    private WebElement validasiUploadDokumen;
    @FindBy(xpath = "//h4[@class='modal-title']")
    private WebElement validasiUploadFoto;
    @FindBy(xpath = "//div[@id='message']")
    private WebElement validasiUploadFotoError5Mb;
    @FindBy(xpath = "//span[@id='error_message']")
    private WebElement validasiUploadFotoErrorFile;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    private WebElement BtnFaskesAwal;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    private WebElement btnDataBerhasilUpload;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    private WebElement BtnFaskesTujuan;
    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    private WebElement BtnTTD;
    @FindBy(xpath = "//input[@id='file']")
    private WebElement BtnUploadFoto;
    @FindBy(xpath = "//button[@id='btnSave']")
    private WebElement BtnSave;
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement BtnCancel;
    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']   ")
    private WebElement BtnSelanjutnya;
    @FindBy(xpath = "//code[contains(text(),'UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIU')]")
    private WebElement validasiDokumenBelumLengkap;
    @FindBy(xpath = "//strong[normalize-space()='Terima kasih dokumen anda sudah lengkap !']")
    private WebElement validasiDokumenLengkap;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement btnSelanjutnya;

    public UploadPage(){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    public UploadPage(WebDriver driver) {
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
                .until(ExpectedConditions.visibilityOf(BtnFaskesAwal)).click();
    }

    public void setBtnPilihFileFaskesAwal(String fotoFaskesAwal) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.elementToBeClickable(BtnUploadFoto)).sendKeys(fotoFaskesAwal);
    }


    public void setBtnPilihSaveFileFaskesAwal(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(BtnSave)).click();
    }
    public void setBtnDataBerhasilUploadFaskesAwal(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDataBerhasilUpload)).click();
    }

    public void setBtnUploadFaskesTujuan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(BtnFaskesTujuan)).click();
    }
//    public void setBtnPilihFileFaskesTujuan(){
//        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(btnPilihFileFaskesTujuan)).click();
//    }

    public void setBtnPilihFileFaskesTujuan(String fotoFaskesTujuan) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.elementToBeClickable(BtnUploadFoto)).sendKeys(fotoFaskesTujuan);
    }

    public void setBtnPilihSaveFileFaskesTujuan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(BtnSave)).click();
    }
    public void setBtnDataBerhasilUploadFaskesTujuan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDataBerhasilUpload)).click();
    }

    public void setBtnUploadTandaTangan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(BtnUploadFoto)).click();
    }

    public void setBtnPilihFileTandaTangan(String fotoFaskesTujuan) {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.elementToBeClickable(BtnUploadFoto)).sendKeys(fotoFaskesTujuan);
    }

    public void setBtnPilihSaveFileTandaTangan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(BtnUploadFoto)).click();
    }
    public void setBtnDataBerhasilUploadTandaTangan(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDataBerhasilUpload)).click();
    }

    public String setValidasiDokumenLengkap(){
        return validasiDokumenLengkap==null?"":validasiDokumenLengkap.getText();
    }
    public void setBtnSelanjutnya(){
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSelanjutnya)).click();
    }
}
