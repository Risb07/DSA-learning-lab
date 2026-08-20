
/*
QUESTION 2: HIGHEST-RATED MOVIE

Problem Description

You are given a list of movies and their customer ratings. Each movie entry is provided as a string in the following format:
    Movie Name # Rating
Find the movie with the highest rating.
If two or more movies have the same highest rating, select the movie that comes first in dictionary/alphabetical order. The comparison must be case-insensitive.
Print the selected movie name in title case, followed by its rating.
Input Format
-   The first line contains an integer N, representing the number of movies.
-   The next N lines contain:
    -   The movie name
    -   A # separator
    -   An integer rating

Spaces before or after # may be present.
Output Format
Print the selected movie in the following format:
    MovieName Rating
The movie name must be printed in title case.
Constraints
    1 ≤ N ≤ 100
    1 ≤ Rating ≤ 10
    1 ≤ Length of movie name ≤ 100
Movie names may contain spaces and uppercase or lowercase letters.
Selection Rules
1.  Select the movie having the highest rating.
2.  If multiple movies have the same highest rating, select the movie that comes first alphabetically.
3.  Compare movie names without considering uppercase and lowercase.
4.  Print the result in title case.
------------------------------------------------------------------------
Test Case 1
Input
    5
    URI #5
    Super hero #5
    Krish #5
    BADLA # 5
    Veer #5
Output
    Badla 5
Explanation
All movies have the maximum rating of 5. In dictionary order, BADLA comes before Krish, Super hero, URI and Veer. Therefore, Badla 5 is printed.
------------------------------------------------------------------------

Test Case 2
Input
    4
    Avatar #8
    Titanic #9
    Inception #10
    Gladiator #7

Output
    Inception 10

Explanation

Inception has the highest rating of 10, so it is selected directly.

------------------------------------------------------------------------

Test Case 3

Input

    5
    Wish #9
    Badla #9
    Krish #7
    Avatar #8
    Veer #6

Output

    Badla 9

Explanation

Wish and Badla both have the maximum rating of 9. Since Badla comes before Wish alphabetically, Badla is selected.

------------------------------------------------------------------------

Test Case 4

Input

    4
    THE DARK KNIGHT #10
    Avengers #9
    interstellar #10
    Titanic #8

Output

    Interstellar 10

Explanation

THE DARK KNIGHT and interstellar both have rating 10. Ignoring letter case, interstellar comes first alphabetically, so Interstellar 10 is printed.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HighestRatedMovies {

      //Not efficient and may break on rating 10 
      public static String movie1(List<String> list){ // [Wish #9, Badla #9, Krish #7, Avatar #8, Veer #6]

            int max = 0 ;
            Map<String,Integer> map = new HashMap<>();
            for (int i = 0; i < list.size() ; i++) {
                  String s = list.get(i);
                  // System.out.println(s);
                  String[] chrr = s.split("#");
                  // System.out.println(Arrays.toString(chrr)  ); // [movie , 9]
                  String movie = chrr[0].trim(); // movie
                  // System.out.println(movie);
                  char[] rarr = chrr[1].toCharArray() ; //['9']
                  int rating = rarr[0] - '0'; // 9 : int
                  // System.out.println(rating);
                  map.put(movie, rating); // [ movie : 9 ]
                  max = Math.max(max, rating); // 9 
            }

            String sum = "";
            // String[] newArr = new String[list.size()];
            List<String> list2 = new ArrayList<>();
            // int l = 0;
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                  if (entry.getValue().equals(max)) {
                         sum = entry.getKey() +" "+ entry.getValue(); // Badla 9 
                         list2.add(sum);
                  }     
            }
            Collections.sort(list2);
            return list2.get(0);
      }


      //Best Single Pass code 

      public static String movie2(List<String> list) {

            String bestMovie = "";
            int maxRating = Integer.MIN_VALUE;

            for (String s : list) {

                  String[] arr = s.split("#");

                  String movie = arr[0].trim();
                  int rating = Integer.parseInt(arr[1].trim());

                  if (rating > maxRating) {
                        maxRating = rating;
                        bestMovie = movie;
                  } else if (rating == maxRating &&
                              movie.compareTo(bestMovie) < 0) {
                        bestMovie = movie;
                  }
            }

            return bestMovie + " " + maxRating;
      }
      
      public static void main(String[] args) {
            List<String> movies  = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            movies.add("Avatar #8");
            movies.add("Titanic #9");
            movies.add("Inception #10");
            movies.add("Gladiator #7");

            System.out.println(movie2(movies));
      }
}
