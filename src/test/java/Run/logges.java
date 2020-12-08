package Run;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logges {
	public static Logger lg=Logger.getLogger(logges.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PropertyConfigurator.configure("/Users/Ali/eclipse-workspace/Trainingsession/logged.properties");
lg.info("This is our first logs for use");
	}

}




//i)Download and add log4j dependencies into pom.xml file
//ii)Create properties file under project
//iii)Create logger instance in the class
//iv)Give path for your properties file