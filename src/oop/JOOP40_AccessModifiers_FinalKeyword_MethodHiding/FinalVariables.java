package oop.JOOP40_AccessModifiers_FinalKeyword_MethodHiding;

/**
 * @author esalkan
 *
 */
public class FinalVariables {

	/**
	 * When instance variable is final, we need to initialize it in:
	 * 
	 * • same statement
	 * 
	 * • constructor
	 * 
	 * • init block
	 */

	public final int Roadster_Max_Range = 600; // In same statement we initialize the final variable value;
	public final int Model_3_MaxSpeed; // We create instance variable with final access modifier. and we will
										// initialize it in constructor.
	public final int Model_X_Passengers; // We create another instance variable. If we not initialize it in same
											// statement or in constructor our constructor will push us to initialize it
											// in constructor. But we can initialize it in "init block"
	public static final String Admin_UserName; // This variable will be initialized in static block.

	// Creating a Constructor
	public FinalVariables() {
		// We initialize it in constructor.
		Model_3_MaxSpeed = 299;
	}

	// We are initiale Model_X_Passengers in "init" Block
	{
		Model_X_Passengers = 8;
		// Admin_UserName = "aLkan";
	}

	// We initialize public static final String Admin_UserName
	static {
		Admin_UserName = "aLkan";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Only instance blocks only runs, whenever we Create an object before
		 * constructor. That's why we can not initialize Admin_UserName
		 */

		// FinalVariables f = new FinalVariables();
		// f.Admin_UserName = "aLkan";
		
		final int Max_Passengers_Count = 6;
		final boolean SSL = true;
		final int SSN;
		// public final int Request; // Local variables can not have access modifiers.
		
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println(finalVars.Roadster_Max_Range);
		System.out.println(finalVars.Model_3_MaxSpeed);
		System.out.println(FinalVariables.Admin_UserName); // We access directly from class
		System.out.println(Admin_UserName);
		
		mA();
		
	}
	
	public static void mA() {
		System.out.println(Admin_UserName);
	}
}
