
//    Restaurant Bill
import java.util.Scanner;
public class RestaurantBill {
   public static void main(String [] args) {
         double mealCharge;         //defining the variables.
         double tax;
         double tip;
         double totalCharge;
         double totalBill;   
         Scanner cost = new Scanner(System.in);    // for inputing the numbers
         System.out.println( "Please enter the charge for the meal: ");
         mealCharge = cost.nextDouble();
         tax = 0.0675 * mealCharge;         //  6.75% = 6.75/100 which equals 0.0675
         totalCharge = mealCharge + tax;
         tip = 0.2 * totalCharge;           // again, 20% = 20/100 which equals 0.20 or 0.
         totalBill = totalCharge+ tip;
         System.out.println( "Charge for the meal: $" + mealCharge);
         System.out.println( "Tax: $" + tax);
         System.out.println( "Tip: $" + tip);
         System.out.println( "Total Charge for the Bill: $" + totalBill);
        }
}
// THE END!