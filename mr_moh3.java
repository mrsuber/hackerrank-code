import java.io.*;
import java.util.*;
// Add any extra import statements you may need here


class mr_moh3 {

  // Add any helper functions you may need here


  int minLengthSubstring(String s, String t) {
    // Write your code here
    //You are given two strings s and t. You can select any substring of string s and rearrange the
    // characters of the selected substring. Determine the minimum length of the substring of s such that string t is a substring of the selected substring.
    int minLength = -1;
    int pos;

    HashMap<Character, Integer> thash = new HashMap();

    for (int i = 0; i < t.length(); i++) {

      if (!thash.containsKey(t.charAt(i))) {
        thash.put(t.charAt(i), 1);
      } else {
        thash.put(t.charAt(i), thash.get(t.charAt(i)) + 1);
      }
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (thash.containsKey(c)) {
        HashMap<Character, Integer> thash_cp = new HashMap(thash);

        String sub_s = new String();

        for (int j = i; j < s.length(); j++){

          sub_s += String.valueOf(s.charAt(j));

          if (thash_cp.containsKey(s.charAt(j))) {
            thash_cp.put(s.charAt(j), thash_cp.get(s.charAt(j)) - 1);

            if (thash_cp.get(s.charAt(j)) == 0) thash_cp.remove(s.charAt(j));
          }

          if (thash_cp.isEmpty()) break;
        }

         if (thash_cp.isEmpty()){
          if (minLength == - 1 && sub_s.length() > minLength) minLength = sub_s.length();
          else if (minLength > 0 && sub_s.length() < minLength) minLength = sub_s.length();
        }
      }
    }

    return minLength;
  }




  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom, but they are otherwise not editable!
  int test_case_number = 1;
  void check(int expected, int output) {
    boolean result = (expected == output);
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printInteger(expected);
      System.out.print(" Your output: ");
      printInteger(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printInteger(int n) {
    System.out.print("[" + n + "]");
  }
  public void run() throws IOException {
    String s_1 = "dcbefebce";
    String t_1 = "fd";
    int expected_1 = 5;
    int output_1 = minLengthSubstring(s_1, t_1);
    check(expected_1, output_1);

    String s_2 = "bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf";
    String t_2 = "cbccfafebccdccebdd";
    int expected_2 = -1;
    int output_2 = minLengthSubstring(s_2, t_2);
    check(expected_2, output_2);

    // Add your own test cases here
    String s_3 = "dcbefebcfd";
    String t_3 = "fd";
    int expected_3 = 2;
    int output_3 = minLengthSubstring(s_3, t_3);
    check(expected_3, output_3);

  }
  public static void main(String[] args) throws IOException {
    new mr_moh3().run();
  }
}
