package com.capgemini.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue="{org.openqa.selenium.chrome.ChromeDriver}")
public class BDDRunner {
}
