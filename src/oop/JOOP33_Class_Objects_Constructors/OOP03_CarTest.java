package oop.JOOP33_Class_Objects_Constructors;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP03_CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating an object from OOP_04_CarClass and named it car1
		// OOP_04_CarClass sınıfından bir nesne oluşturuyoruz ve ona car1 adını veriyoruz
		OOP04_CarClass car1 = new OOP04_CarClass(); // This object will use the constructor which is non-parameter type above
													// Bu nesne, parametre olmayan türdeki yapılandırıcıyı kullanacaktır yukarıda

		System.out.println("Car 1 : " + car1); // Printing the object reference
												// Nesne referansını yazdırıyoruz

		System.out.println("Car 1 Model : " + car1.model); // Printing the model of the car1
														   // car1'in modelini yazdırıyoruz

		System.out.println("Car 1 Make : " + car1.make); // Printing the make of the car1
		 												 // car1'in make'ini yazdırıyoruz

		System.out.println("Car 1 Year : " + car1.year); // Printing the year of the car1
		 												 // car1'in year'ini yazdırıyoruz

		System.out.println("Car 1 Mile : " + car1.mile); // Printing the mile of the car1
		 												 // car1'in mile'ini yazdırıyoruz


		// Creating an object from _04_CarClass and named it car2 and assign the values to the defined variables
		// OOP_04_CarClass sınıfından bir nesne oluşturuyoruz ve ona car2 adını veriyoruz ve tanımlanan değişkenlere değer atıyoruz
		OOP04_CarClass car2 = new OOP04_CarClass("AMG", "Mercedes", 2007, 65000, "White");
		System.out.println("Car 2 : " + car2); // Printing the object toString method
		 										// Nesne toString yöntemini yazdırıyoruz

		// Creating an object from _04_CarClass and named it car3 and assign the values to the defined variables
		// OOP_04_CarClass sınıfından bir nesne oluşturuyoruz ve ona car3 adını veriyoruz ve tanımlanan değişkenlere değer atıyoruz
		OOP04_CarClass car3 = new OOP04_CarClass("Corolla", "Toyota", 2015, 32000, "Yellow");

		// Creating an object from _04_CarClass and named it car4 and assign the values to the defined variables
		// OOP_04_CarClass sınıfından bir nesne oluşturuyoruz ve ona car4 adını veriyoruz ve tanımlanan değişkenlere değer atıyoruz
		OOP04_CarClass car4 = new OOP04_CarClass("Altima", "Nisssan", 2014, 41000, "Black");

	}

}
