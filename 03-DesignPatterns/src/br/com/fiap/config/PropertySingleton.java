package br.com.fiap.config;

import java.util.Properties;

public class PropertySingleton {
	
	private static Properties prop;
	
	//Construtor Private, ninguém instancia
	private PropertySingleton(){};
	
	public static Properties getInstance(){
		if(prop == null){
			try {
				prop = new Properties();
				//Carregar as propriedades no prop
				prop.load(PropertySingleton.class.
						getResourceAsStream("/config.properties"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return prop;
	}
}
