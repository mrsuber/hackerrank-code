import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'reverseShuffleMerge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
static String reverseShuffleMerge(String s) {
//declearing a string word
        String word = "";
        //getting half the length of s, assuming that s will always be even
        int length = s.length()/2;

        SortedMap<Character, Integer> letterMap = new TreeMap<>();
        for(char c : s.toCharArray()){
            Integer cnt = letterMap.get(c);
            if(cnt == null){
                cnt = 0;
            }
            letterMap.put(c, cnt+1);
        }
        int[] lettersForShuffle = new int[26];
        for(Map.Entry<Character, Integer> entry : letterMap.entrySet()){
            lettersForShuffle[entry.getKey()-'a'] = entry.getValue()/2;
        }
        int[] lettersForWord = Arrays.copyOf(lettersForShuffle, lettersForShuffle.length);
        int index = s.length()-1;
        int minIndex = s.length()-1;

        int[] tmpLetters = Arrays.copyOf(lettersForShuffle, lettersForShuffle.length);
        while(index >= 0){
            char ci = s.charAt(index);
            if((minIndex == -1 ||ci < s.charAt(minIndex)) && lettersForWord[ci-'a'] > 0){
                minIndex = index;
                tmpLetters = Arrays.copyOf(lettersForShuffle, lettersForShuffle.length);
            }
            index--;
            if(lettersForShuffle[ci-'a'] == 0){
                char minChar = s.charAt(minIndex);
                word += minChar;
                lettersForWord[minChar-'a']--;
                if(word.length() == length){
                    return word;
                }
                s = s.substring(0, minIndex);
                lettersForShuffle = Arrays.copyOf(tmpLetters, tmpLetters.length);
                index = s.length() - 1;
                minIndex = - 1;
            } else {
                lettersForShuffle[ci-'a']--;
            }

        }
        return word;
}
}



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.reverseShuffleMerge(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
