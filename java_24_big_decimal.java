import java.math.BigDecimal;
import java.util.*;
public class java_24_big_decimal
{
    public static void main(String[] args)
    {
        // Create two new BigDecimals
        BigDecimal bd1 =    new BigDecimal("124567890.0987654321");
        BigDecimal bd2 =   new BigDecimal("987654321.123456789");

        // Addition of two BigDecimals
        System.out.println("BigDecimal1 Befor adding bd1 to bd2, bd1: = " + bd1);
        System.out.println("BigDecimal1 Befor adding bd1 to bd2, bd2: = " + bd2);
        bd1 = bd1.add(bd2);
        System.out.println("BigDecimal1 bd1.add(bd2) = " + bd1);

        // Multiplication of two BigDecimals
        bd1 = bd1.multiply(bd2);
        System.out.println("BigDecimal1  bd1.multiply(bd2) = " + bd1);

        // Subtraction of two BigDecimals
        bd1 = bd1.subtract(bd2);
        System.out.println("BigDecimal1 bd1.subtract(bd2) = " + bd1);

        // Division of two BigDecimals
        bd1 = bd1.divide(bd2);
        System.out.println("BigDecimal1 bd1.divide(bd2) = " + bd1);

        // BigDecima1 raised to the power of 2
        bd1 = bd1.pow(2);
        System.out.println("BigDecimal1 bd1.pow(2) = " + bd1);

        // Negate value of BigDecimal1
        bd1 = bd1.negate();
        System.out.println("BigDecimal1 bd1 = bd1.negate() = " + bd1);


        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++) {
            s[i]=sc.next();
        }

        for(int i=0;i<n;i++) {
            BigDecimal max=new BigDecimal(s[i]);
            int idx=i;
            for(int j=i+1;j<n;j++){
                BigDecimal curr=new BigDecimal(s[j]);
                if(curr.compareTo(max)==1){
                    max=curr;
                    idx=j;
                }
            }
            String temp=s[i];
            s[i]=s[idx];
            s[idx]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }





      }


}
