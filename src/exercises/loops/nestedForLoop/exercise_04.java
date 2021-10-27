package exercises.loops.nestedForLoop;

/**
 * @author esalkan
 */
public class exercise_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Complex Lines
		/*
		 * What nested for loops produce the following output?
		 * 
		 * inner loop : inner loop (repeated characters on each line)
		 * 
		 * outer loop : outer loop (loops 5 times because there are 5 lines)
		 * 
		 * 
		 * We must build multiple complex lines of output using:
		 * 	- an outer "vertical" loop for each of the lines
		 * 	- inner "horizontal" loop(s) for the patterns within each line.
		 * 
		 * * First write the outer loop, from 1 to the number of lines
		 * 
		 * 		for(int line = 1; line <= 5; line++){
		 * 			...
		 * 		}
		 * 
		 * * Now look at the line contents each line has a pattern :
		 * 	- Some dots (0 dots on the last line), then a numver
		 * 
		 * 	....1
		 *  ...2
		 *  ..3
		 *  .4
		 *  5
		 *  
		 *  
		 *  - Observation : the number of dots is related to the line number.
		 *  
		 *  	for(int count = 1; count <= 5; count++) {
		 *  		System.out.print(...);
		 *  	}
		 *  
		 *  - What statement in the body would cause the loop to print : 
		 *  	4	7	10	13	16
		 *  
		 *  	for(int count = 1; count <= 5; count++) {
		 *  		System.out.print(3 * count + 1 + " ");
		 *  	}
		 *  
		 *  * What statement in the body would cause the loop to print :
		 *  	2	7	12	17	22
		 *  
		 *  * To see patterns, make a table of count and the numbers. 
		 *  	- Each time count goes up by 1, the number should go up by 5.
		 *  	- But count * 5 is too great by 3, so we substract 3.
		 *  
		 *  	count		|	number to print		|	5 * count	|	5 * count - 3
		 *  		1		|		2				|		5		|		2
		 *  		2		|		7				|		10		|		7
		 *  		3		|		12				|		15		|		12
		 *  		4		|		17				|		20		|		17
		 *  		5		|		22				|		25		|		22
		 *  
		 *  * What Statement in the body would cause the loop to print:
		 *  	17	13	9	5	1
		 *  
		 *  * Let's create the loop table together.
		 *  	- Each time count goes up 1, the number printed should ...
		 *  	- But this multiple is off by a margin of ...
		 *  
		 *  |	  count		|	number to print		|	-4 * count	|	-4 * count + 21	|
		 *  |		1		|			17			|		-4		|		17			|
		 *  |		2		|			13			|		-8		|		13			|
		 *  |		3		|			9			|		-12		|		9			|
		 *  |		4		|			5			|		-16		|		5			|
		 *  |		5		|			1			|		-20		|		1			|
		 *  
		 *  
		 *  * Make a table to represent any patterns on each line.
		 *  
		 *  			|	line	|	# of dots	|	-1 * line	|	-1 * line + 5	|
		 *  ....1		|	1		|		4		|		-1		|		4			|
		 *  ...2		|	2		|		3		|		-2		|		3			|
		 *  ..3			|	3		|		2		|		-3		|		2			|
		 *  .4			|	4		|		1		|		-4		|		1			|
		 *  5			|	5		|		0		|		-5		|		0			|
		 *  
		 *  
		 *  
		 *  * To print a character multiple times, use a for loop
		 *  
		 *  		for(int j = 1; j <= 4; j++){
		 *  			System.out.println(".");	// 4 dots
		 *  		}
		 */
		
		// ANSER
		
		for (int line = 1; line <= 5; line++) {
			for (int j = 1; j <= (-1 * line + 5); j++) {
				System.out.print(".");	
			}
			System.out.println(line);
		}
	}

}
