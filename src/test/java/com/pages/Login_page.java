package com.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.driver.Driver;
import com.utilities.ReadPropertiesFile;

public class Login_page extends Driver {
	public static final String filename = null;
	public ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();
	public Properties prop = readPropertiesFile.readPropertiesFile(filename);

	By username_Field = By.id("user-name");
	By password_Field = By.id("password");
	By login= By.id("login-button");
	By error_message= By.xpath("//div[@class='error-message-container error']");
	By burger_icon = By.id("react-burger-menu-btn");
	By logout = By.xpath("//a[@id='logout_sidebar_link']");
	By logo = By.className("app_logo");
	By error_Message_Cancel= By.xpath("//button[@class='error-button']");
	public Login_page() {
		PageFactory.initElements(driver, this);
	}

	public void navigateTo_URL() {
		driver.get(prop.getProperty("URL"));
	}
	
	public void enter_Username(String username) {
		WebElement element = driver.findElement(username_Field);
		element.sendKeys(username);
	}

	public boolean username_field() {
		WebElement element = driver.findElement(username_Field);
		return element.isDisplayed();
	}
	
	public void username_clear() {
		WebElement element = driver.findElement(username_Field);
		element.clear();
	}

	public boolean password_field() {
		WebElement element = driver.findElement(password_Field);
		return element.isDisplayed();
	}	
	
	public void password_clear() {
		WebElement element = driver.findElement(password_Field);
		element.clear();
	}
	
	public void enter_password(String password) {
		WebElement element = driver.findElement(password_Field);
		element.sendKeys(password);
	}
	
	public String getPropertyOfPassword(String property) {
		WebElement element = driver.findElement(password_Field);
		return element.getAttribute(property);
	}

	public boolean login_button() {
		WebElement element = driver.findElement(login);
		return element.isDisplayed();
	}
	
	public void login_button_click() {
		WebElement element = driver.findElement(login);
		element.click();
	}
	
	public void hamburger_icon_click() {
		WebElement element = driver.findElement(burger_icon);
		element.click();
	}
	
	public void logout_click() {
		WebElement element = driver.findElement(logout);
		element.click();
		
	}
	
	public void errorMessage_close() {
		WebElement element = driver.findElement(error_Message_Cancel);
		element.click();
	}
	
	public boolean logoTest() {
		WebElement element = driver.findElement(logo);
		return element.isDisplayed();
	}
	
	public String getErrorMessage() {
		WebElement element = driver.findElement(error_message);
		return element.getText();
	}
	
	
}