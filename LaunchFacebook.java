package week3Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vino");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("joselin");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vinojoselin@gmail.com");
	driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("13");
	driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("june");
	driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2000");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("vino@1234");
	
	String title = driver.getTitle();
	if (title.contains("Facebook")) {
		System.out.println(" verified");
		
	}
	else {
		System.out.println("not verified");
	}
		
	}

		}	
	
	

