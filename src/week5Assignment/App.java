package week5Assignment;

public class App {

	public static void main(String[] args) {
		/*logger classes are set for use
		 */
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		/*
		 * inputs for the class methods 
		 * are separated by println() for readability
		 */
		logger1.log("AsteriskLog");
		System.out.println();
		logger1.error("AsteriskError");
		System.out.println();
		logger2.log("SpacedLog");
		System.out.println();
		logger2.error("SpacedError");
		
	}
}

