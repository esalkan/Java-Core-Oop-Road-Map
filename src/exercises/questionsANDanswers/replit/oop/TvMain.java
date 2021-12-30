package exercises.questionsANDanswers.replit.oop;

import java.util.Scanner;

/**
 * @project Java Core & OOP Notes
 * @author esalkan
 * @github https://github.com/esalkan/java-notes
 */
public class TvMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Write a custom class TV that has 4 instance variables:
		 * 
		 * int channel=1, int volumeLevel=0, boolean on = false, String brand =
		 * "undefined". Create one no arguments constructor that prints message:
		 * "Creating TV object using no args-constructor".
		 * 
		 * Also, create one more constructor that defines instance variable brand, and
		 * displays message:"Creating TV object using 1 arg - constructor".
		 * 
		 * Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel),
		 * channel (getChannel/setChannel) and brand (getBrand/setBrand) instance
		 * variables. Declare methods channelUp() to increase variable channel by one,
		 * and channelDown() to decrease variable channel by one. Declare methods
		 * volumeUp() to increase variable volume by one, and volumeDown() to decrease
		 * variable volume by one. Create isOn(), turnOn() and turnOff() methods for on
		 * instance variable. If tv is already on, no need to turn it on again, display
		 * message: "TV is already ON". If tv is already off, then no need to turn it
		 * off again, display message: "TV is already OFF". Value of a variable channel
		 * cannot be negative or zero, and cannot be higher than 120. If user will try
		 * to set invalid channel, display message: "ERROR: TV is either OFF or invalid
		 * Channel". Volume can only be in the range between 0 and 7. You may change
		 * volume only if TV is on. Otherwise, display message: "ERROR: TV is either OFF
		 * or invalid Volume level". Use isOn() method that will check tv status.
		 */
		
	    Scanner in = new Scanner(System.in);
	    TvClass tv = new TvClass();
	    System.out.println(tv.getVolumeLevel());  
	    tv.turnOff();
	    tv.setChannel(in.nextInt());

	    TvClass tv2 = new TvClass(in.next());
	    tv2.turnOn();
	    tv2.turnOn();
	    tv2.setChannel(in.nextInt());
	    tv2.setChannel(in.nextInt());
	    tv2.setVolumeLevel(in.nextInt());
	    tv2.volumeUp();
		

	}

}
