import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.

     */
    //  String regex =
    public static final String regularExpression =  "(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}








// Actually what's going here.
// ^  - > means the first character starting with a-z or A-Z
//
// [a-zA-Z] ->  means any character in b/w a-z or A-Z
//
// Next step
//
// [0-9_|a-zA-Z]  -> means any character in 0-9 _ or a-zA-Z
// Note ---> |
// this is or symbol its mean either 0-9 or a-zA-Z
//
//
// Like
// If(x%2==0 || x%5==0)
//
//
// now {7,29} means my character range limit
//
// why we use here 7,29 not 8,30 ?
//
// Simply first character takes first digit i.e either a-z or A-Z
// means for a-z or A-Z -> 1
//
//  then remainning digit is 7
//  so for this reason we put here 7
//
//  after putting here 7 than also we decerment 30-1 because first character already takes 1place
//  that's why we take word limit 7,29
//
//
 // Hope You UnderStand :)
