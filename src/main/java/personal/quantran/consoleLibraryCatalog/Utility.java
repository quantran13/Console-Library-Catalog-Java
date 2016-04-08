/**
 * Class: Utility.java
 *
 * @author quan
 *
 */
package personal.quantran.consoleLibraryCatalog;

import java.util.ArrayList;

public class Utility {

	/**
	 * Check if the given patron ID is a valid patron ID.
	 *
	 * @param patronID The patron ID to check.
	 * @return True if the given patron ID is valid, false otherwise.
	 */
	public static final boolean isValidPatronID(String patronID) {
		// The valid patron ID has from Dxxxxxxxx.
		// x is a digit from 0 to 9.
		
		// If the ID's length is not 9 then it's invalid.
		if (patronID.length() != 9) {
			return false;
		}

		// A valid ID always starts with 'D'.
		if (patronID.charAt(0) != 'D') {
			return false;
		}

		// If all the digits are 9 then the ID is a reserved ID, which is 
		// invalid.
		boolean isReservedID = true;
		
		for (int i = 1; i < patronID.length(); i++) {
			char currentChar = patronID.charAt(i);

			// If the current digit is not 9 then the ID is not a reserved ID.
			if (currentChar != '9') {
				isReservedID = false;
			}

			// If not a digit then return false.
			if (currentChar > '9' || currentChar < '0') {
				return false;
			}
		}

		// If all the characters after D are digits and the ID is not reserved
		// then returns true, else false.
		return !isReservedID;
	}

	/**
	 * Check if the given book ISBN is valid.
	 *
	 * @param ISBN The book ISBN.
	 * @return True if the given book ISBN is valid, false otherwise.
	 */
	public static final boolean isValidISBN(String ISBN) {
		// If the ISBN's length is 10 then add a prefix of 978.
		//if (ISBN.length() == 10) {
		//	ISBN = "978" + ISBN;
		//}

		// If the ISBN's length is not 13 then it's invalid.
		if (ISBN.length() != 13) {
			return false;
		}

		// Get the digits and put into an ArrayList.
		ArrayList<Integer> ISBN_digits = new ArrayList<>(13);
		for (int i = 0; i < ISBN.length(); i++) {
			char currentChar = ISBN.charAt(i);

			// If the character is not a digit then return false.
			if (currentChar > '9' || currentChar < '0') {
				return false;
			}

			ISBN_digits.add(Character.getNumericValue(currentChar));
		}

		// Calculate sum of the first 12 digits, each alternatively multiplied
		// by 1 and 3.
		int sumFirstTwelve = 0;
		for (int k = 0; k < 12; k++) {
			sumFirstTwelve += ISBN_digits.get(k) * (k % 2 == 0 ? 1 : 3);
		}

		// Get the remainder of the division of the above result by 10.
		int remain = sumFirstTwelve % 10;

		// The check digit is calculated by subtracting the remainder from 10.
		// If the result is 10 then the check digit is 0.
		int checkDigit = (10 - remain) % 10;
		
		// If the check digit is equal to the last digit in the ISBN then true.
		// Else it's invalid.
		return checkDigit == ISBN_digits.get(12);
	}
}
