/* Example of songs in a playlist
   This is a collection of song nodes in a linked list
   This is not a complete example.
*/

class Song {
	public String songTitle;
	public int streamsCount;
	public Song next;
}

class Playlist {
	private Song first;
	public void Playlist(){
		first = null;
	}

	public boolean isEmpty(){
		return (first == null);
	}

	public boolean insertFirst(String songTitle, int streamsCount){
		/* blank for now */
	}
}

public class PlaylistApplication {
	public static void main(String[] args){
		Playlist playlist = new Playlist();
		playlist.insertFirst("WAP", 5992721);
		playlist.insertFirst("Mood", 5342940);	
		playlist.insertFirst("Hawái", 508238);	
		playlist.insertFirst("Dynamite",4081950);
		playlist.insertFirst();	
	}
}
