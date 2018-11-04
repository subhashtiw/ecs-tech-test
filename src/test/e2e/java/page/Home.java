package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home {
    WebDriver driver ;

    public Home(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how=How.XPATH, using = "//div/button[contains(@data-test-id,'render-challenge')]")
    WebElement buttonRenderChallenge;

    public void clickRenderChallengeButton() throws InterruptedException {
        Thread.sleep(2000);
        buttonRenderChallenge.click();
    }

    @FindBy(how=How.XPATH,using = "//h1[contains(text(),'Arrays Challenge')]")
    WebElement arrayChallengeTitle;
    public boolean arrayChallengeShouldBeVisible() throws InterruptedException {
        Thread.sleep(3000);
        return arrayChallengeTitle.isDisplayed();

    }

    @FindBy(how=How.XPATH,using = "//td[contains(@data-test-id,'array-item-1')]")
    List<WebElement> firstArray;

    @FindBy(how=How.XPATH,using = "//td[contains(@data-test-id,'array-item-2')]")
    List<WebElement> secondArray;

    @FindBy(how=How.XPATH,using = "//td[contains(@data-test-id,'array-item-3')]")
    List<WebElement> thirdArray;

    public void createArraysOutOfTableRows() {
        for(int i =0; i<firstArray.size(); i++){
            System.out.print(firstArray.get(i).getText()+",");
        }

    }

    public void displayArraysOnScreen() {
        System.out.println("First Array");
        for(int i =0; i<firstArray.size(); i++){
            System.out.print(firstArray.get(i).getText()+",");
        }
        System.out.println("Second Array");
        for(int i =0; i<secondArray.size(); i++){
            System.out.print(secondArray.get(i).getText()+",");
        }
        System.out.println("Third Array");
        for(int i =0; i<thirdArray.size(); i++){
            System.out.print(thirdArray.get(i).getText()+",");
        }
    }


    public String returnTheIndexOfTheArray(List<WebElement> arrayName) throws Exception {
        String leftSideItems;
        String rightSideItems;

        for (int i = 0; i < arrayName.size(); i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int l = i - 1; l >= 0; l--) {
                leftSideItems = arrayName.get(l).getText();
                Integer left = Integer.parseInt(leftSideItems);
                sum1 += left;
            }
            for (int l = i + 1; l < arrayName.size(); l++) {
                rightSideItems = arrayName.get(l).getText();
                Integer right = Integer.parseInt(rightSideItems);
                sum2 += right;
            }
            if (sum1 == sum2) {
                System.out.println(arrayName.get(i).getText());
                return (arrayName.get(i).getText());
            }
        }
        return "No result found";
    }

    public String displayResultOfFirstArrayCalculation() {
        try {
            return returnTheIndexOfTheArray(firstArray);
        } catch (Exception e) {
            return "No result found";
        }
    }

    public String displayResultOfSecondArrayCalculation() {
        try {
            return returnTheIndexOfTheArray(secondArray);
        } catch (Exception e) {
            return "No result found";
        }
    }

    public String displayResultOfThirdArrayCalculation() {
        try {
            return returnTheIndexOfTheArray(thirdArray);
        } catch (Exception e) {
            return "No result found";
        }
    }

    @FindBy(how=How.XPATH,using = "//input[contains(@data-test-id,'submit-1')]")
    WebElement submit1;

    @FindBy(how=How.XPATH,using = "//input[contains(@data-test-id,'submit-2')]")
    WebElement submit2;

    @FindBy(how=How.XPATH,using = "//input[contains(@data-test-id,'submit-3')]")
    WebElement submit3;

    @FindBy(how=How.XPATH,using = "//input[contains(@data-test-id,'submit-4')]")
    WebElement name;

    @FindBy(how=How.XPATH,using = "//*[@id=\"challenge\"]/div/div/div[2]/div/div[2]/button")
    WebElement submitButton;

    public void submitAnswer() throws InterruptedException {
        submit1.sendKeys(displayResultOfFirstArrayCalculation());
        submit2.sendKeys(displayResultOfSecondArrayCalculation());
        submit3.sendKeys(displayResultOfThirdArrayCalculation());
        name.sendKeys("Subhash Tiwari");
        submitButton.click();
        Thread.sleep(2000);
    }


}
