/* Create a playlist using an array data structure
 * CISC 3130
 * author: @katychuang
 */

public class PlayList
{
  public static void main(String[] args) {

    // Create an array of Strings
    String[] songs = { "Bodak Yellow", "MotorSport", "I like it", "Money Bag", "Drip"};

    // Create an empty array with size of 3 elements
    String[] playlist = new String[3];

    // using arraycopy() method to clone a subset of one array to another
    System.arraycopy(songs, 1, playlist, 0, 3);

    // show the elements that were copied
    System.out.println(String.join(", ", playlist));
  }
}
