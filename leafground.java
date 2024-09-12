package week4Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class leafground {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement source = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select obj = new Select(source);
		obj.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(1000);
	    WebElement source2 = driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
	    source2.sendKeys("Selenium");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
	    source2.sendKeys("play");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//li[@data-item-label='Playwright']")).click();
	    driver.findElement(By.xpath(" //label[@id='j_idt87:lang_label']")).click();
	    driver.findElement(By.xpath("//li[@data-label='English']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
	    driver.findElement(By.xpath("//li[@id='j_idt87:value_2']")).click();
	    
	   
		

}
}