package org.cts.journeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengerPage extends Base {
	public PassengerPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='react-select-9--value']")
	private WebElement selMr;
	//span[@id='react-select-13--value-item']
	public WebElement getSelMr() {
		return selMr;
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement fNameElmnt;

	public WebElement getfName() {
		return fNameElmnt;
	}

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement lNameElmnt;

	public WebElement getlName() {
		return lNameElmnt;
	}
	
	@FindBy(xpath = "//span[@id='react-select-10--value-item']")
	private WebElement dateElmnt;

	public WebElement getDateElmnt() {
		return dateElmnt;
	}
	
	
	@FindBy(xpath = "//span[@id='react-select-11--value-item']")
	private WebElement mnthElmnt;

	public WebElement getMnthElmnt() {
		return mnthElmnt;
	}
	
	@FindBy(xpath = "//span[@id='react-select-12--value-item']")
	private WebElement yearElmnt;

	public WebElement getYearElmnt() {
		return yearElmnt;
	}
	
	@FindBy(id = "phone0Input-0-required-passenger-item-ADT-1-0")
	private WebElement selPhoneNo;

	public WebElement getSelPhNo() {
		return selPhoneNo;
	}
	@FindBy(xpath = "(//input[@id='emailRequiredPassengerItemAdt1Email-required-passenger-item-ADT-1'])[1]")
	private WebElement emailElmnt;

	public WebElement getEmailElmnt() {
		return emailElmnt;
		
	}
	
			@FindBy(xpath = "(//input[@id='confirmEmailRequiredPassengerItemAdt1ConfirmEmail-required-passenger-item-ADT-1'])[1]")
			private WebElement cnfrmEmailElmnt;

			public WebElement getCnfrmEmailElmnt() {
				return cnfrmEmailElmnt;
			}
			@FindBy(xpath = "//button[@id='dxp-passenger-view-skip']")
			private WebElement skipElmnt;

			public WebElement getSkipElmnt() {
				return skipElmnt;
			}
}
