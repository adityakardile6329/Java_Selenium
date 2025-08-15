import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {

		WebDriver driver = null;
		try {
			// Launch Chrome browser
			driver = new ChromeDriver();
			// Go to Google
			driver.get("http://127.0.0.1:5500/index.html");
			// Find the search box and type a query
			/*
			 * WebElement searchBox = driver.findElement(By.name("search_query"));
			 * searchBox.sendKeys("iphone 16 pro max"); // Submit the search form
			 * searchBox.submit(); WebElement searchButton =
			 * driver.findElement(By.cssSelector("search-icon-legacy"));
			 * searchButton.click();
			 */
			
			
			Thread.sleep(30000);
			WebElement empId = driver.findElement(By.id("empId"));
            String eid_value = empId.getAttribute("value");
            System.out.println("Employee ID Value: " + eid_value);
            
			WebElement empName = driver.findElement(By.id("empName"));
            String ename_value = empName.getAttribute("value");
            System.out.println("Employee Name Value: " + ename_value);
            
            WebElement empEmail = driver.findElement(By.id("email"));
            String eemail_value = empEmail.getAttribute("value");
            System.out.println("Employee Email Value: " + eemail_value);
            
            WebElement empDob = driver.findElement(By.id("dob"));
            String eDob_value = empDob.getAttribute("value");
            System.out.println("Employee DOB Value: " + eDob_value);
            
            WebElement empAdd = driver.findElement(By.id("address"));
            String eAdd_value = empAdd.getAttribute("value");
            System.out.println("Employee Address Value: " + eAdd_value);
            
            WebElement empMob = driver.findElement(By.id("mobile"));
            String eMob_value = empMob.getAttribute("value");
            System.out.println("Employee Mobile Value: " + eMob_value);

			// Wait a bit (basic pause, not best practice)

			// Thread.sleep(2000); // Wait 2 seconds for results to load

		} catch (Exception e) {

			e.printStackTrace();

		}

		// Print the title of the results page

		System.out.println("Search Results Page Title: " + driver.getTitle());

		// Close the browser

		driver.quit();

	}

}
