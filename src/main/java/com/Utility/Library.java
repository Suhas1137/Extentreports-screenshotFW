package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
public static ExtentTest test;
	public static void Custom_senkeys(WebElement element,String value,String fieldname) {
		try {
			if(element.isDisplayed() && element.isEnabled()) 
			element.sendKeys(value);
			test.log(Status.PASS,fieldname+"==value successfully send=="+value );
		
		}catch(Exception e){
			test.log(Status.FAIL, fieldname+"==value unable to send=="+e);
		}
	}
	public static void Custom_Click(WebElement element,String fieldname) {
		try {
			if(element.isEnabled()) 
			element.click();
			test.log(Status.PASS, fieldname+"==Clicked successfully");
		}catch (Exception e) {
			test.log(Status.FAIL, fieldname+"unable to clicked"+e);
		}
	}
}
