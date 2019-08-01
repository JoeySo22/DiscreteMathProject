//The public class Naive uses the Naive Algorithm to find the common
//divisors between two numbers.
public class Naive{
    	public static void main(String[] args){
		//Method call with the designated x and y values.
		//a)
		lookForCD(3456, 4563);
		//b)
		lookForCD(625, 288);
		//c)
		lookForCD(216, 288);
		//d)
		lookForCD(147, 27);
	}
	public static int[] lookForCD(int x, int y){
		/*1. test whether each number from 1 to the least of {x,y} divides x and y
		 *2. let m be the minimum (least of) {x,y}. For n = 1,2,3,...,m.
		 *-- First case --> test if n divides x.
		 * if so... test if n divides y.
		 * if it divides both... record n as a common divisor.
		 * NEEDS TO OUTPUT THE COMMON DIVISORS TESTING ONE BY ONE SO...
		 */
		int m = 0;

		//get the greatest number and set it to m :)
		if(x > y)
			m = x;
		else
			m = x;

		//declare int array to store the common divisors.
		int[] commonDivisors = new int[m];
		int position = 0;//declare an integer to keep track of the position in the array.

		//loop from 1 to m.
		System.out.print("The COMMON DIVISORS of the numbers "+x+" and "+y+" are: ");
		for(int n = 1; n <= m; n++){//declare n to 1. :)
			//check divisibility.
			if (x % n == 0){ //if x is divisible by n...
				if(y % n == 0){//checking if y is divisible by n...
					//if so, we have a new common divisor!
					System.out.print(n + " ");
					commonDivisors[position] = n;//store the common divisors in the array.
					position++;//increment the position.
				}
				//continue checking...
			}
			//continue checking with the other n's...
		}
		System.out.println();
		return commonDivisors;
	}
}
