package testcases1;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;

public class Launchpage extends base{
	@Test
	
	public void LaunchingBaseURL() throws IOException {
		
		driver = initializeDriver();
		driver.get("https://paperscorer.instructure.com");
		
	}
	@Test
	public void LoginTest() {
		
	}
}
