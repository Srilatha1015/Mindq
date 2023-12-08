package BasePP;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Genericmethods extends BaseCCC{
	
	public static String takescreenshot() throws IOException
	{
		TakesScreenshot scrShot = ((TakesScreenshot) BaseCCC.driver);
		File sourceFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destinationpath = new File("C://Screenshots//"+"ScreenCaprture"+
		                               System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(sourceFile, destinationpath);
		
		String screenshotpath = destinationpath.getAbsolutePath();
		return screenshotpath;
		
	

}
}