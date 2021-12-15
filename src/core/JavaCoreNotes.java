package core;

import java.util.ArrayList;

/**
 * @author esalkan
 *
 */
public class JavaCoreNotes {

	public static void main(String[] args) {
		
		
		
		for (String each : createVariables(10)) {
			
			
		}
		
	}
	
	public static ArrayList<String> createVariables(int n){
		ArrayList<String> variables = new ArrayList<String>();
		
		for(int i = 0; i <= n; i++) {
			variables.add("variable"+i);
		}
		
		
		
		return variables;
	}
	
}


