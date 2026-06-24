import java.util.HashMap;

public class Longest_Common_Prefix{
    public String longestCommonPrefix(String[] strs) {
      if(strs.length == 0){
            return "";
      }
      String prefix = strs[0];
      for(int i = 0 ; i<strs.length ; i++){
            if( strs[i].length() > 0 || prefix.length() > 0){
            while(!strs[i].startsWith(prefix)){
                  prefix = prefix.substring(0, prefix.length()-1);
            }}

      }
      return prefix;
    }
    public static void main(String[] args) {
      Longest_Common_Prefix l = new Longest_Common_Prefix();
      System.out.println(l.longestCommonPrefix(new String[]{"abab","aba",""}));
    }

}