package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("https://acme-test.uipath.com/login");
		drive.manage().window().maximize();
		drive.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
		drive.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		drive.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println("The Title is: " +drive.getTitle());
		drive.findElement(By.xpath("//a[text()='Log Out']")).click();
		drive.close();
		
	}

}
