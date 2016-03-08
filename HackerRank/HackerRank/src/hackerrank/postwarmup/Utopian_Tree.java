package hackerrank.postwarmup;

import java.util.Scanner;

/**
 * 
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it
 * doubles in height. Each summer, its height increases by 1 meter.
 * 
 * Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of
 * spring. How tall will her tree be after N growth cycles?
 * 
 * Input Format
 * 
 * The first line contains an integer, T, the number of test cases. T
 * subsequent lines each contain an integer, N, denoting the number of cycles
 * for that test case.
 * 
 * Constraints 1≤T≤10 0≤N≤60
 * 
 * Output Format
 * 
 * For each test case, print the height of the Utopian Tree after NN cycles.
 * Each height must be printed on a new line.
 * 
 * Sample Input
 * 
 * 3 0 1 4 Sample Output
 * 
 * 1 2 7 Explanation
 * 
 * There are 3 test cases.
 * 
 * In the first case (N=0), the initial height (H=1H=1) of the tree remains
 * unchanged.
 * 
 * In the second case (N=1), the tree doubles in height and is 22 meters tall
 * after the spring cycle.
 * 
 * In the third case (N=4), the tree doubles its height in spring (H=2H=2), then
 * grows a meter in summer (H=3), then doubles after the next spring (H=6), and
 * grows another meter after summer (H=7). Thus, at the end of 4 cycles, its
 * height is 77 meters.
 * 
 * 
 *
 */

public class Utopian_Tree {
	
	 public static void main(String[] args) {
	        
		 Utopian_Tree utoTree = new Utopian_Tree();
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            utoTree.displayHeightOfTree(n);
	        }
	    }
	 
	 
	 /**
	  * Takes the 'N' value as the number of growth cycles of the 
	  * tree, computes the growth and displays the same
	  * @param n
	  */
	 public void displayHeightOfTree(int n){
		 int init_height = 1;
		 int height = init_height;
		 
		 if(!(n==0)){
			 for(int i =1;i <= n; i++){
				 
				 if(i%2 == 1){
					 height*=2;
				 }else{
					 height +=1;
				 }
			 }
		 }
		 System.out.println(height);
		 
	 }

}
