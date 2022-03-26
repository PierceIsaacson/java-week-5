package week5Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		/*Stringbuilder and loop concepts scans the input 
		 * to replace each character with itself and
		 * a concatenated space except for a border character 
		 * so that unnecessary spaces aren't added to
		 * the new output string
		 */
		StringBuilder spacedString = new StringBuilder(log);
		
		for (int i=log.length()-1; i>=1; i--) {
			spacedString.replace(i, i+1, " "+log.charAt(i));
		}
		System.out.println(spacedString.toString());
		
	}

	@Override
	public void error(String error) {
		/*Same logic as above but with 
		 * "ERROR: " concatenated to the 
		 * console output
		 */
		StringBuilder spacedString = new StringBuilder(error);
		
		for (int i=error.length()-1; i>=1; i--) {
			spacedString.replace(i, i+1, " "+error.charAt(i));
		}
		System.out.println("ERROR: "+spacedString.toString());
		
	}

}

