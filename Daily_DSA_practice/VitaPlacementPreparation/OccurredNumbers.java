package Daily_DSA_practice.VitaPlacementPreparation;

import java.util.Scanner;

/**
 * 
 * Q.1) Store 2 string in an array eg. [“Car”, “Truck”,]
 * Write a statement having words Car and Truck. Count occurrence of Car and
 * Truck in given paragraph.
 * Eg. Input
 * I have 2 Car one is Baleno Car and other is Farari Car but Truck is used for
 * transportation.
 * Car occurred 3 time Truck Occurred 1 time
 */

public class OccurredNumbers {

      public static void checkWordOcurrence(String str , String[] strArr){

            
            int index = 0;


            for(int i = 0 ; i < strArr.length ; i++){
                  int count = 0;
                  while( (index= str.indexOf(strArr[i],index))!=-1){
                        count++;
                        index = index + strArr[i].length();
                  }

                  System.out.println(str + " OccurredNumbers "+ count + " times.");
            }
      

      }

      public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int n = sc.nextInt();
            String[] strArr = new String[n];

            for(int i = 0; i < n ; i++){
                  strArr[i] = sc.next();
            }

            checkWordOcurrence(str, strArr);

      }
      
}
