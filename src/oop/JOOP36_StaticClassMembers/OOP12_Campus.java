package oop.JOOP36_StaticClassMembers;

/**
 * @author esalkan
 *
 */
public class OOP12_Campus {

	private String city;

	static String country;

	static {
		System.out.println("Static Block - 1 printed");
		// When an object created in main method inside which static method is up it
		// will work firstly for one time. then compiler will search second or next or next one and
		// if there is not another it will stop for searching another static and will do
		// what it must to do
	}

	public OOP12_Campus(String city) {
		System.out.println("Constructor is printed ");
	}

	static {
		System.out.println("Static Block - 2 printed");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
