package week4Day5Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edit {
	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Salesforce Automation by vino");
		Thread.sleep(5000);
		WebElement element2 = driver.findElement(By.xpath("//div[@data-aura-class='forceVirtualAction']//a[@role='button']"));
		driver.executeScript("arguments[0].click();", element2);
		Thread.sleep(5000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']//div"));
		driver.executeScript("arguments[0].click();",edit);
		WebElement element3 = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		element3.clear();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("16/09/2024");
		Thread.sleep(5000);
		WebElement element4 = driver.findElement(By.xpath("//button[@data-value='Needs Analysis']"));
		driver.executeScript("arguments[0].click()",element4);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']")).click();
		WebElement element5 = driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]"));
		driver.executeScript("arguments[0].click()",element5);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='In progress']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		driver.findElement(By.xpath("//textarea[@part='textarea']")).sendKeys("SalesForce");
		WebElement title = driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
		String stage = title.getText();
		if(stage.equals("Perception Analysis")) {
			System.out.println("Title is Verified");
		}
		else {
			System.out.println("Title is not verified");
		}
	}

}