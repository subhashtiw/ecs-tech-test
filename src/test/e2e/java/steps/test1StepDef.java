package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Home;

public class test1StepDef {
   private WebDriver driver = new ChromeDriver();
   Home homePage;


    @Given("^the user is on the application home page$")
    public void theUserIsOnTheApplicationHomePage() throws Throwable {
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:3000");
    }

    @When("^the user click on RENDER THE CHALLENGE button$")
    public void theUserClickOnRENDERTHECHALLENGEButton() throws Throwable {
        homePage = new Home(driver);
        homePage.clickRenderChallengeButton();
    }

    @Then("^the Array Challenge should be displayed$")
    public void theArrayChallengeShouldBeDisplayed() throws Throwable {
        Assert.assertEquals("The Array Challenge is not visible", homePage.arrayChallengeShouldBeVisible(), true);
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Then("^the table rows are extracted in an array$")
    public void theTableRowsAreExtractedInAnArray() throws Throwable {
       homePage.createArraysOutOfTableRows();
    }

    @And("^displayed on screen$")
    public void displayedOnScreen() throws Throwable {
        homePage.displayArraysOnScreen();
    }

    @Then("^display result of the first array$")
    public void displayResultOfTheFirstArray() throws Throwable {
        homePage.displayResultOfFirstArrayCalculation();
    }

    @Then("^calculate and submit the answers$")
    public void calculateAndSubmitTheAnswers() throws Throwable {
        homePage.submitAnswer();
    }
}
