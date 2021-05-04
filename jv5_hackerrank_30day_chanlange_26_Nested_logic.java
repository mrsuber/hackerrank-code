import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        //getting the return date. the date you brought the book back
        System.out.println("Please enter return date");
        int fine;
        int d = s.nextInt();
        int m = s.nextInt();
        int y = s.nextInt();
        if(d<1 || d >31){
            System.out.println("wrong day input, please enter date again");
            d = s.nextInt();
            m = s.nextInt();
            y = s.nextInt();
        }
        if(m<1 || m >12){
            System.out.println("wrong month input, please enter date again");
            d = s.nextInt();
            m = s.nextInt();
            y = s.nextInt();
        }
        if(y<1 || y >3000){
            System.out.println("wrong year input, please enter date again");
            d = s.nextInt();
            m = s.nextInt();
            y = s.nextInt();
        }

        //date book was brought back(due date), the date you were sopose to bring the book
        System.out.println("Please enter date you were sopose to bring the book");
        int dd = s.nextInt();
        int mm = s.nextInt();
        int yy = s.nextInt();
        if(dd<1 || dd >31){
            System.out.println("wrong day input, please enter date again");
            dd = s.nextInt();
            mm = s.nextInt();
            yy = s.nextInt();
        }
        if(mm<1 || mm >12){
            System.out.println("wrong month input, please enter date again");
            dd = s.nextInt();
            mm = s.nextInt();
            yy = s.nextInt();
        }
        if(yy<1 || yy >3000){
            System.out.println("wrong year input, please enter date again");
            dd = s.nextInt();
            mm = s.nextInt();
            yy = s.nextInt();
        }
        s.close();


        if(y==yy){
            if(m==mm){
                if(d<=dd){
                    fine = 0;
                    System.out.println("the fine is: "+fine +"Hackos");
                }
                else if(d>dd){
                    fine = 15 * (d-dd);
                    System.out.println("the fine is: "+fine +"Hackos");
                }
            }
            else if(m>mm){
                fine = 500* (m-mm);
                System.out.println("the fine is: "+fine +"Hackos");
            }
        }
        else if (y>yy){
            fine = 10000;
            System.out.println("the fine is: "+fine +"Hackos");
        }

    }
}
