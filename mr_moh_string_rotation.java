import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class mr_moh_string_rotation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//the number to rotate starts for 0 to 9
        int shift = 1;
        int number=(sc.nextInt())+shift;
        int temp;

        int temp2;
        //this rotatates the number from 0 to 9
        if(number<0 || number >9){
          temp = number%10;
          // System.out.println("the rotated number around 0 to 9 is "+temp);
          // temp2= (number+shift)%10;

          System.out.println("the rotated number with respet to shift "+shift+" so number:"+temp);

        }
        else{
          System.out.println("the number is "+ number);
        }

        //this shifts the rotatid number


          sc.close();
    }
  }
