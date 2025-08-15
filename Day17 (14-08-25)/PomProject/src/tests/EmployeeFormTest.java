package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EmployeeFormPage;

public class EmployeeFormTest {
	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("http://127.0.0.1:5500/index.html");

			// Step 1: Initialize the Page Object
			EmployeeFormPage formPage = new EmployeeFormPage(driver);

			// Step 2: Use page methods
			formPage.enterEmpId("101");
			formPage.enterEmpName("Harry");
			formPage.enterDOB("2001-01-11");
			formPage.enterAddress("123 ABC");
			formPage.enterContactNo("7777777777");
			formPage.enterEmail("harry@example.com");
			formPage.clickSubmit();
			
			//Alert

			/*
			 * // Trigger the alert driver.findElement(By.id("triggerAlert")).click();
			 */
		 
		        // Switch to alert
		        Alert alert = driver.switchTo().alert();
		 
		        // Read alert text
		        String alertMessage = alert.getText();
		        System.out.println("Alert message: " + alertMessage);
		 
		        // Accept the alert
		        alert.accept();

		 

			// Wait and validate
			Thread.sleep(15000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}
