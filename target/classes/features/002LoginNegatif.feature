Feature: Login Negatif
  Scenario: Test002 Login Negatif (User)
    When Test002 Membuka Halaman Login
    And Test002 Clear Field Username Dan Password
    And Test002 Input TextField Username Kosong
    And Test002 Input TextField Password Kosong
    Then Test002 Klik Tombol Login Dan Validation


  Scenario: Test103 Login Negatif Password Invalid (user)
    And Test103 Clear Field Username Dan Password
    And Test103 Input TextField Username Valid <username>
    And Test103 Input TextField Password Invalid <password>
    Then Test103 Klik Tombol Login Dan Validation

    Examples:
      | username | password |
      | K6400001 | b |

  Scenario: Test104 Login Negatif Username Invalid (user)
    And Test104 Clear Field Username Dan Password
    And Test104 Input TextField Username Invalid <username>
    And Test104 Input TextField Password Valid <password>
    Then Test104 Klik Tombol Login Dan Validation

    Examples:
      | username | password |
      | K6400000 | a |

  Scenario: Test105 Login Negatif Username Invalid Dan Password Invalid (user)
    And Test105 Clear Field Username Dan Password
    And Test105 Input TextField Username Invalid <username>
    And Test105 Input TextField Password Invalid <password>
    Then Test105 Klik Tombol Login Dan Validation

    Examples:
      | username | password |
      | K6400000 | b |