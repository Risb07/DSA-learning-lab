
/**
 * Problem Statement –
 * 
 * A function is there which tells how many dealerships there are and the total
 * number of cars in each dealership.
 * 
 * Your job is to calculate how many tyres would be there in each dealership.
 * 
 * Input
 * 
 * 3
 * 
 * 4 2
 * 
 * 4 0
 * 
 * 1 2
 * 
 * Output
 * 
 * 20
 * 
 * 16
 * 
 * 8
 * 
 * There are total 3 dealerships
 * 
 * dealerships1 contains 4 cars and 2 bikes
 * 
 * dealerships2 contains 4 cars and 0 bikes
 * 
 * dealerships3 contains 1 cars and 2 bikes
 * 
 * Total number of tyres in dealerships1 is (4 x 4) + (2 x 2) = 20
 * 
 * Total number of tyres in dealerships2 is (4 x 4) + (0 x 2) = 16
 * 
 * Total number of tyres in dealerships3 is (1 x 4) + (2 x 2) = 8
 * DealerShipAndCar
 */
import java.util.*;

public class DealerShipAndCar {

      public static int calculateTyres(int cars, int bikes) {
            return (cars * 4) + (bikes * 2);
      }

      public static void main(String[] args) {
            int dealerships = 3;
            int[][] carsAndBikes = new int[dealerships][2];

            for (int i = 0; i < dealerships; i++) {
                  System.out.println("Enter number of cars and bikes in dealership " + (i + 1) + ":");
                  Scanner scanner = new Scanner(System.in);
                  carsAndBikes[i][0] = scanner.nextInt();
                  carsAndBikes[i][1] = scanner.nextInt();
            }

            for (int i = 0; i < dealerships; i++) {
                  int cars = carsAndBikes[i][0];
                  int bikes = carsAndBikes[i][1];
                  int totalTyres = calculateTyres(cars, bikes);
                  System.out.println("Total number of tyres in dealerships" + (i + 1) + " is: " + totalTyres);
            }
      }
}
