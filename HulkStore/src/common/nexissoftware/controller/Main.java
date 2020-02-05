package common.nexissoftware.controller;

import java.awt.EventQueue;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import common.nexossoftware.utils.GetProperties;
import common.nexossoftware.vista.Principal;

/**
 * Launch the application.
 */
public class Main {
	private static Logger logger = Logger.getLogger(Main.class);
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				String log4jConfPath = "resources\\log4j.properties";
				
				PropertyConfigurator.configure(log4jConfPath);
				logger.info(GetProperties.getInstance().getdataProperties("path_excel"));
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					
//					logger.error(e.getMessage());
					
				}
			}
		});
	}

}
