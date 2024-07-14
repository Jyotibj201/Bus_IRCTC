package busIrctc_genericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.JSONPObject;

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
	
	/**
	 * @author Jyoti Jogur
	 * Generic Method to read the Single Data from .properties file and achieve Data Driven Testing
	 * @param
	 * @throws IOException 
	 */
	public String getUrl() throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/CommonProperties.properties");
		Properties ps=new Properties();
		ps.load(fis);
		String url=ps.getProperty("URL");
		//String url=ps.getProperty("URL").toString();
		return url;
	}
	
	
	/**
	 * @author Jyoti Jogur
	 * Generic Method to read the Single Data from .properties file and achieve Data Driven Testing
	 * @param
	 * @throws IOException 
	 */
	public String getUsername(String Username) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/CommonProperties.properties");
		Properties ps=new Properties();
		ps.load(fis);
//		String userName=ps.getProperty("Username");
		String userName=ps.getProperty("Username").toString();
		return userName;
	}

	/**
	 * @author Jyoti Jogur
	 * Generic Method to read the Single Data from .properties file and achieve Data Driven Testing
	 * @param
	 * @throws IOException 
	 */
	public String getPassword(String Password) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/CommonProperties.properties");
		Properties ps=new Properties();
		ps.load(fis);
//		String pwd=ps.getProperty("Password");
		String pwd=ps.getProperty("Password").toString();
		return pwd;
	}
	
	/**
	 * @author Jyoti Jogur
	 * Generic Method to read the Single Data from .properties file and achieve Data Driven Testing
	 * @param
	 * @throws IOException 
	 */
	public String getBrowserName(String browser) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/CommonProperties.properties");
		Properties ps=new Properties();
		ps.load(fis);
		String browserName=ps.getProperty("Browser").toString();
		return browserName;
	}
	
	/**
	 * @author Jyoti Jogur
	 * Read data from JSON file
	 * @throws FileNotFoundException 
	 */
//	public String readDataFromJSON() throws FileNotFoundException {
//		FileReader reader=new FileReader("./TestData/CommonProperties.properties");
//		JsonParser parser=new JsonParser();
//		Object object=parser.parse(reader);
//		JSONPObject jsonobj=(JSONPObject) object;
//		String jsonValue=jsonobj.getValue().toString();
//		return jsonValue;
//	}


}
