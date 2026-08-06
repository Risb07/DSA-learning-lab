package Daily_DSA_practice.VitaPlacementPreparation;

import java.util.Scanner;

/**
 * Q.2) Accept a sentence , accept a word and count occurrence of that word.
 * Input: Wel come to CDAC it offers DAC in All CDAC centre.
 * *Input DAC
 * O/P DAC occurred 3 tim
 */

public class FindOccurences {
      
      public static void find(String s, String word){
            int index = 0 ;
            int count = 0 ;
            String lower_s = s.toLowerCase();
            String lower_word = word.toLowerCase();
            while((index = lower_s.indexOf(lower_word, index))!=-1){

                  count++;
                  index = index + lower_s.length();
            }
            System.out.println(word+" occured "+count+" times.");

      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sen = sc.nextLine();
            String word = sc.next();

            find(sen, word);


      }

}
