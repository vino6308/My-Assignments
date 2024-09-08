package week3Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(" Vino");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(" Joselin");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(" vinojoselin511@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(" 8056759920");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys(" sholinganallur");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600097 ");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Xavier ");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.name("submitButton")).click();	
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println(" verified");
			
		}
		else {
			System.out.println("not verified");
		}
			
		}

			}
