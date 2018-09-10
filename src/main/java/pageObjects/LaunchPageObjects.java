package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchPageObjects {
	public WebDriver driver;

	public LaunchPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("pseudonym_session_unique_id");
	By password = By.id("pseudonym_session_password");
	By loginButton = By.xpath("button[@type='submit']");

	public WebElement getusername() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
}
