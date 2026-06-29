package DSA_PGCPAC.Algorithm;

public class Binary_Search{
      static int binary_search(int a[],int start,int end,int key)
      {
            if(start<=end)
                  {
                        int mid=(start+end)/2;
                        if(a[mid]==key)
                              return mid;//found
                        else
                              {
                                    if(key<a[mid])
                                          return binary_search(a,start,mid-1,key);
                                    else
                                          return binary_search(a,mid+1,end,key);
                              }
                  }
            else
                  return -1;
      }

        
      
      public static void main(String[] args){
            int[] a = {10,20,30,40,50}; //array must be sorted for Binary search 
            int key = 40;
            int r = binary_search(a, 0, a.length-1, key);
            if(r == -1){
                   System.out.println("key Not found");
            }else{
                  System.out.println("key found "+r);
            }
      }
}