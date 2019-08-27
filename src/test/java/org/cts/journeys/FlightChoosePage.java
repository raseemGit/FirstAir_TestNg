package org.cts.journeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightChoosePage extends Base {
	public FlightChoosePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@type='button'])[22]")
	private WebElement selBtnElmnt;
	public WebElement getSelBtnElmnt() {
		return selBtnElmnt;
	}
	@FindBy(xpath="(//button[@type='button'])[24]")
	private WebElement selBtnElmnt2;
	public WebElement getSelBtnElmnt2() {
		return selBtnElmnt2;
	}
	@FindBy(xpath="(//button[@type='button'])[14]")
	private WebElement selPassBtn;
	public WebElement getSelPassBtn() {
	return selPassBtn;
	}
	/*@FindBy(xpath="(//button[@type='button'])[39]")
	private WebElement selcnfrm;
	public WebElement getSelcnfrm() {
	return selcnfrm;*/
	
}

