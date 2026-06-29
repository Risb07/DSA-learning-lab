class ISprime{
public static void main(String [] args){
      int n = 9;
      for (int i = 1 ; i <= 100 ; i++ ) {
                  
            for( int j = 2 ; j < n ; j++ ){
                  boolean flag = true;
                  if( n % j != 0 ){
                        flag = false;
                  }
                  if(flag!=false){
                        System.out.println("Number is Prime.");
                  }
            }
      }
}
}