/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeleniumWebTest;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author dara
 */
public class SeleniumErrorTest {
    
    static WebDriver driver;

    @BeforeClass
    public static void BrowserOpen() {
        
        System.setProperty("webdriver.chrome.driver", "/Users/dara/Desktop/NetBeansProjects/try_this/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void BrowserClose() {
        driver.quit();
    }
    
 @Test//expected false
    public void testClickAddEmployeeLink03() {
    this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");
        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys(null);

        WebElement name = driver.findElement(By.id("addForm:name"));
        name.click();
        name.sendKeys("Dara");

        WebElement password = driver.findElement(By.id("addForm:password"));
        password.click();
        password.sendKeys("Hh12345+");

        WebElement cPassword = driver.findElement(By.id("addForm:cPassword"));
        cPassword.click();
        cPassword.sendKeys("Hh12345+");

        WebElement email = driver.findElement(By.id("addForm:email"));
        email.click();
        email.sendKeys("Hh12345+");

        WebElement phone = driver.findElement(By.id("addForm:phone"));
        phone.click();
        phone.sendKeys("12345");

        WebElement address = driver.findElement(By.id("addForm:address"));
        address.click();
        address.sendKeys("dara st.");

        WebElement secqn = driver.findElement(By.id("addForm:secqn"));
        secqn.click();
        secqn.sendKeys("how are you?");

        WebElement secans = driver.findElement(By.id("addForm:secans"));
        secans.click();
        secans.sendKeys("fine");

        WebElement bsbid = driver.findElement(By.id("addForm:bsbid"));
        bsbid.click();
        bsbid.sendKeys("123456");

        WebElement accid = driver.findElement(By.id("addForm:accid"));
        accid.click();
        accid.sendKeys("12345");

        WebElement salary = driver.findElement(By.id("addForm:salary"));
        salary.click();
        salary.sendKeys("50000");

        Actions actions = new Actions(driver);

        Select appgroup = new Select(driver.findElement(By.id("addForm:appgroup")));
        appgroup.selectByVisibleText("ED-EMS-USERS");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();
        
        assertEquals("Add an EMS Employee Page", this.driver.getTitle());
        
    }
    
    @Test//expected false
    public void testClickAddEmployeeLink014() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001112");

        WebElement name = driver.findElement(By.id("addForm:name"));
        name.click();
        name.sendKeys("Dara");

        WebElement password = driver.findElement(By.id("addForm:password"));
        password.click();
        password.sendKeys("Hh12345+");

        WebElement cPassword = driver.findElement(By.id("addForm:cPassword"));
        cPassword.click();
        cPassword.sendKeys("Hh12345+");

        WebElement email = driver.findElement(By.id("addForm:email"));
        email.click();
        email.sendKeys("Hh12345+");

        WebElement phone = driver.findElement(By.id("addForm:phone"));
        phone.click();
        phone.sendKeys("12345");

        WebElement address = driver.findElement(By.id("addForm:address"));
        address.click();
        address.sendKeys("dara st.");

        WebElement secqn = driver.findElement(By.id("addForm:secqn"));
        secqn.click();
        secqn.sendKeys("how are you?");

        WebElement secans = driver.findElement(By.id("addForm:secans"));
        secans.click();
        secans.sendKeys("fine");

        WebElement bsbid = driver.findElement(By.id("addForm:bsbid"));
        bsbid.click();
        bsbid.sendKeys("123456");

        WebElement accid = driver.findElement(By.id("addForm:accid"));
        accid.click();
        accid.sendKeys("12345");

        WebElement salary = driver.findElement(By.id("addForm:salary"));
        salary.click();
        salary.sendKeys(null);

        Actions actions = new Actions(driver);

        Select appgroup = new Select(driver.findElement(By.id("addForm:appgroup")));
        appgroup.selectByVisibleText("ED-EMS-USERS");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();

        assertEquals("Add an EMS Employee Page", this.driver.getTitle());

    }
    
     @Test//expected false
    public void testClickAddEmployeeLink019() throws Exception {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001116");

        WebElement name = driver.findElement(By.id("addForm:name"));
        name.click();
        name.sendKeys("Dara");

        WebElement password = driver.findElement(By.id("addForm:password"));
        password.click();
        password.sendKeys("Hh12345+");

        WebElement cPassword = driver.findElement(By.id("addForm:cPassword"));
        cPassword.click();
        cPassword.sendKeys("Hh12345+");

        WebElement email = driver.findElement(By.id("addForm:email"));
        email.click();
        email.sendKeys("Hh12345+");

        WebElement phone = driver.findElement(By.id("addForm:phone"));
        phone.click();
        phone.sendKeys("12345");

        WebElement address = driver.findElement(By.id("addForm:address"));
        address.click();
        address.sendKeys("dara st.");

        WebElement secqn = driver.findElement(By.id("addForm:secqn"));
        secqn.click();
        secqn.sendKeys("how are you?");

        WebElement secans = driver.findElement(By.id("addForm:secans"));
        secans.click();
        secans.sendKeys("fine");

        WebElement bsbid = driver.findElement(By.id("addForm:bsbid"));
        bsbid.click();
        bsbid.sendKeys("123456");

        WebElement accid = driver.findElement(By.id("addForm:accid"));
        accid.click();
        accid.sendKeys("12345");

        WebElement salary = driver.findElement(By.id("addForm:salary"));
        salary.click();
        salary.sendKeys("50000.00");

        Actions actions = new Actions(driver);

        Select appgroup = new Select(driver.findElement(By.id("addForm:appgroup")));
        appgroup.selectByVisibleText(" ");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();
        try{
            assertEquals("Add an EMS Employee Page", this.driver.getTitle());
        } catch(Exception ex){
            System.out.println("Report Error" + ex);
        }

    }
    
    @Test//expected false
    public void testClickAddEmployeeLink020() throws Exception{
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001117");

        WebElement name = driver.findElement(By.id("addForm:name"));
        name.click();
        name.sendKeys("Dara");

        WebElement password = driver.findElement(By.id("addForm:password"));
        password.click();
        password.sendKeys("Hh12345+");

        WebElement cPassword = driver.findElement(By.id("addForm:cPassword"));
        cPassword.click();
        cPassword.sendKeys("Hh12345+");

        WebElement email = driver.findElement(By.id("addForm:email"));
        email.click();
        email.sendKeys("Hh12345+");

        WebElement phone = driver.findElement(By.id("addForm:phone"));
        phone.click();
        phone.sendKeys("12345");

        WebElement address = driver.findElement(By.id("addForm:address"));
        address.click();
        address.sendKeys("dara st.");

        WebElement secqn = driver.findElement(By.id("addForm:secqn"));
        secqn.click();
        secqn.sendKeys("how are you?");

        WebElement secans = driver.findElement(By.id("addForm:secans"));
        secans.click();
        secans.sendKeys("fine");

        WebElement bsbid = driver.findElement(By.id("addForm:bsbid"));
        bsbid.click();
        bsbid.sendKeys("123456");

        WebElement accid = driver.findElement(By.id("addForm:accid"));
        accid.click();
        accid.sendKeys("12345");

        WebElement salary = driver.findElement(By.id("addForm:salary"));
        salary.click();
        salary.sendKeys("50000.00");

        Actions actions = new Actions(driver);

        Select appgroup = new Select(driver.findElement(By.id("addForm:appgroup")));
        appgroup.selectByVisibleText("ED-EMD-NONE");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();

        try{
            assertEquals("Add an EMS Employee Page", this.driver.getTitle());
        } catch(Exception ex){
            System.out.println("Report Error" + ex);
        }

    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
