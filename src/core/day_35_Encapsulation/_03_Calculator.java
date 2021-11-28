package core.day_35_Encapsulation;

/**
 * @author esalkan
 *
 */
public class _03_Calculator {

	/**
	 * Write a class with the name Calculator. The class needs two fields (Instance
	 * Variables) with name floor of type Floor and carpet of type Carpet.
	 * 
	 * The class needs to have one constructur with parameters floor of type Floor
	 * and carpet of type Carpet and it needs to initialize the fields.
	 * 
	 * Write the following methods (Instance methods):
	 * 
	 * Method named getTotalCost without any parameters, it needs to return the
	 * calculated total cost to cover the ffloor with carpet. // cost * area
	 */

	// Creating Reference
	public _01_Floor floor; // Composition
	public _02_Carpet carpet;

	// Creating
	public _03_Calculator(_01_Floor floor, _02_Carpet carpet) {

		this.floor = floor;

		this.carpet = carpet;
	}

	// Creating getTotalCost Method. That method will take the values from _01_Floor
	// Class inside getArea() Method and from _02_Carpet Class inside getCost()
	// Method. Line 24 and 25 for access this templates we create referenca class
	// access
	public double getTotalCost() {

		return carpet.getCost() * floor.getArea();

	}
}
