//package GroupProject;

import java.util.Scanner;

/**
 * Created by a1054125 on 29/10/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Search {

   public static void searchByType(VehicleRental[] rentalsArray)
   {

      Scanner userInput = new Scanner(System.in);
      String rentalType = "";

      System.out.println("What type of rental type would you like to see? (Enter a number): 1. Car, 2. MPV, 3. HGV.");
      int userChoiceType = userInput.nextInt();

      if (userChoiceType == 1)
      {
         rentalType = "Car";
      }
      else
      {
         if (userChoiceType == 2)
         {
            rentalType = "MPV";
         } else
         {
            rentalType = "HGV";
         }
      }

      System.out.println("These are all the rental orders on our system for your search type");

      for (int i = 0; i < rentalsArray.length; i++)
      {
         System.out.println();
         if (rentalType.equalsIgnoreCase(rentalsArray[i].getRentalType()))
         {
            System.out.println(rentalsArray[i]);
         }

      }
   }

   //method for search for all rentals
   public static void searchAllRentals(VehicleRental[] rentalsList) {

      System.out.println("These are all the rental orders in our system: ");

      for(int i = 0; i < rentalsList.length; i++) {
         System.out.println();
         System.out.println(rentalsList[i]);
      }
      System.out.println();
   }

}//class