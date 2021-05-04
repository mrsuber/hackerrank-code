import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean ana = false;
        int count=0;

        a = a.toLowerCase();
        b = b.toLowerCase();
        //sorting strings
        // char[] chars = a.toCharArray();

        char temp = 0;
        char temp2 = 0;
        char[] chars = a.toCharArray();
        for(int i=0; i < chars.length; i++) {
           for(int j = 0; j < chars.length; j++) {
                if(chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
            }
         }
      }
        String sorted = new String(chars);


        char[] chars2 = b.toCharArray();
        for(int i=0; i < chars2.length; i++) {
           for(int j = 0; j < chars2.length; j++) {
                if(chars2[j] > chars2[i]) {
                    temp2 = chars2[i];
                    chars2[i] = chars2[j];
                    chars2[j] = temp2;
            }
         }
      }
        String sorted2 = new String(chars2);

        String[] sa = sorted.split("(?!^)", sorted.length());
        String[] sb = sorted2.split("(?!^)", sorted2.length());

        if(sa.length != sb.length){return ana;}

        for(int i=0; i<sa.length;i++){
            for(int j=0; j<sb.length;j++){
                if(sa[i].equalsIgnoreCase(sb[i])){
                    count++;
                    sb[i]="#";
                    // System.out.println(sb[i]);
                    // System.out.println(sa[j]);
                    break;
                }
                else continue;

            }
        }
        // System.out.println(count);
        if(count==sa.length){
            return true;
        }
        else return ana;
        // HashMap<String, Integer> element1 = new HashMap<String, Integer>();
        // HashMap<String, Integer> element2 = new HashMap<String, Integer>();

        // for(int i=0; i<sa.length; i++){
        //     if(element1.get(sa[i])==null){
        //        element1.put(sa[i],1);
        //     }
        //     else element1.put(sa[i],element.get(sa[i])+1);
        // }

        // for(int i=0; i<sb.length; i++){
        //     if(element2.get(sb[i])==null){
        //        element2.put(sb[i],1);
        //     }
        //     else element1.put(sb[i],element.get(sb[i])+1);
        // }
        // for(int i=0;i<sa.length;i++){
        //     if(sa.length == sb.length){
        //         if(element1.get(sa[i])==element2.get(sa[i])){
        //         count++;
        //         }
        //         else return ana;
        //     }
        //     else return ana;

        // }
        // if (count == sa.length){
        //     ana=true;
        //     return ana;
        // }
        // else return ana;

    }

  public static void main(String[] args) {
