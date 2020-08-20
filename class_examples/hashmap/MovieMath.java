import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class MovieMath {

  public static void main(String[] args){
    // Read input
    File file = new File("matrix.csv");
    Scanner sc = null;
    HashMap<String, Integer> hh = new HashMap<>();
    ArrayList<HashMap> a = new ArrayList<>();

    try {
      sc = new Scanner(file);
      // Check if there is another line of input
      while(sc.hasNextLine()){
        String str = sc.nextLine();
        HashMap<String, String> x = parseLine(str);
    
        // Check if hashmap contains actor name
        if (!hh.containsKey(x.get("actor"))){
          hh.put(x.get("actor"), 1); // base case, value = 1
        } else {
          String actor = x.get("actor");
          int i = Integer.valueOf(hh.get(actor)) + 1;
          hh.put(x.get("actor"), i);
        }
        a.add(x);
        System.out.println("-> " + str);
        System.out.println("   " + hh.entrySet());
      }
   
    } catch (IOException  exp) {
      // TODO Auto-generated catch block
      exp.printStackTrace();
    }
    
    // Call function
    // Write output

    sc.close();
  }

  private static HashMap<String, String> parseLine(String str){
    String actor, year, movie, gRev;
    HashMap<String, String> h = new HashMap<>();
    Scanner sc = new Scanner(str);
    sc.useDelimiter(","); 
    
    // Check if there is another line of input
    while(sc.hasNext()){
      // read each word
      h.put("actor", (String) sc.next());
      h.put("year", sc.next());
      h.put("movie", sc.next());
      h.put("gross revenue", sc.next());
    } 
    sc.close();

    System.out.println();
    return h;
  }

  private static int count(int i){
    if (i == 0) { 
      return 1;
    } 
    return i++;
  }

}


