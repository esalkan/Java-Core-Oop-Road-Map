package core.day_05_unaryAssignmentRelationalLogicalOperators;

/**
 * @author esalkan
 *
 */
public class _03_task_19_unaryOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 50;
		// st1 = step1
		// st2 = step2 etc...
		// res = st1 + st2 + st3 + st4
		a = --a + a++ + a-- + a++;

		/*
		 * st1 = pre-decrease; variable "a" value is firstly decrease and it will saving
		 * to the memory as "a" variable value 49. value is = 49
		 * 
		 * st2 = post-increase; in step1 value saved to the memory 49. post-increase
		 * write to the memory value 49 and then go to the next step3 with new value it
		 * will become 50, but now value is 49 value is = 49 again
		 * 
		 * st3 = post-decrease; in step2 value saved to the memory 50. now post-decrease
		 * will happen and it will keep step3 value 50 then decrease the value -1 and
		 * save it to the memory with new value 49. value is = 50
		 * 
		 * st4 = post-increase; from step 3 value came here 49 it is written to the
		 * memory already 49. firstly take the value for process then after that it will
		 * increase and in the memory value will become 50 but to the variable "a" value
		 * will assign 49
		 * 
		 * st1 = 49 st2 = 49 st3 = 50 st4 = 49 result is 197
		 */

		System.out.println(a);
	}

}
