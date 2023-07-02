package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssignment {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		Select favAutomation=new Select(driver.findElement(By.className("ui-selectonemenu")));
		favAutomation.selectByVisibleText("Selenium");
		//Select Country=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/label")));
		//Country.selectByVisibleText("India");
		//Select City=new Select(driver.findElement(By.id("j_idt87:city")));
		//City.selectByVisibleText("Chennai");
		driver.close();
	}

}
