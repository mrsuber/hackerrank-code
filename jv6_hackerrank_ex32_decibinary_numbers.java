import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv6_hackerrank_ex32_decibinary_numbers {

    public static void main(String[] args) {
      //declearing scannar to take in input
        Scanner sc = new Scanner(System.in);
        //initialising a max int to 600000
        int max = 600000;
        //initialising a size int to 20
        int size = 20;


        //-------------------------------------------------------------------------------------------------------------
        //initialising a counter array of type int and seting array length to max=600000
        int[] counter = new int[max];
        //initialising a fresh array of type long and setting array lenth to max=600000
        long[] fresh = new long[max];
        //initialising a sum array  of type long and setting array length to max = 600000
        long[] sum = new long[max];
        //initialising a finder array of type long and setting its array length to max = 600000
        long[] finder = new long[max];
        //-----------------------------------------------------------------------------------------------------------

        //initialising a 2d array of type int and seting array row length to max=600000 array colon length to size=20
        int[][] prev = new int[max][size];
        //initialising a 2d array of type long and setting array row length to max=600000 and array colon length to size =20
        long[][] high = new long[max][size];
        //initialising a 2d array of typ long and setting array row lenght to max=600000 and array colon length to size =20
        long[][] el = new long[max][size];
        //----------------------------------------------------------------------------------------------------------------

        //puting 1 ant index 0 in array sum
        sum[0] = 1;
        //initialising a variable u to 1 of type int
        int u = 1;
        //initialising a variable t to 1 of type long
        long t = 1;
        //---------------------------------------------------------------------------------------------------------------

        //starting first loop of length 20
        for(int i = 0; i < 20; i++) {
          //firstloop initialiseing a variable last of type int to the maximum value between (firstloop)(20xu =20) and max=600000
          //this initialise last in frist loop when i=0 to 600000
            int last = Math.min(20 * u, max);


                //starting second loop of lenth 10
                for(int k = 1; k < 10; k++) {
                  //starting the third loop of lenght last, in this case last=600000 when j=0
                    for(int j = 0; j < last; j++) {
                      //checking the index of sum[] if at position j is ==0. not that all of sum[] is 0 except the index 0
                      //when j=0, this statement = false
                        if(sum[j] == 0) {
                          //if the sum[j] == 0, third loop continue to j=1
                            continue;
                          }
                          //initialising another variable n and setting it to (k x u) + j;
                          // when loop1=1,loop2=1, loop3=1, => i=0,k=1,j=0, n=0;
                          int n = k * u + j;
                          //if n >= max=600000 break loop3.
                          // when loop1=1,loop2=1, loop3=1, => i=0,k=1,j=0, n=1, n<max=600000
                          if(n >= max) {
                            //statement breaking loop3
                            break;
                          }
                          //initialising variable p of type int and stetting its value to the value of array counter and index n
                          // when loop1=1,loop2=1, loop3=1, => i=0,k=1,j=0, n=0, p=0 because counter[n]=0, all index is 0 when new array is made
                          int p = counter[n];
                          //adding element at index n array fresh with element of sum and index j
                          // when loop1=1,loop2=1, loop3=1, => i=0,k=1,j=0, n=0, fresh[n] += 1 because (value of new array at index 0) + 1(sum[0]=1)
                          //
                          fresh[n] += sum[j];
                          //prev 2d array and index row=0,colon =0 = 0, when loop1=1,loop2=1, loop3=1, => i=0,k=1,j=0, n=0,
                          prev[n][p] = j;
                          // setting up high at index n and p to be the value of sum[n] and fresh[n];
                          // when loop1=1,loop2=1, loop3=1, => i=0,k=1,j=0, n=0, high[0][0]=1+1
                          high[n][p] = sum[n] + fresh[n];
                          //setting 2d array el to k and t
                          // when loop1=1,loop2=1, loop3=1, => i=0,k=1,j=0, n=0, t =1, t is type long so you cast k to type long.
                          //el[0][0]=1x1=1
                          el[n][p] = (long)k * t;
                          //setting counter[n] to new value of p+1
                          // when loop1=1,loop2=1, loop3=1, => i=0,k=1,j=0, n=0, ==>counter[0] = 1
                          counter[n] = p + 1;
                          //increament loop3 to j = 1
                }/*loop3*/
            }/*loop2*/
            //starting another loop
            for(int j = 0; j < max; j++) {
                sum[j] += fresh[j];
                fresh[j] = 0;
            }

            u *= 2;
            t *= 10;
        }

        finder[0] = 1;

        for(int i = 1; i < max; i++) {
            finder[i] = finder[i - 1] + sum[i];
        }

        int count = sc.nextInt();
        long[] tab;
        StringBuilder builder = new StringBuilder();

        for(int q = 0; q < count; q++) {
            long p = sc.nextLong();

            if(p == 1) {
                builder.append("0\n");
                continue;
            }

            int x = find(finder, 1, max - 1, p);
            int y = 0;
            int k = 0;

            long s = sum[x];
            long res = 0;
            p -= finder[x - 1];

            while(true) {
                tab = high[x];
                k = counter[x];
                y = find(tab, 0, k - 1, p);

                res += el[x][y];
                x = prev[x][y];

                if(x == 0) {
                    builder.append(res);
                    builder.append('\n');
                    break;
                }

                if(y > 0) {
                    p -= tab[y - 1];
                }
            }
        }

        System.out.println(builder.toString());
    }

    static int find(long[] tab, int a, int b, long n) {
        if(a == b) {
            return a;
        }

        if(b - a == 1) {
            if(n > tab[a]) {
                return b;
            }

            return a;
        }

        int k = (a + b) / 2;

        if(n > tab[k]) {
            return find(tab, k + 1, b, n);
        }
        else {
            return find(tab, a, k, n);
        }
    }
}
