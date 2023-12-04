package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class action_mouse {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub)
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		Actions a=new Actions(dr);
		WebElement rightclick=dr.findElement(By.id("rightClickBtn"));
		a.contextClick(rightclick).perform();
		Thread.sleep(2000);
		
		WebElement doubleclick=dr.findElement(By.id("doubleClickBtn"));
		a.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		
		dr.close();
}

}
