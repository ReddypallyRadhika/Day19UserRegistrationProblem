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
public class SampleEmailstoTest {

	/**
	 * @param args
	 */
	public static boolean isValidEmail(String email) {

		String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.,]+$"; // Valid Emails
		// String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.,]+$"; //–
		// must contains “@” symbol

		Pattern patternObject = Pattern.compile(emailRegex);
		if (email == null) {
			return false;
		}
		Matcher matcherObject = patternObject.matcher(email);
		return matcherObject.matches();
	}

	public static boolean isInValidEmail(String email) {
		/// In Valid Emails
		// String emailRegex2 = "^w+[+.w-]*@([w-]+.)*w+[w-]*.([a-z]|d+)$"; //tld can not
		// start with dot “.”
		String emailRegex = "^w+[+.w-]*@([w-]+.)*w+[w-]*.([a-z]{2,4}|d+)$"; // “.a” is not a valid tld, last tld must
																			// contains at least two

		Pattern patternObject1 = Pattern.compile(emailRegex);
		if (email == null) {
			return false;
		}
		Matcher matcherObject = patternObject1.matcher(email);
		return matcherObject.matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- Welcome To User Email Validatior -----");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Valid Email:");
		String Email = input.nextLine();
		boolean isEmail = isValidEmail(Email);

		if (isEmail) {
			System.out.println(Email + " is an Valid Email");
		} else {
			System.out.println(Email + " is an Invalid Email");
		}

		System.out.println("Enter InValid Email:");
		String Email1 = input.nextLine();
		boolean isEmail1 = isInValidEmail(Email1);

		if (isEmail1) {
			System.out.println(Email1 + " is an Valid Email");
		} else {
			System.out.println(Email1 + " is an Invalid Email");
		}

	}

}
