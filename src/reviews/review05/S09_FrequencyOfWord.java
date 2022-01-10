package reviews.review05;

public class S09_FrequencyOfWord {

	public static void main(String[] args) {
		String sentence = "I am an experienced tester. As a tester I can automate browsers."
				+ " I can test API and DB test";
		String word = "test";
		
		System.out.println(freqOfWord(sentence, word));
	}
	
	
public static int freqOfWord(String str, String word) {
	int count = 0;
	
	for (int i = 0; i <= str.length()-word.length();i++) {
		String each = str.substring(i, i+word.length());
		if(each.equalsIgnoreCase(word)) {
			count++;
		}
	
	}
	
	return count;
}
}
