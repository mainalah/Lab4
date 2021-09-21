/*
Lab 4
Name: Anisha Mainali
Date: 9/21/2021
*/
import java.util.Random;

class Main {
  public static void main(String[] args) {
   
    //create a Random object
    Random r = new Random();
    int randomNum = r.nextInt(51) + 1; // gives value betwen 1 and 50
    
    System.out.println("The Random number is: "+ randomNum);
    
   
    int randNum = randomNum ;
     ////count down to 0
      while (randNum>=0)
      {
        System.out.println(randNum);
        randNum--;
      }

      
      if (randomNum <=5)
      {
        System.out.println("Ahoy mateys!");
      } 
      else if (randomNum >25 && randomNum < 45)
      {
        System.out.println("Cannonball!");
      }
      else {
      System.out.println("Blast off!");}
  }
}