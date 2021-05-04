import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
	private int[] testScores;

      // Write your method here

      public Student(String firstName, String lastName, int id, int[] testScores){
    super(firstName,lastName,id);
    this.testScores=testScores;
    this.firstName=firstName;
    this.lastName=lastName;
    this.idNumber=id;
}

    public char calculate(){
        int sum= 0;
        int a = 0;
        for(int i=0;i<testScores.length;i++){
            a=a+testScores[i];
        }
        a=a/testScores.length;
        if(90<=a&&a<=100){
            return 'O';
        }else if(80<=a&&a<90){
            return 'E';
        }else if(70<=a&&a<80){
            return 'A';
        }else if(55<=a&&a<70){
            return 'P';
        }else if(40<=a&&a<55){
            return 'D';
        }else if(0<=a&&a<40){
            return 'T';
        }
        else
        return Character.MIN_VALUE;
    }

}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}






















// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
//
// public class jv5_hackerrank_30day_chanlage_12 {
//
//     public static void main(String[] args) {
//       Scanner scan = new Scanner(System.in);
//       		String firstName = scan.next();
//       		String lastName = scan.next();
//       		int id = scan.nextInt();
//       		int numScores = scan.nextInt();
//           int answer =0;
//           int answer1 =0;
//       		int[] testScores = new int[numScores];
//       		for(int i = 0; i < numScores; i++){
//       			testScores[i] = scan.nextInt();
//       		}
//
//           System.out.println("Name: "+firstName +","+lastName);
//           System.out.println("ID: " +","+id);
//           for(int j =0; j<testScores.length;j++){
//             answer = testScores[j] + answer;
//           }
//           answer1=answer/testScores.length;
//
//           if(Math.max(90, answer1) == Math.min(answer1, 100)){
//             System.out.print("O");
//             }
//           if(Math.max(80, answer1) == Math.min(answer1, 89)){
//             System.out.print("E");
//             }
//           if(Math.max(70, answer1) == Math.min(answer1, 79)){
//             System.out.print("A");
//             }
//           if(Math.max(55, answer1) == Math.min(answer1, 69)){
//             System.out.print("P");
//             }
//           if(Math.max(40, answer1) == Math.min(answer1, 54)){
//             System.out.print("D");
//             }
//           if(answer1<40){
//             System.out.print("T");
//             }
//       		scan.close();
//
//     }
// }
