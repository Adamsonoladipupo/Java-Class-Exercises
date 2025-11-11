import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest{
	
	@Test
	public void testThatLibraryHasNoBook(){
		// Arrange

		Library libraryInput =  new Library();

		// Act
		int result = libraryInput.totalNumberOfBooks();

		// Assert
		assertEquals(result, 0);

	}
	@Test
	public void testThatOneBookIsAddedToTheLibraryAndTheTotalNumberOfBooksIsOne(){
		// Arrange
		Library libraryInput = new Library();

		// Act
		String response = libraryInput.addBook("Things Fall Apart");
		// Assert
	}

}