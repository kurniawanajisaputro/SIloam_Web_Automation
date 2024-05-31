package com.juaracoding.takurniawan.impl;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {
				"src/main/resources/features/001LoginPositif.feature",
				"src/main/resources/features/002LoginNegatif.feature"
		},
		glue = "com.juaracoding.pcmautomation.cucumber.practicetestautomation.impl",
		monochrome=true,
		plugin = {"pretty","html:target/PTA/htmlreport/LoginRunnerOutline.html",
				"json:target/PTA/jsonreport/LoginRunnerOutline.json",
				"junit:target/PTA/junitreport/LoginRunnerOutline.xml"})
public class LoginOutlineRunner extends AbstractTestNGCucumberTests{}