package reviews.review08;



public class Credentials {
	
	private String userName = "Spartan300";
	private String passWord = "hectorTheTroyan";
	
	// I have a default constructor
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
// implement password logic: more than 8 characters, at least one Uppercase, lowercase and special
	public void setPassWord(String passWord) {
	boolean passwordSize;
	boolean uppercase = false;
	boolean lowercase = false;
	boolean special = false;
	
	passwordSize = (passWord.length()>8)? true : false;
	
	for(char eachLetter : passWord.toCharArray() ) {
		if (Character.isUpperCase(eachLetter)) {
			uppercase = true;
		}
		if(Character.isLowerCase(eachLetter)) {
			lowercase = true;
		}
		if(!Character.isLetterOrDigit(eachLetter)) {
			special = true;
		}
	}
	
	if(passwordSize&&uppercase&&lowercase&&special) {
		this.passWord = passWord;
	}else {
		this.passWord = null;
	}
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
