Feature: Login Positif
  Scenario: Test001 Valid Login Username (User)
    When Test001 Membuka Halaman Login
    And Test001 Clear Field Username Dan Password
    And Test001 Input TextField <username> Yang Valid One
    And Test001 Input TextField <password> Yang Valid Two
    Then Test001 Klik Tombol Login

    Examples:
      | username | password |
      | K6400001 | a |