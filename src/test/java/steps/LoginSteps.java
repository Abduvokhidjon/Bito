package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.Config;
import utils.Driver;

public class LoginSteps extends LoginPage {

    private WebDriver driver = Driver.getDriver();

    LoginPage page = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver.get(Config.getProperty("url"));

    }
    @When("the user enters a valid phone number {string}")
    public void the_user_enters_a_valid_phone_number(String number) {
        phoneNumber.sendKeys(number);
    }
    @When("the user enters a valid password {string}")
    public void the_user_enters_a_valid_password(String parol) {
        password.sendKeys(parol);
    }
    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
       loginButton.click();
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        System.out.println(driver.getCurrentUrl());
    }
}
