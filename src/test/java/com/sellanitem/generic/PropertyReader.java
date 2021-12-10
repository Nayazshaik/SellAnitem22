package com.sellanitem.generic;

	import java.io.FileInputStream;
	import java.util.Properties;

	public class PropertyReader {
		static Properties prop =new Properties();
		
	public static void initProperty() {
		try {
			prop.load(new FileInputStream("C:\\Users\\nayaz\\eclipse-workspace\\SellAnitem22\\src\\test\\resources\\config\\configure.properies"));
		} catch(Exception e) {
			e.printStackTrace();
		}	
		}
		
		public static String getProperty(String key)
		{
			return prop.getProperty(key);
		}


}
