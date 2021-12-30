package exercises.questionsANDanswers.replit.oop;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class Calc {

	String names;
	private int x, y, result;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public void plus() {
		this.result = x + y;
	}
	public void minus() {
		this.result = x-y;
	}
	

}
