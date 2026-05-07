package Sorting_Algorithms;

import java.util.Arrays;
public class Sorts
{
    static void bubble_sort(int a[])
    {
        int i,j,temp;
        for(i=a.length-1;i>0;i--)//gives n-1 passes
        {
            for(j=0;j<i;j++)//j stops at second last j+1 last
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                }
            }
        }
    }
    static void selection_sort(int a[])
    {
        int i,j,min_element,position;
        for(i=0;i<a.length-1;i++)//gives n-1 passes
        {
            min_element=a[i];
            position=i;
            for(j=i+1;j<a.length;j++)//j goes to end
            {
                if(a[j]<min_element)
                {
                    min_element=a[j];
                    position=j;
                }
            }//j
            //SWAP I TH WITH MIN
            a[position]=a[i];
            a[i]=min_element;
        }
    }
    static void insertion_sort(int a[])
    {
        int i,j,new_element;
        for(i=0;i<a.length-1;i++)//gives n-1 passes
        {
            new_element=a[i+1];
            j=i+1;
            while(j>0 && a[j-1]>new_element)
            {
                a[j]=a[j-1];
                j--;
            }
            a[j]=new_element;
        }
    }
    static void quick_sort(int a[],int start,int end)
    {
        int i,j,pivot;
        i=start;
        j=end;
        pivot=start;
        while(i<j)
        {
            while(a[j]>a[pivot])
                j--;
            if(i<j)//swap
            {
                int temp=a[pivot];a[pivot]=a[j];a[j]=temp;}
        }
	if(i<end)
    quick_sort(a,start+1,end);
}
    static void quick_sort2(int a[],int start,int end)
    {
        int i,j,pivot;
        i=start;
        j=end;
        pivot=end;//1
        while(i<j)
        {
            while(a[i]<a[pivot])
                i++;
            if(i<j)//swap
            {
                int temp=a[pivot];a[pivot]=a[i];a[i]=temp;}
        }
        if(j>start)
            quick_sort(a,start,end-1);
    }


    public static void main(String[] args) {
        int a[]={33,11,99,88,55,66,77,22,44};
        System.out.println("Initially Array is:"+Arrays.toString(a));
        //call
        //quick_sort(a,0, a.length-1);
        quick_sort2(a,0, a.length-1);

        System.out.println("After Sort Array is:"+Arrays.toString(a));
    }
}
