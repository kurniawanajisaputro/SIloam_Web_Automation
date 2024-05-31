Feature: Login Positif
  Scenario: Test002 Invalid Login Username (User)
    When Test002 Membuka Halaman Login
    And Test002 Clear Field Username Dan Password
    And Test002 Input TextField Username Kosong
    And Test002 Input TextField Password Kosong
    Then Test002 Klik Tombol Login Dan Validation
