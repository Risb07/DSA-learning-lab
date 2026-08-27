package DSA_PGCPAC.Day4_LinkedList_Questions;

import java.util.*;

public class Revers_K_Element_of_List
{
    static void rotateFirstK(LinkedList<Integer> list, int k)
    {
        if(k <= 0 || k > list.size())
        {
            System.out.println("Invalid k");
            return;
        }
        Stack<Integer> stack = new Stack<>();
        // Step 1: Push first k elements into stack
        for(int i = 0; i < k; i++)
        {
            stack.push(list.get(i));
        }

        // Step 2: Pop and overwrite first k elements
        for(int i = 0; i < k; i++)
        {
            list.set(i, stack.pop());
        }
    }

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int k = 3;

        System.out.println("Original List: " + list);

        rotateFirstK(list, k);

        System.out.println("After Rotation: " + list);
    }
}
