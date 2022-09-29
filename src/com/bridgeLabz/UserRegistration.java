/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hp
 *
 */
/*UC2
 *As a User need to enter a valid Last Name
 * - Last name starts with Cap and has minimum 3 characters
 */
public class UserRegistration {

	/**
	 * @param args
	 */

	// Function to validate the username
	public static boolean isValidUsername(String firstName) {

		// Regex to check valid username.
		String nameRegex = "^[A-Z]\\w{2,29}$";

		// Compile the ReGex
		Pattern patternObject = Pattern.compile(nameRegex);

		// If the username is empty
		// return false
		if (firstName == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given username
		// and regular expression.
		Matcher matcherObject = patternObject.matcher(firstName);

		// Return if the username
		// matched the ReGex
		return matcherObject.matches();
	}

	public static boolean isValidUsername2(String lastName) {

		String nameRegex = "[A-Z]+([ '-][a-zA-Z]+)*";
		Pattern patternObject = Pattern.compile(nameRegex);
		if (lastName == null) {
			return false;
		}
		Matcher matcherObject = patternObject.matcher(lastName);
		return matcherObject.matches();
	}
	

	public static void main(String[] args) {
		System.out.println("----- Welcome To User Name Validatior -----");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Firstname:");
		String firstName = input.nextLine();
		boolean isFirstName = isValidUsername(firstName);

		if (isFirstName) {
			System.out.println(firstName + " is an Valid firstName");
		} else {
			System.out.println(firstName + " is an Invalid firstName");
		}
		System.out.println("Enter Lastname:");
		String lastName = input.nextLine();
		boolean isLastName = isValidUsername(lastName);

		if (isLastName) {
			System.out.println(lastName + " is an Valid lastName");
		} else {
			System.out.println(lastName + " is an Invalid lastName");
		}
	}
}
