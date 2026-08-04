package Daily_DSA_practice.Strings;

import java.util.Scanner;

/***
 * indexOf(word, index);
 * 
 * OccurenceOfWord
 * 
 * Accept a sentance from user, accept a word , find the occurences of word
 * inside that sentance.
 */

public class OccurenceOfWord {

      public static void find(String sen, String word) {

            int index = 0;
            int count = 0;
            while ((index = sen.indexOf(word, index)) != -1) { // first assiging in index and then comparing with -1
                  count++;
                  index = index + word.length(); /* shifting index to end of word */
            }
            System.out.println(word + " occured -> " + count);

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sen = sc.nextLine();
            String word = sc.next();
            
            find(sen, word);
            sc.close();
      }
}
