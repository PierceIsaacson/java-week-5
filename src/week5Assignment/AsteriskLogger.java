package week5Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		/*Prints log input with concatenated asterisks 
		 * on either side of input to the console
		 */
		System.out.println("***"+log+"***");
	}

	@Override
	public void error(String error) {
		/*for loop generates the dynamic length of  
		 * asterisks needed above and below the
		 * error input to create an output 
		 * inside of a perfect length asterisk box 
		 */
		String errorBox = "";
		
		for (int i=0; i<error.length(); i++) {
			errorBox += '*';
		}
		System.out.println("**********"+errorBox+"***\n"+
							"***ERROR: "+error+"***\n"+
							"**********"+errorBox+"***");
	
	}

}

