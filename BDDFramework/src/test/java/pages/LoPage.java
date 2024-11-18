package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoPage {
	WebDriver driver;
	public LoPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void userpass(String username,String password) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		
	}
	public void clickbtn() {
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	public void userlogin(String username,String password) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}
	public void banner() {
		driver.findElement(By.xpath("//div[@class='product_label']")).isDisplayed();
	}

}
