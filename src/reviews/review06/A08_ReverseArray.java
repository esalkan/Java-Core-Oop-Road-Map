package reviews.review06;

import java.util.Arrays;

public class A08_ReverseArray {

	public static void main(String[] args) {
		
		int [] nums = {5, 10 , 4, 100, 150, 23, 76 }; // {100,4,10,5}
// one way is creating a second empty array 		
		int [] reversedNums = new int [nums.length];
				
		for (  int i = nums.length -1,  j=0  ;   i >= 0   ; 	i-- , j++         ) 
		{
			reversedNums[j] = nums [i];
			
		}
		
		System.out.println(Arrays.toString(reversedNums));
		
		
		
//creating a third variable to hold my array variables		
	int x = 5;  // 5
	int y = 10;  // 100 
	int temp;
	// swapping numbers
	temp = x;
	x=y;
	y=temp;
	System.out.println("x : "+ x + " y "+ y ); 
	
	System.out.println("Print before swap: "+ Arrays.toString(nums));
// int [] nums = {5, 10 , 4, 100};  
	for (int i = 0; i < nums.length/2 ; i++) {
		int temp2 = nums[i];
		nums[i] = nums[nums.length-1-i]; // 4 - 1 - 0 = 3 / 4 - 1 -1 = 2
		nums[nums.length-1-i] = temp2;
	}
	System.out.println("Print after swap: "+ Arrays.toString(nums));
		
		
	}
}
