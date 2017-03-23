import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nums = new int[3][5];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 1, 100);
		// test each method you create below.
		print(nums);
		System.out.println(sum(nums, 0));

	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	
	public static void fillRandom(int[][] nums, int low, int high) {
		Random random = new Random();
		for(int row = 0; row < nums.length; row++) {
			for(int col = 0; row < nums[0].length; row++) {
				nums[row][col] = random.nextInt(high) + low;
			}
		}
		
	}
	/*
	 * create a method that prints a 2D array
	 */
	public static void print(int[][] nums) {
		
		for(int row = 0; row < nums.length; row++) {
			System.out.print("{\t");
			for(int col = 0; col < nums[0].length; row++) {
				System.out.print(nums[row][col] + "\t");
			}
			System.out.println("}");
		}
		
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sum(int[][] nums, int row) {
		int total = 0;
		for(int i = 0; i < nums[row].length; i++) {
			total += nums[row][i]; 
		}
		return total;
	}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	

	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	

	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	

	
	
	/*
	 * return the min value in a 2D array
	 */
	

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	

	
	
	
}
