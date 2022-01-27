package core.JC02_printingComments;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC02_printVSprintln {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// println() is writing everything in a line and end of it put \n (new line end of it)
		// println() her şeyi tek satıra yazdırır ve en sonunda \n ekleyerek bir alt satıra geçilmesini sağlar
		System.out.println("this is written with println() method");
		// print() is writing everything in a line
		// print() her şeyi tek satıra yazdırır ve o satırda kalınmasını sağlar.
		System.out.print("this is written with print() method");
		
		// is giving us an empty new line like one <br> as in html :)
		// println() içerisine bir veri göndermez isek, bir alt satıra geç mantığından <br> html'de olduğu gibi
		// bir satır boşluk oluşturur bir nevi ENTER tuşu işlemi görür.
		System.out.println();
		
		// if you switch place of the above codes you will see everything is written in one line
		// yukarıdaki kodların yerini değiştirirseniz her şeyin tek satırda yazıldığını göreceksiniz.
		System.out.print("this is written with print() method");
		System.out.println("this is written with println() method");

	}

}
