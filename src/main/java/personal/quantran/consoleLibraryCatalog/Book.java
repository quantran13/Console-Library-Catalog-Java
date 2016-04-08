/**
 * @class Book.java
 *
 * @author Quan Tran
 *
 * The book class.
 */
package personal.quantran.consoleLibraryCatalog;

import personal.quantran.consoleLibraryCatalog.Constants.Status;
import personal.quantran.consoleLibraryCatalog.Constants.Subject;

/**
 *
 * @author quan
 */
public class Book {

	protected String mBookName;
	protected String mISBN;
	protected String mAuthorName;
	protected Subject mSubject;
	protected Status mStatus;

	protected final Patron mPatron;
	protected Subject subject;

	/**
	 * Default constructor.
	 */
	public Book() {
		mBookName = "";
		mISBN = "";
		mAuthorName = "";
		mSubject = Subject.None;
		mStatus = Status.Available;
		mPatron = new Patron();
	}

	/**
	 * Constructor that takes the book name, ISBN, author name and subject as
	 * parameters and sets the member variables accordingly.
	 *
	 * @param bookName
	 * @param ISBN
	 * @param authorName
	 * @param subject
	 */
	public Book(String bookName, String ISBN, String authorName, Subject subject) {
		mBookName = bookName;
		mISBN = ISBN;
		mAuthorName = authorName;
		mSubject = subject;
		mStatus = Status.Available;
		mPatron = new Patron();
	}

	/**
	 * Get the name of the book.
	 *
	 * @return Name of the book.
	 */
	public String getBookName() {
		return mBookName;
	}

	/**
	 * Set the name of the book.
	 *
	 * @param bookName Name of the book.
	 */
	public void setBookName(String bookName) {
		mBookName = bookName;
	}

	/**
	 * Get the ISBN number of the book.
	 *
	 * @return Book ISBN.
	 */
	public String getBookISBN() {
		return mISBN;
	}

	/**
	 * Set the ISBN number of the book.
	 *
	 * @param bookISBN ISBN number of the book.
	 */
	public void setBookISBN(String bookISBN) {
		mISBN = bookISBN;
	}

	/**
	 * Get the author of the book.
	 *
	 * @return author of the book.
	 */
	public String getAuthorName() {
		return mAuthorName;
	}

	/**
	 * Set the name of the author of the book.
	 *
	 * @param authorName The name of the author.
	 */
	public void setAuthorName(String authorName) {
		mAuthorName = authorName;
	}

	/**
	 * Get the book's subject.
	 *
	 * @return the book's subject.
	 */
	public Subject getSubject() {
		return mSubject;
	}

	/**
	 * Set the book's subject.
	 *
	 * @param subject The book's subject.
	 */
	public void setSubject(Subject subject) {
		mSubject = subject;
	}

	/**
	 * Get the book's status.
	 *
	 * @return The book's status.
	 */
	public Status getStatus() {
		return mStatus;
	}

	/**
	 * Set the book's status.
	 *
	 * @param status The book's status.
	 */
	public void setStatus(Status status) {
		mStatus = status;
	}
}
