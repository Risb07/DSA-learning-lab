/* 
      loop 1 to 100
      % 15 -> fizzbuzz    
      % 5 -> fizz
      % 3 -> buzz 

 */


class FizzBuzz{
      static void Fizz_Buzz_Number_Game(){

            for(int i = 1 ; i <= 100 ; i++){
                  if(i%15 == 0){
                        System.out.print("FizzBuzz"+ " ");
                  }else if(i%5 == 0){
                        System.out.print("Fizz"+ " ");
                  }else if(i%3 ==0){
                        System.out.print("Buzz"+ " ");
                  }else{
                        System.out.print(i + " ");
                  }
            }
      }

public static void main(String [] args ){
      Fizz_Buzz_Number_Game();
}
}