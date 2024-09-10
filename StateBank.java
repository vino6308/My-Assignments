package week4Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateBank {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/welcome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement element = driver.findElement(By.xpath("(//small[@id='emailHelp'])[2]"));
		driver.executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vino@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("vino@6308");
		driver.findElement(By.xpath(" //input[@id='firstName']")).sendKeys("vino");
		driver.findElement(By.xpath(" //input[@id='lastName']")).sendKeys(" joselin");
		driver.findElement(By.xpath(" //input[@id='middleName']")).sendKeys(" G ");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("mr");
		driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys(" Unemployed");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("06/13/2000");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vino");
		String title = driver.getTitle();
		if (title.contains("UiBank")) {
			System.out.println("title is verified");

		} else {
			System.out.println("title is not verified");

		}
	}

}
