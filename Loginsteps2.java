package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps2 {
	WebDriver driver = null;
@Given("browser is open")
public void browser_is_open() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver92\\\\chromedriver.exe");  
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    driver=new ChromeDriver(options); 

    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    //driver.manage().window().maximize();
}

@And("enter {string} Site")
public void enter_site(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.get("https://www.cosmetize.com/");

}

@When("click on Login button")
public void click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("user-menu")).click();
}

@When("user enters username and password")
public void user_enters_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("email")).sendKeys("sasikalavallathuru@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Sasikala@1998");
    
}

@And("click on signin button")
public void click_on_signin_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.cssSelector("button[type= 'submit']")).click();
	Thread.sleep(5000);

}

@And("click  on brands button in the home page")
public void click_on_brands_button_in_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.linkText("Brands")).click();
}

@And("click on adore product")
public void click_on_adore_product() {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[2]/div[1]/nav/ul/ul/div[2]/nav/div/div/div[2]/div[2]/div/a[1]/img")).click();
 
}

@And("add the product to cart")
public void add_the_product_to_cart() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]")).click();
  Thread.sleep(5000);
}
@And("click on go to cart")
public void click_on_go_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click();
  
}

@When("click on move to wishlist")
public void click_on_move_to_wishlist() {
   // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.linkText("Move to Wishlist")).click();
}
@And("click on checkout")
public void click_on_checkout() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//Thread.sleep(5000);
    driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
}
@When("click on add new address")
public void click_on_add_new_address() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]")).click();
	driver.findElement(By.name("line_1")).sendKeys("Anneppamodali street");
    driver.findElement(By.name("country")).sendKeys("India");
    driver.findElement(By.name("city")).sendKeys(" Tirupati");
    driver.findElement(By.name("zipcode")).sendKeys("517526");
    driver.findElement(By.name("province")).sendKeys("Papanaidupet");
}
@Then("click on save")
public void click_on_save() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div/form/div[7]/button[1]")).click();
    
       
}
@And("close the browsers")
public void close_the_browsers() {
    // Write code here that turns the phrase above into concrete actions
	driver.close();
}


}
