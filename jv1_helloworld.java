import java.util.*;
class UserInputDemo1
{
public static void main(String[] args)
{
// Scanner sc= new Scanner(System.in); //System.in is a standard input stream
// System.out.print("Enter a string: ");
// String str= sc.nextLine();              //reads string
System.out.println("Hello, World!");
//System.out.print("You have entered: "+str);
// System.out.print(str);

// int cumulus = 0;
// int thunderheads = 1;
// int counter = 0;
// int c[]=new int[100];
int[] c = {0,0,1,0,0,1,0};
// int n = c.length;
// c[0]=0;//initialization
// c[1]=1;
// c[2]=0;
// c[3]=0;
// c[4]=1;
// c[4]=0;



// int jumps = 0;
// int n = c.length;
// for (int i=0; i<(n-1);i++){
//   if ((i+2)<n && c[i+2]==0){
//     i++;
//     jumps++;}
//   }

int jumps = 0;
int position = 0;
while(position<(c.length - 1)){
  if((position+2)<(c.length) && c[position+2] == 0)
    position +=2;
  else position ++;
  jumps++;
}



System.out.print(jumps);

}
}
