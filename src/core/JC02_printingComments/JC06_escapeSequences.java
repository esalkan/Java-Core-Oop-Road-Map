package core.JC02_printingComments;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC06_escapeSequences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** ESCAPE SEQUENCES
		 * \n = New Line -> Advances the cursor to the next line for subsequent
		 * printing.
		 * 
		 * \t = Horizontal Tab -> Causes the cursor to skip over to the next tab stop.
		 * 
		 * \b = Backspace -> Causes the cursor to back up, or move left, one position.
		 * 
		 * \r = Return -> Causes the cursor to go to the beginning of the current line,
		 * not the next line.
		 * 
		 * \\ = Backslash -> Causes a backslash to be printed.
		 * 
		 * \' = Single quote -> Causes a single quotation mark to be printed.
		 * 
		 * \" = Double quote -> Causes a double quotation mark to be printed.
		 *
		 */

		/** KAÇIŞ DİZELERİ
		 * \n = Yeni Satır -> Sonraki yazdırma için imleci bir sonraki satıra ilerletir
		 *
		 * \t = Yatay Sekme -> İmlecin bir sonraki sekme durağına geçmesine neden olur. 1 Tab 4 boşluk içerir.
		 *
		 * \b = Backspace -> İmlecin bir konum geriye gitmesine veya sola hareket etmesine neden olur.
		 *
		 * \r = Return -> İmlecin bir sonraki satıra değil, geçerli satırın başına gitmesine neden olur.
		 *
		 * \\ = Backslash -> Bir ters eğik çizginin yazdırılmasına neden olur.
		 *
		 * \' = Single quote -> Tek bir tırnak işaretinin yazdırılmasına neden olur.
		 *
		 * \" = Double quote -> Çift tırnak işaretinin yazdırılmasına neden olur.
		 *
		 */

		System.out.println("Learn\tJava\n\tthe\nEasy\tWay\n\n");

		System.out.println("\tLearn Java the \"Easy\" Way!\n");

		System.out.println("\\ // -=- \\ //");

		System.out.println("\\\\ \\\\\\ \\\\\\\\");
	}

}
