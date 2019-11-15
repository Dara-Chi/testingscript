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
public class SystemFuncTest {

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

    @Test// expected true
    public void testClickAddEmployeeLink01() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");
        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001101");

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

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Employee Added"));
        assertEquals("Employee Added", this.driver.getTitle());

    }
    @Test//expected false
    public void testClickAddEmployeeLink02() {
    this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");
        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("");

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
    public void testClickAddEmployeeLink04() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");
        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("aaa");

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
    public void testClickAddEmployeeLink05() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("2=2");

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
    public void testClickAddEmployeeLink06() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("000000");

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
    public void testClickAddEmployeeLink07() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("12345 ");

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

        assertEquals("EMS Employee Not Added", this.driver.getTitle());

    }
    @Test//expected false
    public void testClickAddEmployeeLink08() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("######");

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
    public void testClickAddEmployeeLink09() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("1.1");

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
    public void testClickAddEmployeeLink010() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("12345 ");

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

        assertEquals("EMS Employee Not Added", this.driver.getTitle());

    }
    
    
    
    @Test//expected true
    public void testClickAddEmployeeLink011() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("33333");

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
    public void testClickAddEmployeeLink012() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("000001");

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

        assertEquals("EMS Employee Not Added", this.driver.getTitle());

    }
    @Test//expected false
    public void testClickAddEmployeeLink013() {
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
        salary.sendKeys("");

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

    

    @Test //expected false
    public void testClickAddEmployeeLink015() {
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
        salary.sendKeys("aaa");

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
    public void testClickAddEmployeeLink016() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001113");

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
        salary.sendKeys("0");

        Actions actions = new Actions(driver);

        Select appgroup = new Select(driver.findElement(By.id("addForm:appgroup")));
        appgroup.selectByVisibleText("ED-EMS-USERS");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();

        assertEquals("EMS Employee Not Added", this.driver.getTitle());

    }

    @Test// expected true
    public void testClickAddEmployeeLink017() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001114");

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
        salary.sendKeys("1000");

        Actions actions = new Actions(driver);

        Select appgroup = new Select(driver.findElement(By.id("addForm:appgroup")));
        appgroup.selectByVisibleText("ED-EMS-USERS");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();

        assertEquals("Employee Added", this.driver.getTitle());

    }

    @Test//expected false
    public void testClickAddEmployeeLink018() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001115");

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
        salary.sendKeys("2000000000.00");

        Actions actions = new Actions(driver);

        Select appgroup = new Select(driver.findElement(By.id("addForm:appgroup")));
        appgroup.selectByVisibleText("ED-EMS-USERS");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();

        assertEquals("EMS Employee Not Added", this.driver.getTitle());

    }
    
   
    
    @Test//expected true
    public void testClickAddEmployeeLink021() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001118");

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
        appgroup.selectByVisibleText("ED-EMS-USERS");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();

        assertEquals("Employee Added", this.driver.getTitle());

    }
    
    @Test//expected true
    public void testClickAddEmployeeLink022() {
        this.driver.get("http://localhost:8080/ED-EMS-SLSB-war/faces/mainmenu.xhtml");

        WebElement page = driver.findElement(By.linkText("Add a new employee"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        page.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addForm:empid")));//incase page was slow to load
        WebElement empid = driver.findElement(By.id("addForm:empid"));
        empid.click();
        empid.sendKeys("001119");

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
        appgroup.selectByVisibleText("ED-EMS-ADMIN");

        WebElement active = driver.findElement(By.id("addForm:active"));
        actions.moveToElement(active);
        active.click();

        WebElement submit = driver.findElement(By.id("addForm:submit"));
        actions.moveToElement(submit);
        submit.click();

        assertEquals("Employee Added", this.driver.getTitle());

    }
    
}
