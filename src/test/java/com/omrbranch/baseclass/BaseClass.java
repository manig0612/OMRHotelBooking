package com.omrbranch.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	Select select;
	JavascriptExecutor executor;

	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "\\config\\config.properties"));

		Object object = properties.get(key);
		String value = (String) object;
		return value;

	}

	public String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;
	}

	public void elementClear(WebElement element) {
		element.clear();
	}

	public void screenshot(String sName, WebElement element) throws IOException {
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(getProjectPath() + "\\Output Screenshot\\" + sName + ".png"));
	}

	public void screenshot(String sName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(getProjectPath() + "\\Output Screenshot\\" + sName + ".png"));
	}

	public void visiblityOfElement(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));

	}

	public List<String> getAllDropDownOptions(WebElement element) {
		List<String> allOptionsText = new LinkedList<String>();
		select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			allOptionsText.add(webElement.getText());

		}
		return allOptionsText;

	}

	public void switchToChildWindow() {
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String eachWindowId : windowHandles) {
			if (!windowHandle.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);

			}

		}
	}

	public void scroll(WebElement element) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView()", element);

	}

	public void elementSendKeysJs(WebElement element, String data) {
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

	public void elementSendKeysEnter(WebElement element, String data) {
		visiblityOfElement(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {

			element.sendKeys(data, Keys.ENTER);
		}
	}

	public void elementSendKeys(WebElement element, String data) {
		visiblityOfElement(element);

		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.sendKeys(data);
		} else {
			System.err.println("NOT Intractable / WebElement is Hidden");
		}
	}

	public static void browserLaunch(String browserType) {
		switch (browserType) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "INTERNETEXPLORER":
			driver = new InternetExplorerDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

	public static void enterApplUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void elementClick(WebElement element) {
		visiblityOfElement(element);

		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.click();
		}
	}

	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getApplnUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public WebElement findLocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	public WebElement findLocatorByXpath(String exp) {
		WebElement element = driver.findElement(By.xpath(exp));
		return element;
	}

	public String elementGetText(WebElement element) {
		visiblityOfElement(element);
		String text = null;
		if (elementIsDisplayed(element)) {

			text = element.getText();
		}
		return text;
	}

	public String elementGetAttributeValue(WebElement element) {
		visiblityOfElement(element);
		String attribute = null;
		if (elementIsDisplayed(element)) {
			attribute = element.getDomProperty("value");
		}
		return attribute;
	}

	public String elementGetAttributeValue(WebElement element, String attributeName) {
		visiblityOfElement(element);
		String attribute = null;
		if (elementIsDisplayed(element)) {
			attribute = element.getDomProperty(attributeName);
		}
		return attribute;
	}

	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public boolean elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean elementIsSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	public void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public static void closeWindow() {
		driver.close();
	}

	public void selectOptionByText(WebElement element, String text) {
		visiblityOfElement(element);

		if (elementIsDisplayed(element)) {
			select = new Select(element);
			select.selectByVisibleText(text);
		}
	}

	public void selectOptionByValue(WebElement element, String value) {
		visiblityOfElement(element);

		if (elementIsDisplayed(element)) {
			select = new Select(element);
			select.selectByValue(value);
		}
	}

	public void selectOptionByIndex(WebElement element, int index) {
		visiblityOfElement(element);

		if (elementIsDisplayed(element)) {
			select = new Select(element);
			select.selectByIndex(index);
		}
	}

}

