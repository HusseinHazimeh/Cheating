import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataCollect {
public static void main(String [] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\users\\Hussein\\desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
    String baseUrl = "https://forms.google.com/";
    
    driver.get(baseUrl);
    driver.findElement(By.name("identifier")).sendKeys(your_email);

    driver.findElement(By.className("VfPpkd-RLmnJb")).click();
    Thread.sleep(5000);
    driver.findElement(By.name("password")).sendKeys(your_pass);
    
    driver.findElement(By.className("VfPpkd-RLmnJb")).click();
    String quiz = "https://docs.google.com/forms/d/1IYBod5R5D1U1sbIbd4BD8t_n4qQr_jsPsFLrIunm_3E/edit#response=ACYDBNhE4VDsKhUtA3941g6F5eihNH3hQMUIkgW-aRcH";
    driver.get(quiz);
    Thread.sleep(1000);
    driver.get(quiz);
    Thread.sleep(1000);
    driver.get(quiz);
     
    Thread.sleep(30000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    js.executeScript("window.scrollBy(0,3000)");
    List<WebElement> els = driver.findElements(By.xpath(".//*[@class='appsMaterialWizToggleRadiogroupEl exportToggleEl isChecked isDisabled']"));
    
    //String c = els.get(0).getAttribute("aria-checked");
    //System.out.println(c);
    System.out.println(els.size());
    
    System.out.println(els.get(5).findElement(By.xpath("//span[@dir='auto']")).getText());
    		
    //open answers questions
    List<WebElement> _els = driver.findElements(
    		By.xpath(".//*[@class='freebirdFormviewerViewItemsTextLongText freebirdFormviewerViewItemsTextDisabledText freebirdThemedInput']"));

    List<WebElement> __els = driver.findElements(
    		By.xpath(".//*[@class='freebirdFormviewerViewItemsTextShortText freebirdFormviewerViewItemsTextDisabledText freebirdThemedInput']"));
    
    for(WebElement e : _els){
    	System.out.println(e.getText());
    }
    
    for(WebElement _e : __els){
    	System.out.println(_e.getText());
    }

    js.executeScript("window.scrollBy(0,-3000)");
    
    Thread.sleep(2000);
    
    WebElement next = 
    		driver.findElement(By.className("freebirdFormeditorViewResponsesNavigationActionButton"));
    next.click();
  }
}
