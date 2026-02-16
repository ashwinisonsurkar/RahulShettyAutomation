package hooks;

import org.openqa.selenium.WebDriver;




import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver webDriver;
	/*@Before
    public void setUp() {
        System.out.println("Opening browser...");
       // driver = new ChromeDriver();
       // driver.manage().window().maximize();
    	webDriver = new EdgeDriver();
        webDriver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        System.out.println("Closing browser...");
        
        //webDriver.quit();
        
       /* if (webDriver != null) {
        	webDriver.quit();
//System.out.println("=====================================================================================================================================================");		

        
        }*/
    
    @Before
    public void beforeScenario() {
        System.out.println("Opening browser...");
       // driver = new ChromeDriver();
       // driver.manage().window().maximize();
    	webDriver = new EdgeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies(); // clear state before each scenario
    }

    @After
    public void afterScenario() {
        System.out.println("Closing browser...");
        
        webDriver.quit();
        
       /* if (webDriver != null) {
        	webDriver.quit();*/
System.out.println("=====================================================================================================================================================");		

        
        }
    
    
}




































