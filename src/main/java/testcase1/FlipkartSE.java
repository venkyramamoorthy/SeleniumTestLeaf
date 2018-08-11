package testcase1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class FlipkartSE extends SeMethods {
	@Test
	public void flip()
	{
		startApp("chrome", "https://www.flipkart.com/");
		WebElement cross =locateElement("xpath", "//*[contains(text(),'✕')]");
		click(cross);
		WebElement tv = locateElement("xpath","//*[contains(text(),'TVs & Appliances')]");
		WebElement samsung = locateElement("xpath", "//*[@title='Samsung']//following::*[@title='Samsung']");
		Mouseover(tv,samsung);
		WebElement min = locateElement("xpath", "//*[@id='container']//*[@class='fPjUPw']");
		selectDropDownUsingText(min,"₹25000");
		waiting(3000);
		WebElement max = locateElement("xpath", "//*[@id='container']//*[@class='fPjUPw']//following::*[@class='fPjUPw']");
		selectDropDownUsingText(max,"₹60000");
		waiting(3000);
		WebElement screensize = locateElement("xpath", "//*[contains(text(),'Screen Size')]");
		click(screensize);
		waiting(2000);
		WebElement screensizevalue = locateElement("xpath", "//*[contains(text(),'Screen Size')]//following::*[@class='_1p7h2j'][3]");
		click(screensizevalue);
		waiting(3000);
		WebElement product1 = locateElement("xpath", "//*[@class='_3wU53n'][1]");
		click(product1);
		waiting(2000);
		switchToWindow(1);
		WebElement compare = locateElement("xpath", "//*[@class='_1p7h2j']");
		click(compare);
		waiting(3000);
		closeBrowser();
		switchToWindow(0);
		WebElement product2 = locateElement("xpath", "//*[@class='_3wU53n']//following::*[@class='_3wU53n']");
		click(product2);
		waiting(5000);
		switchToWindow(1);
		waiting(3000);
		WebElement compare1 = locateElement("xpath", "//*[@class='_1p7h2j']");
		click(compare1);
		waiting(3000);
		WebElement comparebutton = locateElement("xpath", "//*[@class='G934d8']/span[contains(text(),'COMPARE')]");
		click(comparebutton);
		WebElement amount1 = locateElement("xpath", "//*[@class='col col-4-12 _1ouGhW']//*[@class='_1vC4OE']");
		String text1 = getText(amount1);
		String replace1 =text1.replace("₹", "").replace(",", "");
		int amt1=Integer.parseInt(replace1);
		WebElement amount2 = locateElement("xpath", "//*[@class='col col-4-12 _1ouGhW']//*[@class='_1vC4OE']//following::*[@class='_1vC4OE']");
		String text2 = getText(amount2);
		String replace2 =text2.replace("₹", "").replace(",", "");
		int amt2=Integer.parseInt(replace2);
		WebElement buy1 = locateElement("xpath", "//*[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']");
		WebElement buy2 = locateElement("xpath", "//*[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']//following::*[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c']");
		if(amt1>amt2)
		{
			click(buy2);
		}	
		else
		{
			click(buy1);
		}

	}

}