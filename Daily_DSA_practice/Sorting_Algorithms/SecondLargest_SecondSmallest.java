package Daily_DSA_practice.Sorting_Algorithms;

import java.util.Arrays;

public class SecondLargest_SecondSmallest {

    public static void secondlargestSmallest(int[] arr) {
        if(arr.length == 0){
            System.out.println("empty array");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > largest) // 1> min, 1 ; 5>4 , 5 ; 6>7 , false , 7,3>4, false; 4 > 4 ; false
            {
                secondLargest = largest; // 2
                largest = i; // 4
            } else if (i > secondLargest && i != largest) // 6>5 7 6!=5 3 > 2 & 3 != 3 4 != 3 4 == 4
            {
                secondLargest = i;// 6
            }
            if (i < smallest) // 0 < 1
            {
                secondSmallest = smallest; // 1
                smallest = i; // 0
            }
            if (i < secondSmallest && i != smallest) // 0 < 1 && 0!=1 //
            {
                secondSmallest = i;
            }
        }
        Arrays.sort(arr);
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("largest " + largest);
        System.out.println("secondLargest " + secondLargest);

        System.out.println("smallest " + smallest);
        System.out.println("secondSmallest " + secondSmallest);
    }

    public static void main(String[] args) {
        secondlargestSmallest(new int[] {1});
    }
}
