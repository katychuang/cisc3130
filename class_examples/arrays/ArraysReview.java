/* Review of using arrays with Java
 * CISC 3130 Brooklyn College
 * Author: @katychuang
 */


public class ArraysReview
{ // public class name should match file name

  // main method is standard in Java
  public static void main(String[] args)
  {

    // create a BodakYellow object
    BodakYellow by = new BodakYellow();

    // Print out the element at first element
    System.out.println("Cardi has " + by.shoes[0]);

    by.chorus("red bottoms");

    // pass another value to initialize next element
    by.shoes[1] = "red bottoms";

    // Polymorphism example
    // method overloading - when type signatures are different but method name same
    by.chorus(by.shoes[0], by.shoes[1]);

    // Defining an expression in Java
    int result = 1 + 1; // result is now 2
  };
}

// Define another class to instantiate

class BodakYellow {

  // instance members are expressed by assigning names on left to values on right.
  int pairs = 2;
  String name = "Cardi";
  String[] shoes;

  /* default constructor
   * initialize first element of shoes array at index 0
   * with value "red bottoms"
   */
  public BodakYellow()
  {
    // create a string array shoes with size of 2 elements
    shoes = new String[2];
    shoes[0] = "red bottoms";
  }

  /* instance method that prints out a message if it matches condition
  */
  public void chorus(String myPair)
  {
    if (myPair == "red bottoms")
      System.out.println("These is bloody shoes");
  }

  /* instance method that prints out a message if it matches condition
  */
  public void chorus(String thisOne, String thatOne)
  {
    if (thisOne == thatOne)
    {  // begin block 2
        System.out.println("I don’t wanna choose");
    } // end block 2
  }
}

class MoreItems
{
  public void MoreItems()
  {
    // 1. Create an array of Strings with 10 empty elements
    String[] shoes = new String[10];
    shoes[0] = "red bottoms"; // initialize first element
    shoes[1] = "red bottoms"; // initialize second element
    shoes[2] = "ysl"; // and so forth

    System.out.println("Cardi has " + shoes[1]); // access by index

    // 2. Alternatively, you can provide the all the elements at once
    int[] myShoesCost = {
     100, 200, 300,
     400, 500, 600,
     700, 800, 900, 1000
    };
  }

}
