package newmarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Masterpage {

	static WebDriver mydriver; 
	static boolean result;
	
	
	public void openbrowser()
	
	{
		
		WebDriverManager.chromedriver().setup();
		mydriver = new ChromeDriver();
		mydriver.get("https://www.demo.iscripts.com/multicart/demo/");
		mydriver.manage().window().maximize();
		
		
	}
	
	public boolean logotest() {
					
		try {
			
				
			result = mydriver.findElement(By.xpath("//*[@id=\\\"wrapper\\\"]/div[1]/nav/div[1]/div/a/img")).isDisplayed();
			
			
			
		}
		catch(Exception e) {
			
			result = false;
			System.out.println(e.getMessage());
			
		}
			
		
		
		
		
		return result;
		
	}
	
	
	public static void closebrowser()
	{
		mydriver.close();
		mydriver.quit();
		
	}
	
}
