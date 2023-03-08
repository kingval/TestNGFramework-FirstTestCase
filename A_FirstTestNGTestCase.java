import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//  driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();


public class A_FirstTestNGTestCase {
    WebDriver driver;
    @Test (priority = 1)
    void  openBrowser () throws InterruptedException
    {
        System.out.println("Open The Browser");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cheta\\IdeaProjects\\TestNGFramework\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

//    @Test (priority = 2)
//    void registerUser() throws InterruptedException
//    {
//        System.out.println("Click on the register button ");
//        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
//        //driver.findElement(By.xpath(""));
//
//        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Chetan");
//        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Valand");
//        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
//        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("April");
//        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1989");
//        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("unifytester001@gmail.com");
//        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Unify Testing");
//        driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Tester001!");
//        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Tester001!");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@id='register-button']")).click();
//
//    }


    @Test (priority = 3)
    void  logIn ()
    {
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("unifytester001@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Tester001!");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    }

    @Test (priority = 4)
    void selectAndAddProduct(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        //driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).click();
        //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }

    @Test (priority = 5)
    void scrollPage() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(-1000,document.body.scrollHeight)");
        Thread.sleep(1000);
    }


    @Test (priority = 6)
    void showBasket() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"itemquantity11219\"]")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"itemquantity11219\"]")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();
    }

    @Test (priority = 7)
    void checkoutBasket() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

    }


    @Test (priority = 10)
    void  closeBrowser () throws InterruptedException {

        System.out.println("Close the Browser Before Final Checkout");
        Thread.sleep(1000);
        driver.quit();

    }

}
