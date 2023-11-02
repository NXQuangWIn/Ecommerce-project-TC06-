package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    WebDriver driver;

    By myAccountLink = By.linkText("MY ACCOUNT");

    By createAccountLink = By.linkText("CREATE AN ACCOUNT");
    By fistNameInputLocator = By.id("firstname");
    By lastNameInputLocator = By.id("lastname");
    By emailInputLocator = By.id("email_address");
    By passwordInputLocator = By.id("password");
    By confirmPasswordInputLocator = By.id("confirmation");
    By registerButton = By.xpath("//button[@title='Register']");


    //login
    By loginButton = By.xpath("//span[contains(text(),'Login')]");
    By myWishlistLink = By.linkText("MY WISHLIST");
    By emailInputLocator2 = By.id("email");
    By passwordInputLocator2 = By.id("pass");

    By addToCartButton = By.xpath("//span[contains(text(),'Add to Cart')]");




    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccountLink() {
        driver.findElement(myAccountLink).click();
    }



    public void clickCreateAccountLink() {
        driver.findElement(createAccountLink).click();
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameElement = driver.findElement(fistNameInputLocator);
        firstNameElement.clear();
        firstNameElement.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        WebElement lastNameElement = driver.findElement(lastNameInputLocator);
        lastNameElement.clear();
        lastNameElement.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        WebElement emailElement = driver.findElement(emailInputLocator);
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    //login
    public void clickMyWishlistLink() {
        driver.findElement(myWishlistLink).click();
    }
    public void enterEmail2(String email) {
        WebElement emailElement = driver.findElement(emailInputLocator2);
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    public void enterPassword2(String password) {
        WebElement passwordElement = driver.findElement(passwordInputLocator2);
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    //

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordInputLocator);
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordInputLocator);
        confirmPasswordElement.clear();
        confirmPasswordElement.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }





}
