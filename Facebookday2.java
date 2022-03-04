package week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookday2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("https://en-gb.facebook.com/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drive.findElement(By.xpath("//a[text()='Create New Account']")).click();
		drive.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Kavya");
		drive.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");
		drive.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8122793532");
		drive.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Testing@123");
		WebElement elementday = drive.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day=new Select(elementday);
		day.selectByValue("30");
		WebElement elementmonth = drive.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month =new Select(elementmonth);
		month.selectByValue("8");
		WebElement elementyear = drive.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(elementyear);
		year.selectByValue("1994");
		drive.findElement(By.xpath("//input[@value='1']")).click();
				
		
	}

}
