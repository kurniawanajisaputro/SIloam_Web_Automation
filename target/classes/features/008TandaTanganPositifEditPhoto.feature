Feature: Tanda Tangan Positif Edit Photo
  Scenario: Test139 Valid Login Username (User)
    When Test139 Membuka Halaman Login
    And Test139 Clear Field Username Dan Password
    And Test139 Input TextField <username> Yang Valid One
    And Test139 Input TextField <password> Yang Valid Two
    And Test139 Klik Tombol Login
    Then Test139 Validasi Pada Halaman Home

    Examples:
      | username | password |
      | K6400001 | a |

  Scenario: Test140 Valid Input Data
    When Test140 Klik Tombol Input
    And Test140 Validasi Halaman Form Input
    And Test140 Input TextField <nama> Valid Satu
    And Test140 Input TextField <noBpjs> Valid Dua
    And Test140 Input TextField <noKtp> Valid Tiga
    And Test140 Input TextField <alamat> Valid Empat
    And Test140 Input TextField <kotaKtp> Valid Lima
    And Test140 Input TextField <faskesAwal> Valid Enam
    And Test140 Input TextField <faskesTujuan> Valid Tujuh
    And Test140 Input TextField <alasan> Valid Delapan
    Then Test140 Klik Tombol Simpan Data
    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | siapa saya | 1248674570982 | 4128946273017369 | di sini | KOTA JAKARTA SELATAN | di sana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test141 Valid Upload Foto
    When Test141 Validasi Halaman Upload Dokumen
    And Test141 Klik Upload Foto Faskes Awal
    And Test141 Memilih <fotoFaskesAwal> Pada Komputer Satu
    And Test141 Klik Simpan Foto Faskes Awal
    Then Test141 Klik Ok Data Faskes Awal Berhasil Upload
    And Test141 Klik Upload Foto Faskes Tujuan
    And Test141 Memilih <fotoFaskesTujuan> Pada Komputer Dua
    And Test141 Klik Simpan Foto Faskes Tujuan
    And Test141 Klik Ok Data Faskes Tujuan Berhasil Upload
    And Test141 Klik Upload Foto Tanda Tangan
    And Test141 Memilih <fotoTandaTangan> Pada Komputer Tiga
    And Test141 Klik Simpan Foto Tanda Tangan
    And Test141 Klik Ok Data Tanda Tangan Berhasil Upload
    And Test141 Validasi Dokumen Lengkap
    And Test141 Klik Selanjutnya
    Then Test141 Klik Ok Pop Up

    Examples:

      | fotoFaskesAwal | fotoFaskesTujuan | fotoTandaTangan |
      | \\foto\\excel_ms-5bfc379146e0fb00511cdefe.jpg | \\foto\\kissclipart-struktur-data-clipart-data-management-big-data-0756d9f65df60146.jpg | \\foto\\TABLEAU_SOFTWARE_LOGOjpg_Logo.jpg |

  Scenario: Test142 Tanda Tangan Digital Edit Photo
    When Test142 Validasi Halaman Tanda Tangan Digital
    And Test142 Scroll Bawah
    And Test142 Klik Add Files TTD
    And Test142 Memilih <fotoTandaTangan> Pada Komputer Tiga
    And Test142 Klik Save Foto Tanda Tangan
    And Test142 Klik Ok Data Tanda Tangan Berhasil Upload
    And Test142 Scroll Paling Bawah
    And Test142 Klik Tombol Submit
    And Test142 Klik Ok Pop Up
    And Test142 Klik Profil
    And Test142 Klik Logout
    Then Test142 Validasi Login Page

    Examples:

      | fotoFaskesAwal | fotoFaskesTujuan | fotoTandaTangan |
      |  |  | \\foto\\analysis_2318736.png |

#    Examples:
#      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
#      | siapa saya | 1248674570982 | 4128946273017369 | di sini | KOTA JAKARTA SELATAN | di sana    | Siloam Clinic Gran