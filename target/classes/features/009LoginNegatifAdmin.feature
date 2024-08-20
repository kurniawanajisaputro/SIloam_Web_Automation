Feature: Login Negatif Admin
Scenario: Test143 Login Negatif (User)
When Test143 Membuka Halaman Login
And Test143 Clear Field Username Dan Password
And Test143 Input TextField Username Kosong
And Test143 Input TextField Password Kosong
Then Test143 Klik Tombol Login Dan Validation


Scenario: Test144 Login Negatif Password Invalid (user)
And Test144 Clear Field Username Dan Password
And Test144 Input TextField Username Valid <username>
And Test144 Input TextField Password Invalid <password>
Then Test144 Klik Tombol Login Dan Validation

Examples:
| username | password |
| admindika | b |

Scenario: Test145 Login Negatif Username Invalid (user)
And Test145 Clear Field Username Dan Password
And Test145 Input TextField Username Invalid <username>
And Test145 Input TextField Password Valid <password>
Then Test145 Klik Tombol Login Dan Validation

Examples:
| username | password |
| K6400000 | d1k4@passw0rd |

Scenario: Test146 Login Negatif Username Invalid Dan Password Invalid (user)
And Test146 Clear Field Username Dan Password
And Test146 Input TextField Username Invalid <username>
And Test146 Input TextField Password Invalid <password>
Then Test146 Klik Tombol Login Dan Validation

Examples:
| username | password |
| K6400000 | b |