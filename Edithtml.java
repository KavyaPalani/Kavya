package week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edithtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("http://leafground.com/pages/Edit.html");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement elementEmailID= drive.findElement(By.id("email"));
		elementEmailID.sendKeys("kavyasoftech@gmail.com");
		String Emailvalue=elementEmailID.getAttribute("value");
		System.out.println("Email ID is:" + Emailvalue);
		drive.findElement(By.xpath("(//label[@for='email'])[2]/following-sibling::input")).sendKeys("Testpage" +Keys.TAB);
		System.out.println(drive.findElement(By.xpath("//label[text()='Get default text entered']/following::input")).getAttribute("value"));
		drive.findElement(By.xpath("(//div[@class='example']//input)[4]")).clear();
		System.out.println("is Enabled :" +drive.findElement(By.xpath("(//div[@class='example']//input)[5]")).isEnabled());
		
		
		
	}

}
