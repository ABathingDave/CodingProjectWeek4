package java4CodingProject;

import java.util.Arrays;

public class CodingProjectWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //This is my array of type integer and length 8. #1
		System.out.println(ages[ages.length - 1] - ages[0]); //Here I made a print statement to print out the result of my equation that programmatically subtracts the value of the first element in the array from the value in the last element of the array without using ages[7]. #1a
		int[] ages2 = {2, 45, 8, 87, 67, 34, 95, 89, 90}; //#1b This is my ages2 array of type integer and length 9.
		System.out.println(ages2[ages2.length - 1] - ages2[0]); //#1bii Here is another print statement, printing out the same equation as earlier but for our ages2 array.
		
		int sum = 0; //Here we are declaring a variable sum to use later.
		int count = ages.length; //Here we are declaring a variable count fore use in our print statement.
		for (int i = 0; i < count;i++) { //Here is our for loop that will iterate over our ages array and return the average age. #1c
			int result = sum += ages[i];
			System.out.println(result/count);
			}
		//#2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //Here is our array of type string and length 6. #2
		int total = 0; //Here we are declaring a variable total for use later.
		for (int i = 0; i < names.length; i++) { //Here is our for loop which calculates the sum of the letters before calculating the average in the print statement below. #2a
			 total += names[i].length();
		}
		System.out.println(total / names.length);
		
		
		String result = " "; //Here we are declaring a variable for use later.
		for (int i = 0; i < names.length; i++) { //#2b Here is our for loop to iterate over the names array a second time and concatenate all the names together separated by spaces.
			result = result.concat(names[i]);
			if (i < names.length - 1) {
				result = result.concat(" ");
						
			}
			System.out.println(result);
		}
		//#3 How do you access the last element of any array?
		//	arrayName[arrayName.length - 1] Here is how to access the last element of any array.
		//#4 How do you access the first element of any array?
		//	arrayName[0] Here is how to access the first element of any array.
		//#5
		int[] nameLengths = new int[names.length]; //#5 Here is our array of integer called nameLengths with a length set to the length of the names array.
		for (int i = 0; i < names.length; i++) { //#5 Here is our for loop which iterates over the names array and adds the length of each name to the nameLengths array.
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		//#6
		int sum2 = 0; //Here we are declaring a variable for use in our for loop.
		for (int i = 0; i < nameLengths.length; i++) { //Here is our for loop which calculates the sum of all the elements in the nameLengths array.
			int result2 = sum2 += nameLengths[i];
			System.out.println(result2);
		}
		//#7
		String tripleHi = multiplyString("Hi", 3); //#7 Here we are invoking the method and printing the result below.
		System.out.println(tripleHi);
		//#8
		System.out.println(createFullName("David", "Ramirez-Segura")); //Invoking the method.
		//#9
		
		//#10
		
		//#11
		
		//#12
		System.out.println(willBuyDrink(true, 11)); //#12 Invoking the method.
		//#13
		
		
		
		
		
	}
	//#7
	public static String multiplyString(String word, int n) { //#7 Here is our method called mulitplyString which returns the word concatenated to itself n number of times.
		String result = " ";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	//#8
	public static String createFullName(String firstName, String lastName) { //#8 Here is our method called createFullName which returns a full name.
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	//#9 This code was attempted.
	public static boolean isSumGreater(int[] x) { //Here is our method which returns true if the sum of all the ints in the array is greater than 100
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			int result = sum += x[i];
			if (result > 100) {
				return true;
			}
			}
				return false;
		}
		
		
	}
	//#10 This code was atempted.
	public static double calculateAverage(double[] y) { //Here is our method which returns the average of all the elements in the array.
		double sum = 0;
		for (int i = 0; i < y.length; i++) {
			sum = sum + y[i];
		}
		double result = sum / y.length;
		return result;
	}
	//#11 This code was attempted.
	public static boolean compareArrays(double[] x, double[] y) { //Here is our method which checks if the average of the elements in the first array is greater than the average of the elements in the second array.
		double sum = 0;
		double sum2 = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		double result = sum / x.length;
		for (int i = 0; i < y.length; i++) {
			sum2 = sum2 + y[i];
		}
		double result2 = sum2 / y.length;
		if (result > result2) {
			return true;
		} else {
			return false;
		}
	}
	//#12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //Here is our method called willBuyDrink which returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	//#13 This code was attempted.
	public static void helloWorld(int num1) { //Here is our method called helloWorld which returns messages based on the value in num1. I created this method to send messages based on the different values input.
		if (num1 % 4 == 0 && num1 % 6 == 0) {
			System.out.println("Hello World!");
		} else if(num1 % 4 == 0) {
			System.out.println("Hi!");
		} else {
			System.out.println("Goodbye!");
		}
}
