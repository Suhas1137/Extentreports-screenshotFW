package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Orangehrmpom;
import com.PageObject.Orangepom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Verifyorange_TC001 extends BaseClass{


	@Test
	public void verifyorange_tc001() {
		Orangehrmpom orange=PageFactory.initElements(driver, Orangehrmpom.class);
		Library.Custom_senkeys(orange.getUsername(),excel.getStringData("Sheet1", 0, 0), "Emailid");
		Library.Custom_senkeys(orange.getPassword(),excel.getStringData("Sheet1", 0, 1), "Password");
		Library.Custom_Click(orange.getLoginbtn(), "loginbtn");
	}
	
}
