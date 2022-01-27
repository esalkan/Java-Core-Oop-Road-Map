package core.JC01_ourFirstJavaCode;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC01_myFirstJavaProgram {

	/**
	 * @param args
	 */
	// Every Java application must contain a main method whose signature looks like
	// this:
	// public static void main(String[] args){}
	//
	// When the java interpreter executes and application (by being invoke upon the application's
	// controlling class), it starts by calling the class's main method. The main
	// method then calls all the other methods required to run your application.
	//
	// Her Java uygulaması, imzası aşağıda belirtilene benzeyen bir ana yöntem (main method) içermelidir.
	// public static void main(String[] args){}
	// Java yorumlayıcısı çalıştırıldığında ve uygulama (uygulamanın kontrol sınıfına çağrılarak),
	// sınıfın ana yöntemini çağırarak başlar. Ana yöntem, uygulamanızı çalıştırmak için gereken diğer tüm yöntemlerdir.

	public static void main(String[] args)/* Main Method */ {   // Opening Braces
																// Kod blogu açılır
		System.out.println("Maraba Zalım Dünya!") /* Displays a message on the screen */ ; // Semicolon
												  /* Ekranda bir mesaj gösterir.      */   // Noktalı vürgül.
	} // Closing Braces
	  // Kod bloğu kapatılır.

}
