package moolya.embibe.tests.web.functional.searchHomePage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import moolya.embibe.pages.web.LandingPage;
import moolya.embibe.pages.web.MyProfilePage;
import moolya.embibe.pages.web.SearchHomepage;
import moolya.embibe.pages.web.W_BasePage;
import moolya.embibe.tests.web.W_BaseTest;

public class SHP_Func_80 extends W_BaseTest {

	private W_BasePage basepage;
	private LandingPage lp;
	private SearchHomepage shp;
	private MyProfilePage mpp;

	@Test(dataProvider="browserData")
	public void SHP_Func_80_Test(String browser) throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException{
		basepage = new W_BasePage(wdriver);
		wdriver = basepage.launchWebApp(browser);
		Reporter.log("Starting Test: Functional : Search Home Page : SHP_Func_80 "+ ", Browser is :" + browser, true);
		lp = new LandingPage(wdriver);
		lp.waitForLandingPageToLoad();
		lp.assertLandingPage();
		shp = lp.clickStartNow();
		shp.login();
		mpp=shp.referenceToMyProfilePage();
		mpp.clickUserDropdown();
		mpp.clickMyProfile();
		mpp.clickEditProfile();
		mpp.enterProfileName("yathee");//Not able to enter name through automation
		mpp.selectPreparingForOption("Engineering");//Not able to select through automation
		
	}
}
