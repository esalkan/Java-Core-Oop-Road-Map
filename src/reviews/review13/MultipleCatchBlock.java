package reviews.review13;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		// String word = "java";
		String word = null;
		
		try {
			System.out.println(word.substring(20));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getSimpleName());
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getSimpleName());
		}catch(Throwable t) {
			System.out.println(t.getMessage());
			System.out.println(t.getClass().getSimpleName());
		}
		
		
		

	}

}
