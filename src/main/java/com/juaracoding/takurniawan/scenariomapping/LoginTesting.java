package com.juaracoding.takurniawan.scenariomapping;

public enum LoginTesting {

    T1("Test001 Valid Login Username (User)"),
    T2("Test002 Login Negatif (User)"),
    T3("Test003 Login Negatif Password Invalid (user)"),
    T4("Test004 Login Negatif Username Invalid (user)"),
    T5("Test005 Login Negatif Username Invalid Dan Password Invalid (user)"),
    T6("Test006 Login Valid Input Data"),
    T7("Test007 Input data Valid (user)");
//    ,
//    T3("Pta003 Password Salah"),
//    T4("Pta004 Username Salah"),
//    T5("Pta005 Username Dan Password Salah");

    private String testName;

    private LoginTesting(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}