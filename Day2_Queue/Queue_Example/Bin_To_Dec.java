// package Queue_Examples;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Bin_To_Dec
{
    static int to_dec(String bin)
    {
        Queue<Character> queue=new LinkedList<>();
        for(char bit:bin.toCharArray())
        {
            queue.offer(bit);
        }
        System.out.print("\nQueue has:"+queue);
        int sum=0;
        while(!queue.isEmpty())
        {
            char c=queue.poll();
            int digit=c-'0'; //shortcut to char to digit 
            sum= (int) (sum+(digit*Math.pow(2,queue.size())));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary Number:");
        String bin=sc.next();
        int dec=to_dec(bin);
        System.out.println("Number is Decimal:"+dec);
    }
}

