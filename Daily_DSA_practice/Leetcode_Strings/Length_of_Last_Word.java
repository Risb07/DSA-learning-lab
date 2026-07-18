package Daily_DSA_practice.Leetcode_Strings;

class Length_of_Last_Word {

      public int lengthOfLastWord(String s) {
            
            String[] words = s.trim().split(" ");

            return words[words.length - 1].length();

      }

      public static void main(String[] args) {

            Length_of_Last_Word obj = new Length_of_Last_Word();
            System.out.println(obj.lengthOfLastWord("   fly me   to   the moon  "));

      }

}