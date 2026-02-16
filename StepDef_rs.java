package stepDefinitions;

import static org.testng.Assert.assertEquals;


import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import UserData.userData;
//import Utility.AssertUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import hooks.Hooks;

public class StepDef_rs {

	WebDriver webDriver = Hooks.webDriver;// old hook file
//	WebDriverWait wait;
	
	WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

	String parentHandle = webDriver.getWindowHandle();

	@Given("the application is running")
	public void the_application_is_running() {

		System.out.println("hello");
		//webDriver.navigate().to("http://103.19.134.114:63300/jjm_14-09-2024");
		webDriver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
		
	}
	
	
	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("hello");
	}
	
	
	@Given("click on Radio Button")
	public void click_on_radio_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("click on SwithToAlert")
	public void click_on_swith_to_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("click on BrokenLinkExampleFooter")
	public void click_on_broken_link_example_footer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("click on WebTableExample")
	public void click_on_web_table_example() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("click on IFrameExample")
	public void click_on_i_frame_example() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("click on ElementDisplayedExample")
	public void click_on_element_displayed_example() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("click on WebTableFixedHeader")
	public void click_on_web_table_fixed_header() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@Given("click on InputBox")
	public void click_on_input_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

	@Given("click on MouseHoverExample")
	public void click_on_mouse_hover_example() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	@Given("click on SwitchWindowExample")
	public void click_on_switch_window_example() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	
}