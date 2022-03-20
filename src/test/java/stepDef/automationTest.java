package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Driver.Driver;
import org.junit.After;
import org.junit.Assert;
import utilities.PropertiesReader;
import utilities.commonMethods;


public class automationTest extends commonMethods{
	@Given("Open the browser")
	public void open_the_browser() {
		//hmp.chkURL(PropertiesReader.getProperty("url"));
		System.out.println("Open the browser");
	}
	@When("Enter the URL practice.automationtesting.in")
	public void enter_the_url_practice_automationtesting_in() {
		Driver.getDriver();
	}
	@When("Click on Shop Menu")
	public void click_on_shop_menu() {
		cmp.shopMenu.click();
	}
	@When("Now click on Home menu button")
	public void now_click_on_home_menu_button() {
		hmp.homeMenuLink.click();
	}
	@When("Test whether the Home page has Three Sliders only")
	public void test_whether_the_home_page_has_three_sliders_only() {
		hmp.chkSliderSection(3);
	}

	@When("The Home page must contains only three Arrivals")
	public void the_home_page_must_contains_only_three_arrivals() {
		hmp.chkArrivals(3);
	}
	@When("Now click the image in the Arrivals")
	public void now_click_the_image_in_the_arrivals() {
		hmp.arrivalImg.click();
	}
	@When("Test whether it is navigating to next page where the user can add that book into his basket.")
	public void test_whether_it_is_navigating_to_next_page_where_the_user_can_add_that_book_into_his_basket() {
		Assert.assertTrue(hmp.productPage.isDisplayed());
		//Assert.assertTrue(hmp.addBasketBtn.isDisplayed());
	}

	@Then("Image should be clickable and should navigate to next page where user can add that book to his basket")
	public void image_should_be_clickable_and_should_navigate_to_next_page_where_user_can_add_that_book_to_his_basket() {
		Assert.assertTrue(hmp.addBasketBtn.isDisplayed());
	}

	@Then("The Home page must contains only three sliders")
	public void the_home_page_must_contains_only_three_sliders() {
		hmp.chkSliderSection(3);
	}

	@Then("Click on My Account Menu")
	public void clickOnMyAccountMenu() {
		cmp.myAccountMenu.click();
	}

	@When("Click on login button")
	public void clickOnLoginButton() {
		map.loginButton.click();
	}

	@Then("Webpage must show error message")
	public void webpageMustShowErrorMessage() {
		System.out.println(map.loginMessageLabel.getText());
	}

	@And("Enter {string} in username textbox and {string} in password textbox")
	public void enterInUsernameTextboxAndInPasswordTextbox(String arg0, String arg1) {
		map.usernameLoginInput.sendKeys(arg0);
		map.passwordLoginInput.sendKeys(arg1);
	}

}
