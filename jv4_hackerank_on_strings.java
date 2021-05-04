import java.util.*;
class ManiputlatingStirngs
{
public static void main(String[] args)
{
// Scanner sc= new Scanner(System.in); //System.in is a standard input stream
// System.out.print("Enter a string: ");
// String str= sc.nextLine();              //reads string
System.out.println("Hello, World!");
//System.out.print("You have entered: "+str);
// System.out.print(str);
String s ="adfdd";
char test1 = 'a';
long n =3;
long counter=0;
long counter2=0;
long total_counter=0;
double number = 0;
long number2 = 0;
long number3 = 0;
long l = s.length();

if (s.length()>=n){
  for (int i = 0; i < n; i ++){
    char r = s.charAt(i);
    if(r == test1){
        counter = counter+1; }
  }
  total_counter = counter;
}
if (s.length()<n){
  number = n/l;
  number2 = (long)number;
  number3 = n % l;
  for (int i = 0; i < l; i ++){
    char r = s.charAt(i);
    if(r == test1){
        counter = counter+1; }
  }
  for (int j =0;j< number3; j ++){
    char t = s.charAt(j);
    if(t == test1){
        counter2 = counter2+1; }
  }
  total_counter = (counter*number2) + counter2;}

System.out.print(total_counter + "\n");

}
}
      // }
      //   while(s.length()<n){s=s+s;}
      //   // for(int i=0;i<=n;i++){
      //   //   if (s.length()<n){s=s+s;}
      //   //   else break;
      //   // }
      //   }
      // if(s.length()>=n){

        // for(int i=0;i<=n-1;i++){
        //   char r = s.charAt(i);
        //   // char test1 = test.charAt(0);
        // // System.out.println("The grade is "+ r + test1);
        // // ;}
        //   if(r == test1){
        //     counter = counter+1; }
        //   else continue;


        // }





       // for(int i=1; i<=n;i++){
       //    individual = s.charAt(i);
       //     str4 =str4.concat(individual);
       // }

      //  while(position<=n){
      //
      // str4.concat(s.charAt(position));
      //    position++;
      //  }
// System.out.print(str4);




//
// First is using “concat” method of String class and second is using arithmetic “+” operator. Both results in the same output
//
//
// public class Sample_String{
//   public static void main(String[] args){
// //String Concatenation
// String str1 = "Rock";
// String str2 = "Star";
// //Method 1 : Using concat
// String str3 = str1.concat(str2);
// System.out.println(str3);
// //Method 2 : Using "+" operator
// String str4 = str1 + str2;
// System.out.println(str4);
// }
// }




// How will you determine the length of given String? I have provided a method called as “length”. Use it against the String you need to find the length.


//
// public class Sample_String{
//   public static void main(String[] args){  //Our sample string for this tutorial
//   String str_Sample = "RockStar";
//   //Length of a String
//   System.out.println("Length of String: " + str_Sample.length());}}


// You answered yourself, buddy, there is an “indexOf” method that will help you determine the location of a specific character that you specify.

// public class Sample_String{
//   public static void main(String[] args){//Character at position
// String str_Sample = "RockStar";
// System.out.println("Character at position 5: " + str_Sample.charAt(5));
// //Index of a given character
// System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));}}
//




//comparing two strings
//
// class Teststringcomparison2{
//  public static void main(String args[]){
//    String s1="Sachin";
//    String s2="SACHIN";
//
//    System.out.println(s1.equals(s2));//false
//    System.out.println(s1.equalsIgnoreCase(s2));//true
//  }
// }
