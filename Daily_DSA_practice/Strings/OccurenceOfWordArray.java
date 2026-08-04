package Daily_DSA_practice.Strings;

import java.util.Scanner;

/**
 * 
 * Occurence Of Words
 * 
 * Que 1 :
 * 
 */

public class OccurenceOfWordArray {

      public static void find_words(String sentance, String[] str) {

            String lower_Sen = sentance.toLowerCase();

            for (String w : str) {

                  String lower_word = w.toLowerCase();
                  int index = 0;
                  int count = 0;
                  while ((index = lower_Sen.indexOf(lower_word, index)) != -1) {
                        count++;
                        index = index + lower_word.length();
                  }
                  System.out.println(w + " occured " + count + " times.");
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sen = sc.nextLine();
            int n = sc.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < n; i++)
                  str[i] = sc.next();

            find_words(sen, str);
      }
}
