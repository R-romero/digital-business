package br.com.fiap.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertySingleton {
	
	private static Properties prop;
	private static Logger log =
			LoggerFactory.getLogger(PropertySingleton.class);
	
	//Construtor Private, ninguém instancia
	private PropertySingleton(){};
	
	public static Properties getInstance(){
		log.trace("Recuperando as propriedades do sistema.");
		if(prop == null){
			log.debug("Instanciando o objeto de propriedades.");
			try {
				log.debug("Carregando as propriedades.");
				prop = new Properties();
				//Carregar as propriedades no prop
				prop.load(PropertySingleton.class.
						getResourceAsStream("/config.properties"));
			} catch (Exception e) {
				e.printStackTrace();
				log.error("Erro ao carregar as propriedades.");
			}
		}
		
		return prop;
	}
}
