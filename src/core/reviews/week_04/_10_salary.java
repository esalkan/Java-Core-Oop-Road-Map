package core.reviews.week_04;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class _10_salary {
	// attributes : rate (how much you make an hour) 45 - 75 an hour / 15 dolars
	// weeklyHour (int) , taxRate
	// actions: setInfo() - > initilize your variables
	// salary : rate * weeklyHour * 52
	// totalTax : salary*taxRate
	// salaryAfterTax()

	// instance variables: global, you can use at every method
	double rate;
	int weeklyHour;
	double taxRate;

	public void setInfo(double r, int h, double t) { // r, h, t are local variables
		rate = r;
		weeklyHour = h;
		taxRate = t;
	}

	public double salary() { // instance methods
		return rate * weeklyHour * 52;
	}

	public double totalTax() { // instance methods
		return salary() * taxRate;
	}

	public double salaryAfterTax() { // instance methods
		return salary() - totalTax();
	}
}
