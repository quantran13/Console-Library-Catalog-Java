/**
 * @class Patron.java
 *
 * @author Quan Tran
 *
 * The Patron class.
 */

package personal.quantran.consoleLibraryCatalog;


public class Patron {

	private final String mPatronName;
	private final String mPatronID;

	/**
	 * Method: Patron()
	 * -------------------------------------------------------------------------
	 * Default constructor. Takes no parameters and sets the ID to D99999999,
	 * which is reserved for special use.
	 */
	public Patron() {
		mPatronName = "D99999999";
		mPatronID = "";
	}

	/**
	 * Method: Patron(name, ID)
	 * -------------------------------------------------------------------------
	 * Constructor that takes 2 parameters: the patron's name and ID.
	 *
	 * @param name
	 * @param ID
	 */
	public Patron(String name, String ID) {
		mPatronName = name;
		mPatronID = ID;
	}

	/**
	 * Method: getPatronName()
	 * -------------------------------------------------------------------------
	 * @return the patron's name.
	 */
	public String getPatronName() {
		return mPatronName;
	}

	/**
	 * Method: getPatronID()
	 * -------------------------------------------------------------------------
	 * @return the patron's ID.
	 */
	public String getPatronID() {
		return mPatronID;
	}

}
