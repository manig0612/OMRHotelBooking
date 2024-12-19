package com.omrbranch.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, stepNotifications = true, dryRun = true, monochrome = true, plugin = {
		"pretty",
		"json:target\\output.json" }, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")
public class TestRunnerClass {

}
