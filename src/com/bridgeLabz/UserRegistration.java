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
/*
 * UC3 As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has
 * 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and
 * . positions
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

	public static boolean isValidEmail(String Email) {

		// String emailRegex = "^[A-Z0-9+_.-]+@[A-Z0-9.-]+$";
		/*
		 * It allows numeric values from 0 to 9. Both uppercase and lowercase letters
		 * from a to z are allowed. Allowed are underscore “_”, hyphen “-“, and dot “.”
		 * Dot isn't allowed at the start and end of the local part. Consecutive dots
		 * aren't allowed. For the local part, a maximum of 64 characters are allowed.
		 */
		String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		Pattern patternObject = Pattern.compile(emailRegex);
		if (Email == null) {
			return false;
		}
		Matcher matcherObject = patternObject.matcher(Email);
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
		System.out.println("Enter Email:");
		String Email = input.nextLine();
		boolean isEmail = isValidEmail(Email);

		if (isEmail) {
			System.out.println(Email + " is an Valid Email");
		} else {
			System.out.println(Email + " is an Invalid Email");
		}
	}
}
