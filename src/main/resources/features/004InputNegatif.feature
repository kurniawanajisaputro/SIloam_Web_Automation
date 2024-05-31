Feature: Input Negatif
  Scenario: Test106 Login Negatif Empty(User)
    When Test106 Membuka Halaman Login
    And Test106 Clear Field Username Dan Password
    And Test106 Input TextField Username Kosong
    And Test106 Input TextField Password Kosong
    Then Test106 Klik Tombol Login Dan Validation

  Scenario: Test107 Login Negatif Invalid (User)
    And Test107 Clear Field Username Dan Password
    And Test107 Input TextField Username Invalid <username>
    And Test107 Input TextField Password Invalid <password>
    Then Test107 Klik Tombol Login Dan Validation

    Examples:
      | username | password |
      | K6400000 | b |

  Scenario: Test108 Login Valid  (User)
    And Test108 Clear Field Username Dan Password
    And Test108 Input TextField <username> Yang Valid One
    And Test108 Input TextField <password> Yang Valid Two
    And Test108 Klik Tombol Login
    Then Test108 Validasi Pada Halaman Home

    Examples:
      | username | password |
      | K6400001 | a |

  Scenario: Test109 Input Data Nama Field Empty (User)
    When Test109 Klik Tombol Input
    And Test109 Validasi Halaman Form Input
    And Test109 Input TextField Nama <nama>
    And Test109 Input TextField noBpjs <noBpjs>
    And Test109 Input TextField noKtp <noKtp>
    And Test109 Input TextField Alamat <alamat>
    And Test109 Input TextField KotaKtp <kotaKtp>
    And Test109 Input TextField FaskesAwal <faskesAwal>
    And Test109 Input TextField FaskesTujuan <faskesTujuan>
    And Test109 Input TextField Alasan <alasan>
    Then Test109 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      |  | 1248674570256 | 4128946273017666 | dimana | KOTA JAKARTA SELATAN | di mana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test110 Input Data NoBPJS Field Empty (User)
    When Test110 Clear Field Input Page
    And Test110 Input TextField Nama <nama>
    And Test110 Input TextField noBpjs <noBpjs>
    And Test110 Input TextField noKtp <noKtp>
    And Test110 Input TextField Alamat <alamat>
    And Test110 Input TextField KotaKtp <kotaKtp>
    And Test110 Input TextField FaskesAwal <faskesAwal>
    And Test110 Input TextField FaskesTujuan <faskesTujuan>
    And Test110 Input TextField Alasan <alasan>
    Then Test110 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia |  | 4128946273017666 | dimana | KOTA JAKARTA SELATAN | di mana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test111 Input Data NoKTP Field Empty (User)
    When Test111 Clear Field Input Page
    And Test111 Input TextField Nama <nama>
    And Test111 Input TextField noBpjs <noBpjs>
    And Test111 Input TextField noKtp <noKtp>
    And Test111 Input TextField Alamat <alamat>
    And Test111 Input TextField KotaKtp <kotaKtp>
    And Test111 Input TextField FaskesAwal <faskesAwal>
    And Test111 Input TextField FaskesTujuan <faskesTujuan>
    And Test111 Input TextField Alasan <alasan>
    Then Test111 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 | | dimana | KOTA JAKARTA SELATAN | di mana    | Siloam Clinic Grand Galaxy | ingin  |