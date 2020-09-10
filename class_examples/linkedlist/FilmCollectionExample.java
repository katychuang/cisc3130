/* Example of a linked list application
   This represents a film collection. It is a bunch of "Film" nodes
   This is an incomplete example
*/

class Film {
	public String filmName;
	public int releaseYear;
	public Film next;
}

class FilmCollection {
	private Film first;

	public void FilmCollection(){
		first = null;
	}

	public boolean isEmpty(){
		return (first == null);
	}

	public boolean insertFirst(String filmName, int releaseYear){
	  /* blank for now */
	}
}

public class FilmCollectionExample {

	public void main(String[] args){
		FilmCollection watchList = new FilmCollection();
		watchList.insertFirst("The Matrix", 1999);
		watchList.insertFirst("The Matrix Reloaded", 2003);
		watchList.insertFirst("The Matrix Revolutions", 2003);
		watchList.insertFirst("Iron Man", 2008);
		watchList.displayList();
	}
}

