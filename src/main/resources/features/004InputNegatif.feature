Feature: Input Negatif
  Scenario: Test106 Login Valid  (User)
    When Test106 Membuka Halaman Login
    And Test106 Clear Field Username Dan Password
    And Test106 Input TextField <username> Yang Valid One
    And Test106 Input TextField <password> Yang Valid Two
    And Test106 Klik Tombol Login
    Then Test106 Validasi Pada Halaman Home

    Examples:
      | username | password |
      | K6400001 | a |

  Scenario: Test107 Input Data Nama Field Empty (User)
    When Test107 Klik Tombol Input
    And Test107 Validasi Halaman Form Input
    And Test107 Input TextField Nama <nama>
    And Test107 Input TextField noBpjs <noBpjs>
    And Test107 Input TextField noKtp <noKtp>
    And Test107 Input TextField Alamat <alamat>
    And Test107 Input TextField KotaKtp <kotaKtp>
    And Test107 Input TextField FaskesAwal <faskesAwal>
    And Test107 Input TextField FaskesTujuan <faskesTujuan>
    And Test107 Input TextField Alasan <alasan>
    Then Test107 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      |  | 1248674570256 | 4128946273017666 | dimana | KOTA JAKARTA SELATAN | di mana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test108 Input Data NoBPJS Field Empty (User)
    When Test108 Klik Tombol Input
    And Test108 Validasi Halaman Form Input
    And Test108 Input TextField Nama <nama>
    And Test108 Input TextField noBpjs <noBpjs>
    And Test108 Input TextField noKtp <noKtp>
    And Test108 Input TextField Alamat <alamat>
    And Test108 Input TextField KotaKtp <kotaKtp>
    And Test108 Input TextField FaskesAwal <faskesAwal>
    And Test108 Input TextField FaskesTujuan <faskesTujuan>
    And Test108 Input TextField Alasan <alasan>
    Then Test108 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia |  | 4128946273017666 | dimana | KOTA JAKARTA SELATAN | di mana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test109 Input Data NoKTP Field Empty (User)
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
      | mamamia | 1248674570256 | | dimana | KOTA JAKARTA SELATAN | di mana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test110 Input Data Alamat Field Empty (User)
    When Test110 Klik Tombol Input
    And Test110 Validasi Halaman Form Input
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
      | mamamia | 1248674570256 | 4128946273017666 |  | KOTA JAKARTA SELATAN | di mana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test111 Input Data Kota KTP Field Empty (User)
    When Test111 Klik Tombol Input
    And Test111 Validasi Halaman Form Input
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
      | mamamia | 1248674570256 | 4128946273017666 | dimana |  | di mana    | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test112 Input Data Kota Faskes Awal Field Empty (User)
    When Test112 Klik Tombol Input
    And Test112 Validasi Halaman Form Input
    And Test112 Input TextField Nama <nama>
    And Test112 Input TextField noBpjs <noBpjs>
    And Test112 Input TextField noKtp <noKtp>
    And Test112 Input TextField Alamat <alamat>
    And Test112 Input TextField KotaKtp <kotaKtp>
    And Test112 Input TextField FaskesAwal <faskesAwal>
    And Test112 Input TextField FaskesTujuan <faskesTujuan>
    And Test112 Input TextField Alasan <alasan>
    Then Test112 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 | 4128946273017666 | dimana | KOTA JAKARTA SELATAN |  | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test113 Input Data Kota Faskes Tujuan Field Empty (User)
    When Test113 Klik Tombol Input
    And Test113 Validasi Halaman Form Input
    And Test113 Input TextField Nama <nama>
    And Test113 Input TextField noBpjs <noBpjs>
    And Test113 Input TextField noKtp <noKtp>
    And Test113 Input TextField Alamat <alamat>
    And Test113 Input TextField KotaKtp <kotaKtp>
    And Test113 Input TextField FaskesAwal <faskesAwal>
    And Test113 Input TextField FaskesTujuan <faskesTujuan>
    And Test113 Input TextField Alasan <alasan>
    Then Test113 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 | 4128946273017666 | dimana | KOTA JAKARTA SELATAN |di mana|  | ingin  |

  Scenario: Test114 Input Data Kota Alasan Field Empty (User)
    When Test114 Klik Tombol Input
    And Test114 Validasi Halaman Form Input
    And Test114 Input TextField Nama <nama>
    And Test114 Input TextField noBpjs <noBpjs>
    And Test114 Input TextField noKtp <noKtp>
    And Test114 Input TextField Alamat <alamat>
    And Test114 Input TextField KotaKtp <kotaKtp>
    And Test114 Input TextField FaskesAwal <faskesAwal>
    And Test114 Input TextField FaskesTujuan <faskesTujuan>
    And Test114 Input TextField Alasan <alasan>
    Then Test114 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 | 4128946273017666 | dimana | KOTA JAKARTA SELATAN |di mana| Siloam Clinic Grand Galaxy |   |
