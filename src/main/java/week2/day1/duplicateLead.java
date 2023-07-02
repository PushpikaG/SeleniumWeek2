package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicateLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PG");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AN");
		Select selSource=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		selSource.selectByVisibleText("Employee");
		Select selMarketingCampaign=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		selMarketingCampaign.selectByValue("9001");
		Select selOwnership=new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		selOwnership.selectByIndex(4);
		Select selCountry=new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		selCountry.selectByVisibleText("India");
		 driver.findElement(By.name("submitButton")).click();
		 String title=driver.getTitle();
		 System.out.println(title);
		 /*Click on Duplicate button
          17. Clear the CompanyName Field using .clear() And Enter new CompanyName
          18.Clear the FirstName Field using .clear() And Enter new FirstName
Bu        19.Click on Create Lead Button
          20. Get the Title of Resulting Page using driver.getTitle()
*/
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 WebElement reditCompanyName=driver.findElement(By.id("createLeadForm_companyName"));
		 reditCompanyName.clear();
		 reditCompanyName.sendKeys("G2GG");
		 WebElement reditFirstName=driver.findElement(By.id("createLeadForm_firstName"));
		 reditFirstName.clear();
		 reditFirstName.sendKeys("Sai2");
		 driver.findElement(By.name("submitButton")).click();
		 String title1=driver.getTitle();
		 System.out.println(title1);
		 
		 
	}
}
