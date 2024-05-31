Feature: Input Positif
  Scenario: Test006 Login Valid Input Data (User)
    When Test006 Membuka Halaman Login
    And Test006 Clear Field Username Dan Password
    And Test006 Input TextField <username> Yang Valid One
    And Test006 Input TextField <password> Yang Valid Two
    Then Test006 Klik Tombol Login
    Then Test006 Validasi Pada Halaman Home

    Examples:
      | username | password |
      | K6400001 | a |

  Scenario: Test007 Input data Valid (user)
    When Test007 Klik Tombol Input
    Then Test007 Validasi Halaman Form Input
    And Test007 Input TextField <Nama> Valid Satu
    And Test007 Input TextField <noBpjs> Valid Dua
    And Test007 Input TextField <noKtp> Valid Tiga
    And Test007 Input TextField <alamat> Valid Empat
    And Test007 Input TextField <kotaKtp> Valid Lima
    And Test007 Input TextField <faskesAwal> Valid Enam
    And Test007 Input TextField <faskesTujuan> Valid Tujuh
    And Test007 Input TextField <alasan> Valid Delapan
    Then Test007 Klik Tombol Simpan Data

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | siapa saya | 1248674570982 | 4128946273017369 | di sini | KOTA JAKARTA SELATAN | di sana    | Siloam Clinic Grand Galaxy | ingin  |

#  Scenario: Test005 Valid Upload Foto
#    When Test005 Validasi Halaman Upload Dokumen
#    And Test005 Klik Upload Foto Faskes Awal
#    And Test005 Memilih <fotoFaskesAwal> Pada Komputer Satu
#    And Test005 Klik Simpan Foto Faskes Awal
#    Then Test005 Klik Ok Data Faskes Awal Berhasil Upload
#    And Test005 Klik Upload Foto Faskes Tujuan
#    And Test005 Memilih <fotoFaskesTujuan> Pada Komputer Dua
#    And Test005 Klik Simpan Foto Faskes Tujuan
#    And Test005 Klik Ok Data Faskes Tujuan Berhasil Upload
#    And Test005 Klik Upload Foto Tanda Tangan
#    And Test005 Memilih <fotoTandaTangan> Pada Komputer Tiga
#    And Test005 Klik Simpan Foto Tanda Tangan
#    And Test005 Klik Ok Data Tanda Tangan Berhasil Upload
#    And Test005 Validasi Dokumen Lengkap
#    Then Test005 Klik Selanjutnya
#
#    Examples:
#
#      | fotoFaskesAwal | fotoFaskesTujuan | fotoTandaTangan |
#      | C:\\Users\\imam-f\\Pictures\\Data data data\\cloudy_1163657.png | C:\\Users\\imam-f\\Pictures\\Data data data\\cloudy_1163657.png | C:\\Users\\imam-f\\Pictures\\Data data data\\cloudy_1163657.png |
