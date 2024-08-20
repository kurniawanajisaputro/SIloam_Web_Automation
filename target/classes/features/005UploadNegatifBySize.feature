Feature: Upload Negatif
  Scenario:Test129 Login Valid  (User)
    When Test129 Membuka Halaman Login
    And Test129 Clear Field Username Dan Password
    And Test129 Input TextField <username> Yang Valid One
    And Test129 Input TextField <password> Yang Valid Two
    And Test129 Klik Tombol Login
    Then Test129 Validasi Pada Halaman Home

    Examples:
      | username | password |
      | K6400001 | a |

  Scenario:Test130 Input Data Valid
    When Test130 Klik Tombol Input
    And Test130 Validasi Halaman Form Input
    And Test130 Input Nama <nama>
    And Test130 Input NoBpjs <noBpjs>
    And Test130 Input NoKTP <noKtp>
    And Test130 Input Alamat <alamat>
    And Test130 Input kotaKTP <kotaKtp>
    And Test130 Input FaskesAwal <faskesAwal>
    And Test130 Input FaskesTujuan <faskesTujuan>
    And Test130 Input Alasan <alasan>
    Then Test130 Klik Tombol Simpan Data

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | siapa saya | 1248674570134 | 4128946273017444 | di sini | KOTA JAKARTA SELATAN | di sana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario:Test131 Upload Foto >5mb
    When Test131 Validasi Halaman Upload Dokumen
    And Test131 Klik Upload Foto Faskes Awal
    And Test131 Memilih <fotoFaskesAwal> Pada Komputer Satu
    And Test131 Klik Simpan Foto Faskes Awal
    And Test131 Validasi Foto Faskes Awal
    And Test131 Klik Cancel Faskes Awal
    And Test131 Klik Upload Foto Faskes Tujuan
    And Test131 Memilih <fotoFaskesTujuan> Pada Komputer Dua
    And Test131 Klik Simpan Foto Faskes Tujuan
    And Test131 Validasi Foto Faskes Tujuan
    And Test131 Klik Cancel Faskes Tujuan
    And Test131 Klik Upload Foto Tanda Tangan
    And Test131 Memilih <fotoTandaTangan> Pada Komputer Tiga
    And Test131 Klik Simpan Foto Tanda Tangan
    And Test131 Validasi Foto Tanda Tangan
    And Test131 Klik Cancel Tanda Tangan
    And Test131 Klik Profil
    Then Test131 Klik Logout

    Examples:
      | fotoFaskesAwal | fotoFaskesTujuan | fotoTandaTangan |
      | \\foto\\1.jpg | \\foto\\2.jpg | \\foto\\3.jpg |

#  Scenario: Test133 Upload Foto Valid