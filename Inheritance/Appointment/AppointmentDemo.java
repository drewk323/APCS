package Appointment;

import java.util.Scanner;

/**
   Demonstration of the appointment classes
*/
public class AppointmentDemo
{
   public static void main(String[] args)
   {
      /** Create several appointments that are daily, monthly, and onetime. */
      Appointment[] appointments = new Appointment[4];
      appointments[0] = new Daily(2000, 8, 13, "Brush your teeth.");
      appointments[1] = new Monthly(2003, 5, 20, "Visit grandma.");
      appointments[2] = new Onetime(2004, 11, 2, "Dentist appointment.");
      appointments[3] = new Onetime(2004, 10, 31, "Trick or Treat.");

      /** Take user input and print out the appointments and things to do for that day, year, or month. */
      System.out.println("Enter a date (year, month, day) to list "
         + "appointments: ");
      Scanner in = new Scanner(System.in);
      int year = in.nextInt();
      int month = in.nextInt();
      int day = in.nextInt();
      for (int i = 0; i < appointments.length; i++) //Loop through appointments
      {
         if (appointments[i].occursOn(year, month, day)) //Get the correct appointments
         {
            System.out.println(appointments[i]);
         }
      }
   }
}

