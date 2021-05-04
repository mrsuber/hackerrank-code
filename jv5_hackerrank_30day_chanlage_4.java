import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Write a Person class, iam supose to rename my public class Person
public class jv5_hackerrank_30day_chanlage_4 {
  private int age;//instance variable age
  // constructor: set instance variables to init parameters
     public jv5_hackerrank_30day_chanlage_4(int initialAge)
     {
        if (initialAge >0){
          age = initialAge; }
        else{
          age = 0;
          System.out.print("Age is not valid, setting age to 0..");
            }

         }
         // create a method
           // public int yearPasses(int age) {
             public void yearPasses() {
              age = age + 1;
             // return value
             // return age;
           }
           // create a method
           // public String amIOld(int age) {
             public void amIOld() {
               if (age<13){
                 System.out.print("You are young.. ");
                 // String s = "You are young.. ";
                 // return  s;

               }
               if(Math.max(13, age) == Math.min(age, 17)){
                 System.out.print("You are a teenager.. ");
                 // String s = "You are a teenager.. ";
                 // return  s;
               }
               if (age>=18){
                 System.out.print("You are old..");
                 // String s = "You are old..";
                 // return  s;
               }
               // return "Option not found";
             }

    // public static void main(String[] args) {
    //       // create an object of Main
    //       int age = -1;
    //     jv5_hackerrank_30day_chanlage_4 obj = new jv5_hackerrank_30day_chanlage_4(age);
    //     // calling method
    //     int result = obj.yearPasses(age);
    //     String result2 = obj.amIOld(age);
    //     // System.out.println( result);
    //     System.out.println( result2);

    // }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			jv5_hackerrank_30day_chanlage_4 p = new jv5_hackerrank_30day_chanlage_4(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			// p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

//
// public class Fraction
// {
//    //  instance variables
//    private int numerator;
//    private int denominator;
//
//    // constructor: set instance variables to default values
//    public Fraction()
//    {
//       numerator = 1;
//       denominator = 1;
//    }
//
//    // constructor: set instance variables to init parameters
//    public Fraction(int initNumerator, int initDenominator)
//    {
//       numerator = initNumerator;
//       denominator = initDenominator;
//    }
//
//    // Print fraction
//    public void print()
//    {
//      System.out.println(numerator + "/" + denominator);
//    }
//
//    // main method for testing
//    public static void main(String[] args)
//    {
//       Fraction f1 = new Fraction();
//       Fraction f2 = new Fraction(1,2);
//       // What will these print out?
//       f1.print();
//       f2.print();
//    }
// }







//
// class Main {
//
//   // create a method
//   public int addNumbers(int a, int b) {
//     int sum = a + b;
//     // return value
//     return sum;
//   }
//
//   public static void main(String[] args) {
//
//     int num1 = 25;
//     int num2 = 15;
//
//     // create an object of Main
//     Main obj = new Main();
//     // calling method
//     int result = obj.addNumbers(num1, num2);
//     System.out.println("Sum is: " + result);
//   }
// }







//////////////////////////////////////////hackerrank code

// import java.io.*;
// import java.util.*;
//
// public class Person {
//     private int age;
//
// 	public Person(int initialAge) {
//   		// Add some more code to run some checks on initialAge
// 	}
//
// 	public void amIOld() {
//   		// Write code determining if this person's age is old and print the correct statement:
//         System.out.println(/*Insert correct print statement here*/);
// 	}
//
// 	public void yearPasses() {
//   		// Increment this person's age.
// 	}
//
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int T = sc.nextInt();
// 		for (int i = 0; i < T; i++) {
// 			int age = sc.nextInt();
// 			Person p = new Person(age);
// 			p.amIOld();
// 			for (int j = 0; j < 3; j++) {
// 				p.yearPasses();
// 			}
// 			p.amIOld();
// 			System.out.println();
//         }
// 		sc.close();
//     }
// }
