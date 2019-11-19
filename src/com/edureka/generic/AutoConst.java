package com.edureka.generic;

import org.apache.log4j.Logger;

public interface AutoConst 
{

	String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_VALUE=".\\Drivers\\chromedriver.exe";
	//String GECKO_KEY="webdriver.gecko.driver";
	//String GECKO_VALUE=".//Driver//geckodriver.exe";
	String APP_URL="https://www.edureka.co/";
	String EXP_URL="https://www.edureka.co/blog/";
	String FILE_PATH="C:\\Applications\\Edureka\\InputData\\Module9.xlsx";
	
	Logger log=Logger.getLogger("Edureka.log");
	

}
