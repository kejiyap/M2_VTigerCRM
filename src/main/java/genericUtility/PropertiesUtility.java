package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This is a utility class which deals with Properties file
 * @author Soundarya
 * @version 25.03.02
 */
public class PropertiesUtility {

	/**
	 * This is a generic method to fetch a value from Properties file using its corresponding key
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromPropertiesFile(String key) throws Exception
	{
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
