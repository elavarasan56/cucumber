package com.adactin.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.maven.Base.Base_class;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\cucumber\\src\\test\\java\\com\\adactin\\feature\\file.feature",
glue="com.adactin.Step_definition")

public class Runner extends Base_class {
    
	@BeforeClass
	public static void browserlaunch() {
		getbrowser("chrome");
	}

}
