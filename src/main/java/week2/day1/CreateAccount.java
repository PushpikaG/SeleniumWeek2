package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.xpath("//*[@id=\"accountName\"]")).sendKeys("PushpikaTesting");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.xpath("//*[@id=\"groupNameLocal\"]")).sendKeys("Pushpika");
	    driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[2]/td[4]/input")).sendKeys("Nanganallur");
	    //driver.findElement(By.class("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[3]/td[2]/input")).sendKeys("1234");
	    
	 driver.findElement(By.name("annualRevenue")).sendKeys("1234");
	 WebElement webSelect=driver.findElement(By.name("industryEnumId"));
	 Select selIndustry=new Select(webSelect);
	 selIndustry.selectByValue("IND_SOFTWARE");
	 WebElement webOwn=driver.findElement(By.name("ownershipEnumId"));
	 Select selOwnership=new Select(webOwn);
	 selOwnership.selectByVisibleText("S-Corporation");
	 WebElement webSource=driver.findElement(By.name("dataSourceId"));
	 Select selSource=new Select(webSource);
	 selSource.selectByValue("LEAD_EMPLOYEE");
	 
	 Select selCampaign=new Select(driver.findElement(By.name("marketingCampaignId")));
	 selCampaign.selectByIndex(5);
	 Select selProvince=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
	 selProvince.selectByValue("TX");
	 driver.findElement(By.className("smallSubmit")).click();
	 
	}

}
