package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage {
WebDriver driver;
	
	public Searchpage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//input[@id='search']") WebElement search_Ele;
    @FindBy(xpath="(//a[@data-id='111002'])[1]") WebElement Balnket;
    @FindBy(xpath="//span[@data-sku=\"HDCHRG34ML10239\"]") WebElement wihite;




	public void searcho(String accessories ) throws InterruptedException
	{
		 search_Ele.sendKeys(accessories);
		    search_Ele.sendKeys(Keys.ENTER);
			System.out.println(driver.getTitle());
			
			
			Balnket.click();
			Thread.sleep(2000);
			
			wihite.click();
			
		   driver.navigate().back();
			Thread.sleep(500);
			
	    

	
		
	}
}