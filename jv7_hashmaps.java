import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class jv7_hashmaps {

    public static void main(String[] args) {
      // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    // int i = 1;
    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    for (String i : capitalCities.keySet()) {
        if (i == "USA"){
          System.out.println(i);}
        else System.out.println("not found");
        // System.out.println(i);
        }
    // System.out.println(String.valueOf(i));




    // Integer i = new Integer(123);
    //
    // System.out.println("Before conversion: " + i.getClass().getName());
    //
    // System.out.println("After conversion: " + String.valueOf(i).getClass().getName());






    }
}
