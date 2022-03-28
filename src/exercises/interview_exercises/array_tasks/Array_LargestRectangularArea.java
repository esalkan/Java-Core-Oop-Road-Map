package exercises.interview_exercises.array_tasks;

public class Array_LargestRectangularArea {

    /*
    Largest Rectangular Area in a Histogram
    Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of
    a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.

    For example, consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 1, 6}.
     The largest possible rectangle possible is 12
     */
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};

        int[][] temp = new int[arr.length][arr.length];
        int max = arr[0];

        for(int w = 1; w <= arr.length; w++){
            for(int l = 0; (l+w) -1 < arr.length; l++){
                int r = l + w - 1; //adjustment
                if(w == 1){ // 10 * 1 ===> 10
                    temp[l][l] = arr[l];
                    max = Math.max(max, temp[l][l]);
                } else {
                    temp[l][r] = Math.min(temp[l][r-1], arr[r]);
                    max = Math.max(max, temp[l][r] * w);
                }
            }
        }

        System.out.println(max);


    }


}
