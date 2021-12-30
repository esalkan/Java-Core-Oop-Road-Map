package exercises.questionsANDanswers.replit.oop;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 *//**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Db {
	
	private String data;
	private int yint;

	public Db(String data, int yint) {
		this.data = data;
		this.yint = yint;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getYint() {
		return yint;
	}

	public void setYint(int yint) {
		this.yint = yint;
	}

	
}
