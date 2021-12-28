package oop.JOOP42_Interface;

/**
 * @author esalkan
 *
 */
//	Creating an Interface
//	• An interface looks similar to a class, except the keyword interface is used 
//	instead of the keyword class
public interface Electric {

	// Fields in Interface
	// • An interface can contain field declarations, but all fields in an interface
	// are treated as final and static.
	public static final boolean HAS_BATTERIES = true;
	// This one is totally fine too, BUT...
	boolean HAS_BATTERIES2 = false; // this is automaticly changed to the public static final even if we are not
									// write this access modifiers

	// Creating an abstract method
	// • Methods that are specified in an interface have no bodies.
	public abstract void charge();

	// Inside the interface wich methods created they are automaticly created
	// abstract
	void charge2(); // this is automaticly converted to the "public abstract" even we not write it
					// is "public abstract"

}
