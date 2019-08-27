package org.cts.journeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//select[@name='origin'])[1]")
	private WebElement sourceElement;
	public WebElement getSourceElement() {
		return sourceElement;
	}
	
	@FindBy(xpath="//select[@name='destination']")
	private WebElement destElement;
	public WebElement getDestElement() {
		return destElement;
	
	}
	
	@FindBy(xpath="(//input[@id='journeySpan'])[2]")
	private WebElement oneWayElement;
	public WebElement getOneWayElement() {
		return oneWayElement;
	}
	
	@FindBy(id="departureDate")
	private WebElement depDate;
	public WebElement getDepDate() {
		return depDate;
	}
	@FindBy(xpath="(//a[text()='8'])[1]")
	private WebElement depDate1;
	public WebElement getDepDate1() {
		return depDate1;
	}
	
	@FindBy(xpath="(//div[@class='flex-child flex-child9'])[1]")
	private WebElement findFlightElement;
	public WebElement getFindFlightElement() {
	return findFlightElement;
			}
	
		
	}
	
	

