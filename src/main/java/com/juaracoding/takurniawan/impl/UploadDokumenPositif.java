package com.juaracoding.takurniawan.impl;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 29/05/2024 23:50
@Last Modified 29/05/2024 23:50
Version 1.0
*/

import com.juaracoding.takurniawan.connection.Constants;
import com.juaracoding.takurniawan.page.HomePageInput;
import com.juaracoding.takurniawan.page.HomePageUploadDokumen;
import com.juaracoding.takurniawan.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class UploadDokumenPositif {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private HomePageInput homePageInput;

    private HomePageUploadDokumen homePageUploadDokumen;

    public UploadDokumenPositif() {
        this.driver = LoginOutlineHooks.driver;
        homePageInput = new HomePageInput(driver);
        homePageUploadDokumen = new HomePageUploadDokumen(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }

    //    /**
    //     * masuk kehalaman login
    //     */
    //    @When("Test005 Validasi Halaman Upload Dokumen")
    //    public void test005_validasi_halaman_upload_dokumen() {
    //        // Menggunakan JavaScript Executor untuk mengambil teks dari elemen yang divalidasi
    //        JavascriptExecutor js = (JavascriptExecutor) this.driver;
    //        String script = "return arguments[0].innerText;";
    //        String dokumenValidation = (String) js.executeScript(script, homePageUploadDokumen.uploadDokumenPageValidation());
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //        System.out.println(dokumenValidation);
    //        // Validasi teks halaman upload dokumen
    //        Assert.assertEquals(dokumenValidation, "Upload Document   ");
    //        extentTest.log(LogStatus.PASS, "Test005 Validasi Halaman Upload Dokumen");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    /**
    //     * membersihkan kotak username dan password jika terdapat isi nya yang tersimpan
    //     */
    //    @And("Test005 Klik Upload Foto Faskes Awal")
    //    public void test005_klik_upload_foto_faskes_awal() {
    //        homePageUploadDokumen.setBtnUploadFaskesAwal();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Upload Foto Faskes Awal");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("^Test005 Memilih (.*) Pada Komputer Satu")
    //    public void test005_memilih_foto_faskes_awal_pada_komputer_satu(String fotoFaskesAwal) {
    //        homePageUploadDokumen.setBtnPilihFileFaskesAwal(fotoFaskesAwal);
    //        extentTest.log(LogStatus.PASS, "Test005 Memilih Foto Faskes Awal Pada Komputer Satu");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("Test005 Klik Simpan Foto Faskes Awal")
    //    public void test005_klik_simpan_foto_faskes_awal() {
    //        homePageUploadDokumen.setBtnPilihSaveFileFaskesAwal();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Simpan Foto Faskes Awal");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("Test005 Klik Ok Data Faskes Awal Berhasil Upload")
    //    public void test005_klik_ok_data_faskes_awal_berhasil_upload() {
    //        homePageUploadDokumen.setBtnDataBerhasilUploadFaskesAwal();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Ok Data Faskes Awal Berhasil Upload");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //
    //
    //
    //    @And("Test005 Klik Upload Foto Faskes Tujuan")
    //    public void test005_klik_upload_foto_faskes_tujuan() {
    //        homePageUploadDokumen.setBtnUploadFaskesTujuan();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Upload Foto Faskes Tujuan");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("^Test005 Memilih (.*) Pada Komputer Dua")
    //    public void test005_memilih_foto_faskes_tujuan_pada_komputer_dua(String fotoFaskesTujuan) {
    //        homePageUploadDokumen.setBtnPilihFileFaskesTujuan(fotoFaskesTujuan);
    //        extentTest.log(LogStatus.PASS, "Test005 Memilih Foto Faskes Awal Pada Komputer Dua");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("Test005 Klik Simpan Foto Faskes Tujuan")
    //    public void test005_klik_simpan_foto_faskes_tujuan() {
    //        homePageUploadDokumen.setBtnPilihSaveFileFaskesTujuan();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Simpan Foto Faskes Tujuan");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("Test005 Klik Ok Data Faskes Tujuan Berhasil Upload")
    //    public void test005_klik_ok_data_faskes_tujuan_berhasil_upload() {
    //        homePageUploadDokumen.setBtnDataBerhasilUploadFaskesTujuan();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Ok Data Faskes Tujuan Berhasil Upload");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //
    //
    //    @And("Test005 Klik Upload Foto Tanda Tangan")
    //    public void test005_klik_upload_foto_tanda_tangan() {
    //        homePageUploadDokumen.setBtnUploadTandaTangan();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Upload Foto Tanda Tangan");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("^Test005 Memilih (.*) Pada Komputer Tiga")
    //    public void test005_memilih_foto_tanda_tangan_pada_komputer_dua(String fotoTandaTangan) {
    //        homePageUploadDokumen.setBtnPilihFileTandaTangan(fotoTandaTangan);
    //        extentTest.log(LogStatus.PASS, "Test005 Memilih Foto Tanda Tangan Pada Komputer Tiga");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("Test005 Klik Simpan Foto Tanda Tangan")
    //    public void test005_klik_simpan_foto_tanda_tangan() {
    //        homePageUploadDokumen.setBtnPilihSaveFileTandaTangan();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Simpan Foto Tanda Tangan");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //    @And("Test005 Klik Ok Data Tanda Tangan Berhasil Upload")
    //    public void test005_klik_ok_data_tanda_tangan_berhasil_upload() {
    //        homePageUploadDokumen.setBtnDataBerhasilUploadTandaTangan();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Ok Data Tanda Tangan Berhasil Upload");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //
    //    @And("Test005 Validasi Dokumen Lengkap")
    //    public void test005_validasi_dokumen_lengkap() {
    //        String strValidation = homePageUploadDokumen.setValidasiDokumenLengkap();
    //        System.out.println(strValidation);
    //        Assert.assertEquals(strValidation,"Terima kasih dokumen anda sudah lengkap !");
    //        extentTest.log(LogStatus.PASS, "Test005 Validasi Dokumen Lengkap");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
    //
    //    @Then("Test005 Klik Selanjutnya")
    //    public void test005_klik_selanjutnya() {
    //        homePageUploadDokumen.setBtnSelanjutnya();
    //        extentTest.log(LogStatus.PASS, "Test005 Klik Selanjutnya");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //
    //        Alert alert = driver.switchTo().alert();
    //
    //        // Mendapatkan teks dari popup (opsional)
    //        String alertText = alert.getText();
    //        System.out.println("Popup text: " + alertText);
    //
    //        // Mengklik tombol "OK" pada popup
    //        alert.accept();
    //
    //        extentTest.log(LogStatus.PASS, "Popup berhasil ditangani");
    //        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
    //    }
}
