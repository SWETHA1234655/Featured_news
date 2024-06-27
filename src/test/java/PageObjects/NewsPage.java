package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ExcelOutputFile;
import testBase.BaseClass;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class NewsPage extends BasePage {

	// Constructor to initialize the driver from the BasePage class
	public NewsPage(WebDriver driver) {
		super(driver);
	}

	BaseClass bc = new BaseClass();
	
	// Locators for various elements on the news page
	@FindBy(xpath = "//div[@data-automation-id='Tiles']/div")
	List<WebElement> featureNews;

	@FindBy(xpath = "//div[@id='title_text']")
	WebElement title;

	@FindBy(xpath = "//div[@data-automation-id=\"textBox\"]/p")
	List<WebElement> paragraph;

	@FindBy(xpath = "//div[@data-automation-id='personaDetails']")
	WebElement author;

	@FindBy(xpath = "//div[@data-automation-id='textBox']//a")
	List<WebElement> links;

	@FindBy(xpath = "//span[text()='Share']")
	WebElement shareButton;

	@FindBy(xpath = "//ul[@role='presentation']")
	WebElement shareOptions;

	@FindBy(xpath = "//*[@data-automation-id=\"contentScrollRegion\"]")
	WebElement scroll;

	@FindBy(xpath = "//span[contains(text(),'Views')]")
	WebElement views;

	@FindBy(xpath = "//span[contains(text(),'liked this')]")
	WebElement likes;
	
	//Declaration of Actions class
	Actions act = new Actions(driver);
	//Declaration of JavascriptExecutor
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//Declaration of Explicit wait 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	// Method to get all news elements
	public List<WebElement> getAllNewsElements() throws Exception {
		
		//Take screenshot for fearture news
		bc.screenShot("\\DisplayfeatureNews");
		wait.until(ExpectedConditions.visibilityOfAllElements(featureNews));
		
		return featureNews;
	}
	
	// Method to verify the tooltip of the news title
	public void verifyTitleTooltip(int i) throws InterruptedException, IOException {

		Thread.sleep(5000);
		WebElement title = driver.findElement(By.xpath("//div[@id='title_text']"));
		//highlight the title 
		bc.highlightElement(js, title);
		//Take screenshot for title
		bc.screenShot("\\title");
		// Write the title text to the Excel file
		String Title = title.getText();
		System.out.println(title.getText());
		ExcelOutputFile.setCellData("Feature News", i, 0, Title);
		try {
			// Get the tooltip attribute and write it to the Excel file
			String tooltip = title.getAttribute("title");
			ExcelOutputFile.setCellData("Feature News", i, 1, tooltip);
			if (title.getText().equals(tooltip)) 
			{
				// Check if the title text and tooltip are the same and write the result to the Excel file
				ExcelOutputFile.setCellData("Feature News", i, 2, "Same");
				System.out.println("Header and tooltip are same");
			}

		} 
		catch (Exception e) {
			// Check if the title text and tooltip are not same and write the result to the Excel file
			ExcelOutputFile.setCellData("Feature News", i, 2, "Not Same");
			System.out.println("Header and tooltip are not same");
		}
	}
	
	// Method to hover over the author details
	public void hoverAuthorDetails() {
		
		try 
		{	
			// Check if the author element is displayed
			if (author.isDisplayed())
			{
				// Move to the author element and click it
				act.moveToElement(author).perform();
				//highlight the author details
				bc.highlightElement(js, author);
				act.click();
				Thread.sleep(5000);
				bc.screenShot("\\Author");
				
			}
		} 
		catch (Exception e) {
			System.out.println("Author not found");
		}
	}
	
	//Method to click the share button
	public void clickShareButton() throws InterruptedException, IOException {
		
		//highlight the share button
		BaseClass.highlightElement(js, shareButton);
		Thread.sleep(5000);
		shareButton.click();
		bc.screenShot("\\shareButton");
		

	}

	//Method to get the share options text and newsletter paragraph
	public void getShareOptions() throws InterruptedException, IOException {
		
		//highlight the share options
		bc.highlightElement(js, shareOptions);
		System.out.println("Share options here:");
		Thread.sleep(5000);
		//Take screenshot for share options
		bc.screenShot("\\shareOptions");
		wait.until(ExpectedConditions.visibilityOf(shareOptions));
		System.out.println(shareOptions.getText());
		Thread.sleep(5000);
		for (WebElement p : paragraph) {
			System.out.println(p.getText());
		}

	}
	
	//Method to get the news letter links
	public void getNewsletterLink() throws InterruptedException, IOException {
		Thread.sleep(5000);
		for (WebElement li : links) {
			System.out.println("Links :" + li.getAttribute("href"));
		}
		//Take screenshots for links
		bc.screenShot("\\Links");
	}
	
	//Methods to get the total likes of the news
	public void totalLikes() throws IOException {
		js.executeScript("arguments[0].scrollTop += 12000;", scroll);
		try {
			wait.until(ExpectedConditions.visibilityOf(likes));
			//highlight the views
			bc.highlightElement(js, likes);
			//Take screenshot for likes
			bc.screenShot("\\Likes");
			System.out.println(likes.getText());
			
		} catch (Exception e) {
			System.out.println("No one liked this...");
		}
	}
	
	//Methods to get the total views of the news
	public void totalViews() throws IOException {

		js.executeScript("arguments[0].scrollTop += 12000;", scroll);
		//highlight the views
		bc.highlightElement(js, views);
		wait.until(ExpectedConditions.visibilityOf(views));
		System.out.println(views.getText());
		//Take screenshot for views
		bc.screenShot("\\views");
	}
	
	//Methods to navigate the home page
	public void navigate() {

		driver.get("https://be.cognizant.com");

	}

}
