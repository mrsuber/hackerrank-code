class Calculation{
  int z;

  public void addition(int x, int y){
    z = x + y;
    System.out.println("Sum of the given numbers are: "+z);
  }

  public void subtraction(int x, int y){
    z = x + y;
    System.out.println("Diffrence of the given numbers are: "+z);
  }

}


public class My_Calculation extends Calculation{
  public void multiplication(int x,int y){
    z = x*y;
    System.out.println("Product of the given numbers are: "+z);

  }


   public static void main(String[] args) {
    int a= 20,b=10;
    My_Calculation demo = new My_Calculation();
    demo.addition(a, b);
    demo.subtraction(a, b);
    demo.multiplication(a, b);
  }
}
