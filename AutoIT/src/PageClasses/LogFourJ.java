package PageClasses;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogFourJ {

	private static final Logger log=LogManager.getLogger(LogFourJ.class);
	public static void main(String[] args) {
		

		log.debug("Hello");
		log.error("Error Messag");
		log.fatal("Emerging Fatal");
		System.out.println("Hi this is Ankur");
	}

}
