package core.JC04_arithmethicOperators;
/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class JC11_typeCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Type Casting - Tür Dönüşümü
		// Java'da tür dönüşümü iki türlü yapılır.
		// 1. Otomatik Tür Dönüşümü (Automatic Type Casting)
		// 2. Manuel Tür Dönüşümü (Manual Type Casting)

		// 1. Otomatik Tür Dönüşümü (Automatic Type Casting)
		// Java, küçük türden büyük türe dönüşümü otomatik olarak yapar.
		// Örneğin, int türünden double türüne dönüşüm yapılacaksa, Java bunu otomatik olarak yapar.
		// Bu tür dönüşümüne otomatik tür dönüşümü denir.

		// 2. Manuel Tür Dönüşümü (Manual Type Casting)
		// Java, büyük türden küçük türe dönüşümü otomatik olarak yapmaz.
		// Örneğin, double türünden int türüne dönüşüm yapılacaksa, Java bunu otomatik olarak yapmaz.
		// Bu tür dönüşümüne manuel tür dönüşümü denir.

		// Manuel tür dönüşümü için, dönüştürülecek türün parantez içinde belirtilmesi gerekir.
		// Örneğin, double türünden int türüne dönüşüm yapılacaksa, aşağıdaki gibi yapılır.
		// int i = (int) d;

		byte b;
		int i = 81;
		double d = 323.142;
		float f = 72.38f;
		char c = 'A';

		// int türünden byte türüne otomatik dönüşüm - Automatic Type Casting from int to byte
		c = (char) i;
		System.out.println("i = " + i + " c = " + c);

		// double türünden int türüne manuel dönüşüm - Manual Type Casting from double to int
		i = (int) d;
		System.out.println("d = " + d + " i = " + i);

		// float türünden byte türüne manuel dönüşüm - Manual Type Casting from float to byte
		i = (int) f;
		System.out.println("f = " + f + " i = " + i);

		// byte türünden double türüne manuel dönüşüm - Manual Type Casting from byte to double
		b = (byte) d;
		System.out.println("d = " + d + " b = " + b);
	}

}
