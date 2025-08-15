import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListAllAttributes {

	public static void main(String[] args) {

		// Set up WebDriver

		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		WebDriver driver = new ChromeDriver();

		try {

			// 1. Open target website

			driver.get("http://127.0.0.1:5500/index.html");
			driver.manage().window().maximize();

			// 2. Extract all links
			Thread.sleep(30000);
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println("Links:");
			for (WebElement link : allLinks) {
				System.out.println(link.getText() + " -> " + link.getAttribute("href"));
			}

			// 3. Extract all input fields
			List<WebElement> allInputs = driver.findElements(By.tagName("input"));
			System.out.println("Input Fields:");
			for (WebElement input : allInputs) {
				System.out.println(
						"Type: " + input.getAttribute("type") + " | Placeholder: " + input.getAttribute("placeholder"));
			}

			// 4. Extract all buttons
			List<WebElement> allButtons = driver.findElements(By.tagName("button"));
			System.out.println("Buttons:");
			for (WebElement button : allButtons) {
				System.out.println("Text: " + button.getText());
			}

			// 5. Extract all headings (h1–h6)
			System.out.println("Headings:");
			for (int i = 1; i <= 6; i++) {
				List<WebElement> headings = driver.findElements(By.tagName("h" + i));
				for (WebElement heading : headings) {
					System.out.println("H" + i + ": " + heading.getText());
				}
			}

			// 6. Extract all paragraphs
			List<WebElement> allParagraphs = driver.findElements(By.tagName("p"));
			System.out.println("Paragraphs:");
			for (WebElement para : allParagraphs) {
				System.out.println(para.getText());
			}

			WebElement empId = driver.findElement(By.id("empId"));
			String eid_value = empId.getAttribute("value");
			System.out.println("Employee ID Value: " + eid_value);

			WebElement empName = driver.findElement(By.id("empName"));
			String ename_value = empName.getAttribute("value");
			System.out.println("Employee Name Value: " + ename_value);

			WebElement empEmail = driver.findElement(By.id("email"));
			String eemail_value = empEmail.getAttribute("value");
			System.out.println("Employee Name Value: " + eemail_value);

			WebElement empDob = driver.findElement(By.id("dob"));
			String eDob_value = empDob.getAttribute("value");
			System.out.println("Employee Name Value: " + eDob_value);

			WebElement empAdd = driver.findElement(By.id("address"));
			String eAdd_value = empAdd.getAttribute("value");
			System.out.println("Employee Name Value: " + eAdd_value);

			WebElement empMob = driver.findElement(By.id("mobile"));
			String eMob_value = empMob.getAttribute("value");
			System.out.println("Employee Name Value: " + eMob_value);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			// 7. Close browser

			driver.quit();

		}

	}

}
