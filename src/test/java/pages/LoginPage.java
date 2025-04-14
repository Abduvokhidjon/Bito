package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {


    WebDriver driver;

    public LoginPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//input[@name=\"phone_number\"]")
    protected WebElement phoneNumber;

    @FindBy (xpath = "//input[@name=\"password\"]")
    protected WebElement password;

    @FindBy (xpath = "//button[@type=\"submit\"]")
    protected WebElement loginButton;





}
