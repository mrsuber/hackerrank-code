import java.util.*;
class UserInputDemo1
{
public static void main(String[] args)
{
  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20];
  int n = 9;
  int counter = 0;

          for(int i = 0; i <= n-2; i++){
              if(ar[i] == 0) continue;
              for(int j = i+1; j <= n-1; j++) {
                  if(ar[i] == ar[j]) {
                      ar[j] = 0;
                      counter++;
                      break;
                  }
              }
          }

}
}
