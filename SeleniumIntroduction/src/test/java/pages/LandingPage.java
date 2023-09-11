package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String pageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public Boolean companyLogo(WebDriver driver) {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='tokopedia-logo']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Boolean isExist = (Boolean) js.executeScript("return arguments[0].complete "+"&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", logo);
		
		return isExist;
	}
	
	public WebElement searchBox(WebDriver driver) {
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='search' AND @placeholder='Cari di Tokopedia']"));
		return searchBox;
	}
	
	public WebElement cartButton(WebDriver driver) {
		By cartLocator = RelativeLocator.with(By.className("css-1lsbr8a")).toRightOf(searchBox(driver));
		WebElement cart = driver.findElement(cartLocator);
		
		return cart;
	}
	
	public WebElement loginButton(WebDriver driver) {
	WebElement loginButtonElement = driver.findElement(By.xpath("//button[@data-testid='btnHeaderLogin']"));
	return loginButtonElement;
	}
	
	
	public WebElement registerButton(WebDriver driver) {
	WebElement registerButtonElement = driver.findElement(By.xpath("//button[@data-testid='btnHeaderRegister']"));
	return registerButtonElement;
	}
	
	
	
	
	
}
