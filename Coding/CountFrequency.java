import java.util.HashMap;

/**
 * Problem Statement –
 * 
 * You’re given an array of integers, print the number of times each integer has
 * occurred in the array.
 * 
 * 
 * 
 * Example
 * 
 * Input :
 * 
 * 10
 * 
 * 1 2 3 3 4 1 4 5 1 2
 * 
 * Output :
 * 
 * 1 occurs 3 times
 * 
 * 2 occurs 2 times
 * 
 * 3 occurs 2 times
 * 
 * 4 occurs 2 times
 * 
 * 5 occurs 1 times
 */
public class CountFrequency {

      public static void countFreq(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(arr[0], 1);
            for (int i = 1; i < arr.length; i++) {
                  if (map.containsKey(arr[i])) {
                        int val = map.get(arr[i]);
                        map.put(arr[i], ++val);
                  } else {
                        map.put(arr[i], 1);
                  }
            }
            System.out.println(map);
      }

      public static void main(String[] args) {
            countFreq(new int[] { 1, 2, 3, 3, 4, 1, 4, 5, 1, 2 });
      }

}
