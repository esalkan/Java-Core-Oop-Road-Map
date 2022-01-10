package reviews.review07;

import java.util.ArrayList;

public class R11_ArrayListWithObjects {
public static void main(String[] args) {
	
	Products productOne = new Products();
	productOne.setInfo("sonyVaio", 950.0);
	
	Products productTwo = new Products();
	productTwo.setInfo("iphone12", 1350.0);
	
	Products productThree = new Products();
	productThree.setInfo("monitor", 350.0);
	
	// what are the objects : productOne, productTwo, productThree
	// what is my class name : Products 
	
	// your class name is Integer, you have objects this class
	
	
	ArrayList<Products> list = new ArrayList<>();
	list.add(productOne);
	list.add(productTwo);
	list.add(productThree);
	
	for(Products each: list) {
		System.out.println(each.toString());
	}

	Integer i1 = new Integer(100);
	
	
}
	
	
}
