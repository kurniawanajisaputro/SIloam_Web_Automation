Feature: Tanda Tangan Positif Edit Personal
  Scenario: Test135 Valid Login Username (User)
    When Test135 Membuka Halaman Login
    And Test135 Clear Field Username Dan Password
    And Test135 Input TextField <username> Yang Valid One
    And Test135 Input TextField <password> Yang Valid Two
    And Test135 Klik Tombol Login
    Then Test135 Validasi Pada Halaman Home

    Examples:
      | username | password |
      | K6400001 | a |

  Scenario: Test136 Valid Input Data
    When Test136 Klik Tombol Input
    And Test136 Validasi Halaman Form Input
    And Test136 Input TextField <nama> Valid Satu
    And Test136 Input TextField <noBpjs> Valid Dua
    And Test136 Input TextField <noKtp> Valid Tiga
    And Test136 Input TextField <alamat> Valid Empat
    And Test136 Input TextField <kotaKtp> Valid Lima
    And Test136 Input TextField <faskesAwal> Valid Enam
    And Test136 Input TextField <faskesTujuan> Valid Tujuh
    And Test136 Input TextField <alasan> Valid Delapan
    Then Test136 Klik Tombol Simpan Data
    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | siapa saya | 1248674570982 | 4128946273017369 | di sini | KOTA JAKARTA SELATAN | di sana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test137 Valid Upload Foto
    When Test137 Validasi Halaman Upload Dokumen
    And Test137 Klik Upload Foto Faskes Awal
    And Test137 Memilih <fotoFaskesAwal> Pada Komputer Satu
    And Test137 Klik Simpan Foto Faskes Awal
    Then Test137 Klik Ok Data Faskes Awal Berhasil Upload
    And Test137 Klik Upload Foto Faskes Tujuan
    And Test137 Memilih <fotoFaskesTujuan> Pada Komputer Dua
    And Test137 Klik Simpan Foto Faskes Tujuan
    And Test137 Klik Ok Data Faskes Tujuan Berhasil Upload
    And Test137 Klik Upload Foto Tanda Tangan
    And Test137 Memilih <fotoTandaTangan> Pada Komputer Tiga
    And Test137 Klik Simpan Foto Tanda Tangan
    And Test137 Klik Ok Data Tanda Tangan Berhasil Upload
    And Test137 Validasi Dokumen Lengkap
    And Test137 Klik Selanjutnya
    Then Test137 Klik Ok Pop Up

    Examples:

      | fotoFaskesAwal | fotoFaskesTujuan | fotoTandaTangan |
      | \\foto\\excel_ms-5bfc379146e0fb00511cdefe.jpg | \\foto\\kissclipart-struktur-data-clipart-data-management-big-data-0756d9f65df60146.jpg | \\foto\\TABLEAU_SOFTWARE_LOGOjpg_Logo.jpg |

  Scenario: Test138 Tanda Tangan Digital Edit Personal
    When Test138 Validasi Halaman Tanda Tangan Digital
    And Test138 Klik Tombol Edit
    And Test138 Clear Field NoBpjs
    And Test138 Input TextField noBpjs
    And Test138 Klik Tombol Submit Edit Personal
    And Test138 Validasi Simpan Personal
    And Test138 Scroll Paling Bawah
    And Test138 Klik Tombol Submit
    And Test138 Klik Ok Pop Up
    And Test138 Klik Profil
    And Test138 Klik Logout
    Then Test138 Validasi Login Page

#    Examples:
#      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
#      | siapa saya | 1248674570982 | 4128946273017369 | di sini | KOTA JAKARTA SELATAN | di sana    | Siloam Clinic Gran