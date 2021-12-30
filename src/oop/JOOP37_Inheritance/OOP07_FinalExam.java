package oop.JOOP37_Inheritance;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class OOP07_FinalExam extends OOP06_GradeActivity {

	private int numQuestions;
	private double pointsEach;
	private int numMissed;

	public OOP07_FinalExam(int numQuestions, int numMissed) {

		double numericScore;

		this.numQuestions = numQuestions;
		this.numMissed = numMissed;

		pointsEach = 100.0 / numQuestions;
		numericScore = 100.0 - (numMissed * pointsEach);

		// My goal is to receive the letter based on my numericScore how i will set my
		// numericScore to score
		setScore(numericScore);
	}

}
