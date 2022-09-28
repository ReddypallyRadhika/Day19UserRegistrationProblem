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
 * As a User need to enter a valid First Name - First name starts with Cap and
 * has minimum 3 characters
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

	public static void main(String[] args) {
		System.out.println("----- Welcome To First Name Validatior -----");
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		boolean isFirstName = isValidUsername(firstName);

		if (isFirstName) {
			System.out.println(firstName + " is an Valid firstName");
		} else {
			System.out.println(firstName + " is an Invalid firstName");
		}
	}
}
