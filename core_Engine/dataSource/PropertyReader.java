package dataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	public static String getPropertyValue(String filepath, String key) throws IOException {
		String val = null;
		InputStream file = new FileInputStream(filepath);
		Properties property = new Properties();
		property.load(file);
		val = property.getProperty(key);
		return val;
	}
	public static String optimumPropertyGet(String filepath, String key) throws IOException {
		new Properties().load(new FileInputStream(filepath));
		return new Properties().getProperty(key);
	}
}
