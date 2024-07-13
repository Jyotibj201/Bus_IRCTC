package busIrctc_genericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	/**
	 * @author Jyoti Jogur
	 * Generic Method to read the Data from .properties file and achieve Data Driven Testing
	 * @param
	 * @throws IOException 
	 */
	public void readDataFromPropertiesFile() throws IOException{
		FileInputStream fis=new FileInputStream("./TestData/CommonProperties.properties");
		Properties ps=new Properties();
		ps.load(fis);
		String browser=ps.getProperty("Browser");
		String url=ps.getProperty("URL");
		String username=ps.getProperty("UserName");
		String pwd=ps.getProperty("Password");

	}
	
	public String getUrl() throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/CommonProperties.properties");
		Properties ps=new Properties();
		ps.load(fis);
		String url=ps.getProperty("URL");
		return url;
	}


}
