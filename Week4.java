package Week04;

public class Week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Coding Step 1:
		
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};	//Create an int array with the given variables
		
		ages[ages.length - 1] = ages[ages.length - 1] - ages[0];		//Subtract first element from the last element, without specifically calling the last element
		
		int[] ages2 = new int[] {21, 18, 57, 71, 42, 13, 25, 34, 28};	//Create an int array with 9 elements
		
		ages2[ages2.length - 1] = ages2[ages2.length - 1] - ages2[0];	//As above, this is subtracting the first element from the last element without directly calling the last element
		
		int sum1 = 0;											//Initializing a variable to use in the for loop to hold the sum of the ages
		int avg1;												//Declaring a variable that will hold the average age of the array
		for (int i = 0; i < ages.length; i++) {					//for loop cycles through the ages array and adds all the elements to the variable sum
			sum1 += ages[i];
		}
		avg1 = sum1 / (ages.length -1);							//Final calculation for the average of the ages array
		
		System.out.println(avg1);								//Prints the variable avg to the console

		//Coding Step 2:
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};	//Initializing a string of names called names
		
		int sum2 = 0;											
		int avg2;
		for (String name : names) {								//for loop will cycle through the array names and add the length
			sum2 += name.length();								//of each name to the variable sum2
		}
		
		avg2 = sum2 / names.length;								//Finishing the calculation for the average length of the names 
		
		System.out.println(avg2);								//Printing the average name length (avg2) to the console
		
		//Coding Step 3
		
		System.out.println(ages2[ages2.length - 1]);			//This is how you access the last element in an array if you don't know its size
		System.out.println(ages2[8]);							//This is how you access the last element in an array if you do know its size
		
		//Coding Step 4
		
		System.out.println(names[0]);							//Accessing the first element in an array which will always have an index of 0
		
		//Coding Step 5
		
		int[] nameLengths = new int[names.length];				//Creating a new array called nameLengths with the same number of elements as names
		
		for (int i = 0; i < names.length; i++) {				//for loop to add the length of each element in the array names to the new array, nameLengths
			nameLengths[i] = names[i].length();
		}
		
		//Coding Step 6
		
		int sum3 = 0;
		for (int i = 0; i < nameLengths.length; i++) {			//for loop to sum all the elements of the array nameLengths together
			sum3 += nameLengths[i];
		}
		
		System.out.println(sum3);								//Printing the result (sum3) to the console
		
		//Coding Step 7
		
		String word = "Java";									//This and the next line are initializing variables to be used in the method
		int n = 5;												
		System.out.println(newString(word, n));					//Print line which calls the method and tells it to use the two variables
																//that were just initialized
		
		//Coding Step 8
		String firstName = "Simone";							//This and the next line are initializing input variables for the method
		String lastName = "Biles";
		System.out.println(fullName(firstName, lastName));		//Print statement to call the method and use the initialized input variables
		
		//Coding Step 9
		
		int[] numbers = new int[] {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};	//Initializing an array of int
		
		System.out.println(sumOfArray(numbers));				//Print statement to call the method using the array, numbers
		
		//Coding Step 10
		
		double[] numbers2 = new double[] {5.25, 10.38, 3.74, 24.98, 18.36};	//Initializing an array of double
		
		System.out.println(average(numbers2));					//Print statement to call the method using the array, numbers2
		
		//Coding Step 11
		double[] arrayOne = new double[] {13.87, 19.89, 6.16};	//Initializing two arrays of double that the method will compare
		double[] arrayTwo = new double[] {12.13, 11.22, 7.10};	//to each other
		
		System.out.println(averages(arrayOne, arrayTwo));		//Print statement to call the method with the two arrays as input
		
		//Coding Step 12
		boolean isHotOutside = false;							//Initializing two variables that the method needs
		double moneyInPocket = 13.87;							//in order to return true or false
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));	//Print statement to call the method with the two input variables
		
		//Coding Step 13
		double[] fastFood = new double[] {24.87, 9.50, 10.53, 25.68, 22.55};	//Initializing an array of double integers containing fast food expenses
		
		System.out.println(stopFastFood(fastFood));				//Print statement to print the return statement of the method
		
		
			
		
	}
	//Method for Coding Step 7
	public static String newString (String word, int n) {		//Initializing a method for Coding Step 7
		String result = "";
		for (int i = 0; i < n; i++) {							//for loop that will concatenate the string, word, to itself n number of times
			result += word;
		}
		return result;											//Return statement for the method
	}
	
	//Method for Coding Step 8
	public static String fullName (String firstName, String lastName) {		//Initializing a method for Coding Step 8
		String name = firstName + " " + lastName;							//Concatenating firstName and lastName with a space in between
		return name;														//Return statement
	}
	
	//Method for Coding Step 9
	public static boolean sumOfArray (int[] numbers) {			//Initializing a method for Coding Step 9
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {				//for loop to add all the elements in the array together
			sum += numbers[i];
		}
		if (sum > 100) {										//if statement to determine if the sum of the array elements
			return true;										//is greater or less than 100 - since the method was declared as boolean,
		} else {												//two return statements are required (one for true and one for false)
			return false;
		}
	}
	
	//Method for Coding Step 10
	public static double average (double[] numbers) {			//Initializing a method for Coding Step 10
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {				//for loop adds all the elements of the array together
			sum += numbers[i];
		}
		double avg = sum / numbers.length;						//Completing the calculation for the average of the array
		return avg;												//Return statement
	}
	
	//Method for Coding Step 11
	public static boolean averages(double[] x, double[] y) {	//Initializing a method for Coding Step 11
		double sum1 = 0;										//Initializing and creating several variables
		double sum2 = 0;										//which I'll need to perform the function of
		double avg1;											//the method over the next few lines
		double avg2;
		
		for (int i = 0; i < x.length; i++) {
			sum1 += x[i];
		}
		avg1 = sum1 / x.length;									//Two for loops here will sum all the elements of each
																//array and then the average of those elements is calculated
		for (int i = 0; i < y.length; i++) {					//for each array
			sum2 += y[i];
		}
		avg2 = sum2 / y.length;
		
		if (avg1 > avg2) {										//After the average is calculated, they are compared with this
			return true;										//if statement which returns true or false depending on the outcome
		} else {
			return false;
		}
	}
	
	//Method for Coding Step 12
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {	//Initializing the method for Coding Step 12
		if (isHotOutside == true && moneyInPocket > 10.50) {							//if statement to evaluate if variables meet conditions 
			return true;																//Return statements (since method is boolean, two returns
		} else {																		//are required (a true and a false)
			return false;
		}
	}
	
	//Method for Coding Step 13
	public static String stopFastFood (double[] fastFood) {		//Initializing the method for Coding Step 13
		int sum = 0;											//Initializing a sum variable to use in the for loop
		for (int i = 0; i < fastFood.length; i++) {				//This for loop will add all the elements in my double array together
			sum += fastFood[i];
		}
		if (sum > 100) {										//The if statement evaluates whether the sum of the array elements is
			return "Yes!";										//more than 100 and if so returns "Yes!" and if not returns "No, but
		} else {												//do you really need to eat out?" 
			return "No, but do you really need to eat out?";
		}
	}
	
}
