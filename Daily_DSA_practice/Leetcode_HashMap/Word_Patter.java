import java.util.HashMap;
import java.util.HashSet;

/**
 * Word_Patter
 */
public class Word_Patter {

      
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        char[] charr = pattern.toCharArray();

        if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character, String > map = new HashMap<>();

        for(int i = 0 ; i < charr.length ; i++){
        
        if (map.containsKey(charr[i])) {
            if (!map.get(charr[i]).equals(arr[i])) {
                return false;
            }
        } else {
            if (map.containsValue(arr[i])) {
                return false;
            }
            map.put(charr[i], arr[i]);
        }
    }

        return true;
    }
    public static void main(String[] args) {
      Word_Patter obj  = new Word_Patter();
      System.out.println(obj.wordPattern("abba", "dog dog dog dog"));
    }

}
