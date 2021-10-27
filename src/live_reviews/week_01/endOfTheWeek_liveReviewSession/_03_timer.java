/**
 * 
 */
package live_reviews.week_01.endOfTheWeek_liveReviewSession;

import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class _03_timer {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes=scan.nextInt();
        scan.close();
        
        for (int i=minutes; i > 0 ;--i) {
            if( i< 0 ) {
                break;
            }
            for (int z=59; z >=0 ; --z) {
                System.out.print("\r"+ (i-1)+" minutes and "+z+" seconds left");
                Thread.sleep(1000);  // pauses the execution of the code for given mill seconds
            }
        }

        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
	}

}
