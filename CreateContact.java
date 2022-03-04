package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.findElement(By.id("username")).sendKeys("Demosalesmanager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		drive.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		drive.findElement(By.xpath("//a[text()='Contacts']")).click();
		drive.findElement(By.xpath("//a[text()='Create Contact']")).click();
		drive.findElement(By.id("firstNameField")).sendKeys("Kavya");
		drive.findElement(By.id("lastNameField")).sendKeys("P");
		drive.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anjali");
		drive.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("P");
		drive.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		drive.findElement(By.name("description")).sendKeys("Working under testing project");
		drive.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kavyasoftech@gmail.com");
		//dropdown//
		WebElement state=drive.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select StateDD =new Select(state);
		StateDD.selectByVisibleText("New York");
		drive.findElement(By.name("submitButton")).click();
		drive.findElement(By.linkText("Edit")).click();
		drive.findElement(By.name("description")).clear();
		drive.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testing");
		drive.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("The Title is: " +drive.getTitle());
		

	}

}
