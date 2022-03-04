package week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("http://leafground.com/pages/Dropdown.html");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement elementDD1 = drive.findElement(By.id("dropdown1"));
		Select dd1=new Select(elementDD1);
		dd1.selectByIndex(1);
		WebElement elementDD2 = drive.findElement(By.name("dropdown2"));
		Select dd2=new Select(elementDD2);
		dd2.selectByValue("2");
		WebElement elementDD3 = drive.findElement(By.id("dropdown3"));
		Select dd3=new Select(elementDD3);
		dd3.selectByVisibleText("UFT/QTP");
		System.out.println("The get test - " +drive.findElement(By.className("dropdown")).getText());
		drive.findElement(By.xpath("(//div[@class='example']//select)[5]")).sendKeys("Loadrunner");
		drive.findElement(By.xpath("(//div[@class='example']//select)[6]")).sendKeys("UFT/QTP");
			
		
	}

}
