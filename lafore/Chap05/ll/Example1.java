class Example1 {

  public static void main(String[] args) {
      LinkList theList = new LinkList();  // make new list

      theList.insertFirst(22, 2.99);      // insert four items
      theList.insertFirst(44, 4.99);
      theList.insertFirst(66, 6.99);
      theList.insertFirst(88, 8.99);

      theList.displayList();              // display list
      
      LinkList list2 = new LinkList();
      list2.insertFirst(22, 2.99);      // insert four items
      list2.insertFirst(44, 4.99);
      list2.insertFirst(16, 6.99);
      list2.insertFirst(88, 8.99);

      list2.displayList();

      if (theList == list2) {
        System.out.println("matches");
      }


      while( !theList.isEmpty() )         // until it's empty,
         {
         Link aLink = theList.deleteFirst();   // delete link
         System.out.print("a. Deleted ");         // display it
         aLink.displayLink();
         System.out.println("");
         theList.displayList();

         Link bLink = list2.deleteFirst();   // delete link
         System.out.print("b. Deleted ");         // display it
         bLink.displayLink();
         System.out.println("");

        if (aLink.iData != bLink.iData) {
          System.out.println("does not match " + Integer.toString(aLink.iData) + " " + Integer.toString(bLink.iData) );
        }
        else {
          System.out.println("matches " + Integer.toString(aLink.iData) + " " + Integer.toString(bLink.iData) );
        }
         }
      theList.displayList();              // display list

      while (!theList.isEmpty())
         theList.deleteFirst();

      theList.displayList();
 }

}
