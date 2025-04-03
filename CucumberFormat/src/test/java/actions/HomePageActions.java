package actions;

import org.openqa.selenium.support.PageFactory;

import pages.HomePageLocaters;
import utilities.HelperClass;

public class HomePageActions {
	HomePageLocaters homePageLocaters=null;
	public HomePageActions() {
		this.homePageLocaters=new HomePageLocaters();
		PageFactory.initElements(HelperClass.getDriver(), homePageLocaters);
	}
	
	public String getHomePageText() {
		return homePageLocaters.dashboard.getText();
	}
}