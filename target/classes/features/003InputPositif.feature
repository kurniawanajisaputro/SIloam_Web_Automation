Feature: Input Positif
  Scenario: Test003 Valid Login Username (User)
    When Test003 Membuka Halaman Login
    And Test003 Clear Field Username Dan Password
    And Test003 Input TextField <username> Yang Valid One
    And Test003 Input TextField <password> Yang Valid Two
    And Test003 Klik Tombol Login
    Then Test003 Validasi Pada Halaman Home

    Examples:
      | username | password |
      | K6400001 | a |

  Scenario: Test004 Valid Input Data
    When Test004 Klik Tombol Input
    And Test004 Validasi Halaman Form Input
    And Test004 Input TextField <nama> Valid Satu
    And Test004 Input TextField <noBpjs> Valid Dua
    And Test004 Input TextField <noKtp> Valid Tiga
    And Test004 Input TextField <alamat> Valid Empat
    And Test004 Input TextField <kotaKtp> Valid Lima
    And Test004 Input TextField <faskesAwal> Valid Enam
    And Test004 Input TextField <faskesTujuan> Valid Tujuh
    And Test004 Input TextField <alasan> Valid Delapan
    Then Test004 Klik Tombol Simpan Data
    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | siapa saya | 1248674570982 | 4128946273017369 | di sini | KOTA JAKARTA SELATAN | di sana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test005 Valid Upload Foto
    When Test005 Validasi Halaman Upload Dokumen
    And Test005 Klik Upload Foto Faskes Awal
    And Test005 Memilih <fotoFaskesAwal> Pada Komputer Satu
    And Test005 Klik Simpan Foto Faskes Awal
    Then Test005 Klik Ok Data Faskes Awal Berhasil Upload
    And Test005 Klik Upload Foto Faskes Tujuan
    And Test005 Memilih <fotoFaskesTujuan> Pada Komputer Dua
    And Test005 Klik Simpan Foto Faskes Tujuan
    And Test005 Klik Ok Data Faskes Tujuan Berhasil Upload
    And Test005 Klik Upload Foto Tanda Tangan
    And Test005 Memilih <fotoTandaTangan> Pada Komputer Tiga
    And Test005 Klik Simpan Foto Tanda Tangan
    And Test005 Klik Ok Data Tanda Tangan Berhasil Upload
    And Test005 Validasi Dokumen Lengkap
    And Test005 Klik Selanjutnya
    Then Test005 Klik Ok Pop Up

    Examples:

      | fotoFaskesAwal | fotoFaskesTujuan | fotoTandaTangan |
      | \\foto\\excel_ms-5bfc379146e0fb00511cdefe.jpg | \\foto\\kissclipart-struktur-data-clipart-data-management-big-data-0756d9f65df60146.jpg | \\foto\\TABLEAU_SOFTWARE_LOGOjpg_Logo.jpg |

  Scenario: Test006 Tanda Tangan Digital
    When Test006 Validasi Halaman Tanda Tangan Digital
    And Test006 Scroll Paling Bawah
    And Test006 Klik Tombol Submit
    And Test006 Klik Ok Pop Up
    And Test006 Klik Profil
    And Test006 Klik Logout
    Then Test006 Validasi Login Page

  Scenario: Test007 Valid Login Username (Admin)
#    When Test007 Membuka Halaman Login
#    And Test007 Clear Field Username Dan Password
    When Test007 Clear Field Username Dan Password
    And Test007 Input TextField <username> Yang Valid One
    And Test007 Input TextField <password> Yang Valid Two
    And Test007 Klik Tombol Login
    And Test007 Validasi Pada Halaman Home
    And Test007 Klik Profil
    Then Test007 Klik Logout

    Examples:
      | username  | password      |
      | admindika | d1k4@passw0rd |