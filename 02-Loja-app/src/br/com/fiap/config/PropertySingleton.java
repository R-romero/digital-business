package br.com.fiap.config;

import java.util.Properties;

public class PropertySingleton {
	
	private static Properties prop;
	
	//Private constructor, nobody instantiate
	private PropertySingleton(){};
	
	public static Properties getInstance(){
		if(prop == null){
			try {
				prop = new Properties();
				//Load properties on prop
				prop.load(PropertySingleton.class.
						getResourceAsStream("/config.properties"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return prop;
	}
}