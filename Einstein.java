/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This program calculates the energy of certain mass
 *
 ****************************************************************************/

import java.util.Scanner;

public class Einstein {



 public static void main(String[] args)
 {
   final double mass;
   final double energy;
   final double speedOfLight = 299792458;

   Scanner read = new Scanner(System.in);
// infinite loop for repeating calculations
   for (;;) {
  System.out.println("Enter the mass of the object in kg");
  mass = read.nextDouble();
  if (mass >= 0) {
      energy = mass * speedOfLight*speedOfLight;
      System.out.println("The energy of the object is: " + energy);
  }

  else {
  // if invalid, tell user
      System.out.println("Invalid mass, please re-enter");
  }
 }
 }

}
