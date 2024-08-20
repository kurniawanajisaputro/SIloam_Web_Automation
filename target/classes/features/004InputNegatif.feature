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

  Scenario: Test112 Input Data Faskes Awal Field Empty (User)
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

  Scenario: Test113 Input Data Nama dan NoBPJS Field Empty (User)
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
      |  |  | 4128946273017666 | dimana | KOTA JAKARTA SELATAN |di mana| Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test114 Input Data NoBpjs dan NoKTP Field Empty (User)
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
      | mamamia |  |  | dimana | KOTA JAKARTA SELATAN |di mana| Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test115 Input Data NoKTP dan Alamat Field Empty (User)
    When Test115 Klik Tombol Input
    And Test115 Validasi Halaman Form Input
    And Test115 Input TextField Nama <nama>
    And Test115 Input TextField noBpjs <noBpjs>
    And Test115 Input TextField noKtp <noKtp>
    And Test115 Input TextField Alamat <alamat>
    And Test115 Input TextField KotaKtp <kotaKtp>
    And Test115 Input TextField FaskesAwal <faskesAwal>
    And Test115 Input TextField FaskesTujuan <faskesTujuan>
    And Test115 Input TextField Alasan <alasan>
    Then Test115 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 |  |  | KOTA JAKARTA SELATAN |di mana| Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test116 Input Data Alamat dan KotaKTP Field Empty (User)
    When Test116 Klik Tombol Input
    And Test116 Validasi Halaman Form Input
    And Test116 Input TextField Nama <nama>
    And Test116 Input TextField noBpjs <noBpjs>
    And Test116 Input TextField noKtp <noKtp>
    And Test116 Input TextField Alamat <alamat>
    And Test116 Input TextField KotaKtp <kotaKtp>
    And Test116 Input TextField FaskesAwal <faskesAwal>
    And Test116 Input TextField FaskesTujuan <faskesTujuan>
    And Test116 Input TextField Alasan <alasan>
    Then Test116 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 | 4128946273017666 |  |  |di mana| Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test117 Input Data KotaKTP dan FaskesAwal Field Empty (User)
    When Test117 Klik Tombol Input
    And Test117 Validasi Halaman Form Input
    And Test117 Input TextField Nama <nama>
    And Test117 Input TextField noBpjs <noBpjs>
    And Test117 Input TextField noKtp <noKtp>
    And Test117 Input TextField Alamat <alamat>
    And Test117 Input TextField KotaKtp <kotaKtp>
    And Test117 Input TextField FaskesAwal <faskesAwal>
    And Test117 Input TextField FaskesTujuan <faskesTujuan>
    And Test117 Input TextField Alasan <alasan>
    Then Test117 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 | 4128946273017666 | dimana |  | | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test118 Input Data Nama NoBpjs dan NoKtp Field Empty (User)
    When Test118 Klik Tombol Input
    And Test118 Validasi Halaman Form Input
    And Test118 Input TextField Nama <nama>
    And Test118 Input TextField noBpjs <noBpjs>
    And Test118 Input TextField noKtp <noKtp>
    And Test118 Input TextField Alamat <alamat>
    And Test118 Input TextField KotaKtp <kotaKtp>
    And Test118 Input TextField FaskesAwal <faskesAwal>
    And Test118 Input TextField FaskesTujuan <faskesTujuan>
    And Test118 Input TextField Alasan <alasan>
    Then Test118 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      |  |  |  | dimana | KOTA JAKARTA SELATAN | di mana | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test119 Input Data NoBpjs NoKtp Dan Alamat Field Empty (User)
    When Test119 Klik Tombol Input
    And Test119 Validasi Halaman Form Input
    And Test119 Input TextField Nama <nama>
    And Test119 Input TextField noBpjs <noBpjs>
    And Test119 Input TextField noKtp <noKtp>
    And Test119 Input TextField Alamat <alamat>
    And Test119 Input TextField KotaKtp <kotaKtp>
    And Test119 Input TextField FaskesAwal <faskesAwal>
    And Test119 Input TextField FaskesTujuan <faskesTujuan>
    And Test119 Input TextField Alasan <alasan>
    Then Test119 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia |  |  |  | KOTA JAKARTA SELATAN | di mana | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test120 Input Data NoKtp alamat Dan kotaKTP Field Empty (User)
    When Test120 Klik Tombol Input
    And Test120 Validasi Halaman Form Input
    And Test120 Input TextField Nama <nama>
    And Test120 Input TextField noBpjs <noBpjs>
    And Test120 Input TextField noKtp <noKtp>
    And Test120 Input TextField Alamat <alamat>
    And Test120 Input TextField KotaKtp <kotaKtp>
    And Test120 Input TextField FaskesAwal <faskesAwal>
    And Test120 Input TextField FaskesTujuan <faskesTujuan>
    And Test120 Input TextField Alasan <alasan>
    Then Test120 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 |  |  |  | di mana | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test121 Input Data alamat kotaKTP dan FaskesAwal Field Empty (User)
    When Test121 Klik Tombol Input
    And Test121 Validasi Halaman Form Input
    And Test121 Input TextField Nama <nama>
    And Test121 Input TextField noBpjs <noBpjs>
    And Test121 Input TextField noKtp <noKtp>
    And Test121 Input TextField Alamat <alamat>
    And Test121 Input TextField KotaKtp <kotaKtp>
    And Test121 Input TextField FaskesAwal <faskesAwal>
    And Test121 Input TextField FaskesTujuan <faskesTujuan>
    And Test121 Input TextField Alasan <alasan>
    Then Test121 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 | 4128946273017666 |  |  |  | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test122 Input Data Nama noBpjs noKTP dan Alamat Field Empty (User)
    When Test122 Klik Tombol Input
    And Test122 Validasi Halaman Form Input
    And Test122 Input TextField Nama <nama>
    And Test122 Input TextField noBpjs <noBpjs>
    And Test122 Input TextField noKtp <noKtp>
    And Test122 Input TextField Alamat <alamat>
    And Test122 Input TextField KotaKtp <kotaKtp>
    And Test122 Input TextField FaskesAwal <faskesAwal>
    And Test122 Input TextField FaskesTujuan <faskesTujuan>
    And Test122 Input TextField Alasan <alasan>
    Then Test122 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      |  |  |  |  | KOTA JAKARTA SELATAN | di mana | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test123 Input Data noBpjs noKTP Alamat dan KotaKTP Field Empty (User)
    When Test123 Klik Tombol Input
    And Test123 Validasi Halaman Form Input
    And Test123 Input TextField Nama <nama>
    And Test123 Input TextField noBpjs <noBpjs>
    And Test123 Input TextField noKtp <noKtp>
    And Test123 Input TextField Alamat <alamat>
    And Test123 Input TextField KotaKtp <kotaKtp>
    And Test123 Input TextField FaskesAwal <faskesAwal>
    And Test123 Input TextField FaskesTujuan <faskesTujuan>
    And Test123 Input TextField Alasan <alasan>
    Then Test123 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia |  |  |  |  | di mana | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test124 Input Data noKTP Alamat KotaKTP dan FaskesAwal Field Empty (User)
    When Test124 Klik Tombol Input
    And Test124 Validasi Halaman Form Input
    And Test124 Input TextField Nama <nama>
    And Test124 Input TextField noBpjs <noBpjs>
    And Test124 Input TextField noKtp <noKtp>
    And Test124 Input TextField Alamat <alamat>
    And Test124 Input TextField KotaKtp <kotaKtp>
    And Test124 Input TextField FaskesAwal <faskesAwal>
    And Test124 Input TextField FaskesTujuan <faskesTujuan>
    And Test124 Input TextField Alasan <alasan>
    Then Test124 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 |  |  |  |  | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test125 Input Data Nama noBpjs noKtp Alamat dan KotaKTP Field Empty (User)
    When Test125 Klik Tombol Input
    And Test125 Validasi Halaman Form Input
    And Test125 Input TextField Nama <nama>
    And Test125 Input TextField noBpjs <noBpjs>
    And Test125 Input TextField noKtp <noKtp>
    And Test125 Input TextField Alamat <alamat>
    And Test125 Input TextField KotaKtp <kotaKtp>
    And Test125 Input TextField FaskesAwal <faskesAwal>
    And Test125 Input TextField FaskesTujuan <faskesTujuan>
    And Test125 Input TextField Alasan <alasan>
    Then Test125 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      |  |  |  |  |  | di mana | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test126 Input Data Nama noBpjs noKtp Alamat KotaKTP Dan FaskesAwal Field Empty (User)
    When Test126 Klik Tombol Input
    And Test126 Validasi Halaman Form Input
    And Test126 Input TextField Nama <nama>
    And Test126 Input TextField noBpjs <noBpjs>
    And Test126 Input TextField noKtp <noKtp>
    And Test126 Input TextField Alamat <alamat>
    And Test126 Input TextField KotaKtp <kotaKtp>
    And Test126 Input TextField FaskesAwal <faskesAwal>
    And Test126 Input TextField FaskesTujuan <faskesTujuan>
    And Test126 Input TextField Alasan <alasan>
    Then Test126 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      |  |  |  |  |  |  | Siloam Clinic Grand Galaxy | ingin  |

  Scenario: Test127 Input Data All Field Empty (User)
    When Test127 Klik Tombol Input
    And Test127 Validasi Halaman Form Input
    And Test127 Input TextField Nama <nama>
    And Test127 Input TextField noBpjs <noBpjs>
    And Test127 Input TextField noKtp <noKtp>
    And Test127 Input TextField Alamat <alamat>
    And Test127 Input TextField KotaKtp <kotaKtp>
    And Test127 Input TextField FaskesAwal <faskesAwal>
    And Test127 Input TextField FaskesTujuan <faskesTujuan>
    Then Test127 Klik Tombol Submit Dan Validation

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      |  |  |  |  |  |  |  |  |

  Scenario: Test128 Input Data noBpjs dan noKTP Field Same (User)
    When Test128 Klik Tombol Input
    And Test128 Validasi Halaman Form Input
    And Test128 Input TextField Nama <nama>
    And Test128 Input TextField noBpjs <noBpjs>
    And Test128 Input TextField noKtp <noKtp>
    And Test128 Input TextField Alamat <alamat>
    And Test128 Input TextField KotaKtp <kotaKtp>
    And Test128 Input TextField FaskesAwal <faskesAwal>
    And Test128 Input TextField FaskesTujuan <faskesTujuan>
    And Test128 Input TextField Alasan <alasan>
    And Test128 Klik Tombol Submit Dan Validation
    And Test128 Klik Profil
    Then Test128 Klik Logout

    Examples:
      | nama       | noBpjs        | noKtp            | alamat  | kotaKtp              | faskesAwal | faskesTujuan | alasan |
      | mamamia | 1248674570256 | 1248674570256 | dimana | KOTA JAKARTA SELATAN | di mana    | Siloam Clinic Grand Galaxy | ingin  |
