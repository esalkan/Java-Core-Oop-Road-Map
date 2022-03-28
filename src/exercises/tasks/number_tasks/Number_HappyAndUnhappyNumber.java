package exercises.tasks.number_tasks;

public class Number_HappyAndUnhappyNumber {

    /*
    1. write a function that can identify if a number is a happy Number or unhappy number
     */


    public static void solution(int n){

        while(n != 1 && n != 4){
            int r = 0, sum = 0;

            while(n > 0){
                r = n%10;
                sum = sum + (r*r);
                n = n/10;
            }

            n = sum;
        }

        if(n==1){
            System.out.println("Happy number");
        }else{
            System.out.println("Unhappy number");
        }
    }

}
