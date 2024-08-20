#Feature: Upload Negatif
#  Scenario:Test132 Login Valid  (User)
#    When Test132 Membuka Halaman Login
#    And Test132 Clear Field Username Dan Password
#    And Test132 Input TextField <username> Yang Valid One
#    And Test132 Input TextField <password> Yang Valid Two
#    And Test132 Klik Tombol Login
#    Then Test132 Validasi Pada Halaman Home
#
#    Examples:
#      | username | password |
#      | K6400001 | a |
#
#  Scenario:Test133 Input Data Valid
#    When Test133 Klik Tombol Input
#    And Test133 Validasi Halaman Form Input
#    And Test133 Input Nama <nama>
#    And Test133 Input NoBpjs <noBpjs>
#    And Test133 Input NoKTP <noKtp>
#    And Test133 Input Alamat <alamat>
#    And Test133 Input kotaKTP <kotaKtp>
#    And Test133 Input FaskesAwal <faskesAwal>
#    And Test133 Input FaskesTujuan <faskesTujuan>
#    And Test133 Input Alasan <alasan>
#    Then Test133 Klik Tombol Simpan Data
#
#    Examples:
#      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
#      | siapa saya | 1248674570134 | 4128946273017444 | di sini | KOTA JAKARTA SELATAN | di sana    | Siloam Clinic Grand Galaxy | ingin  |
#
#
#
#  Scenario: Test134 Upload Foto Bukan JPG, JPEG & PNG
#    When Test134 Validasi Halaman Upload Dokumen
#    And Test134 Klik Upload Foto Faskes Awal
#    And Test134 Memilih <fotoFaskesAwal> Pada Komputer Satu
#    And Test134 Klik Simpan Foto Faskes Awal
#    And Test134 Validasi Foto Faskes Awal
#    And Test134 Klik Cancel Faskes Awal
#    And Test134 Klik Upload Foto Faskes Tujuan
#    And Test134 Memilih <fotoFaskesTujuan> Pada Komputer Dua
#    And Test134 Klik Simpan Foto Faskes Tujuan
#    And Test134 Validasi Foto Faskes Tujuan
#    And Test134 Klik Cancel Faskes Tujuan
#    And Test134 Klik Upload Foto Tanda Tangan
#    And Test134 Memilih <fotoTandaTangan> Pada Komputer Tiga
#    And Test134 Klik Simpan Foto Tanda Tangan
#    And Test134 Validasi Foto Tanda Tangan
#    And Test134 Klik Cancel Tanda Tangan
#    And Test134 Klik Profil
#    Then Test134 Klik Logout
#
#    Examples:
#      | fotoFaskesAwal | fotoFaskesTujuan | fotoTandaTangan |
#      | \\video\\videogenshin1.mp4 | \\video\\videogenshin2.mp4 | \\video\\videogenshin3.mp4 |
#
##  Scenario: Test133 Upload Foto Valid