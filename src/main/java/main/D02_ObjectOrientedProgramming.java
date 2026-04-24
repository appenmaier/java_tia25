package main;

import java.time.LocalDate;

import model.Flight;
import model.FlightConnection;
import model.StringArray;
import utility.StringArrayHelper;

/**
 * Object Oriented Programming
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_ObjectOrientedProgramming {

   public static void main(String[] args) {
      /* Attribute */
      FlightConnection connection1 = new FlightConnection();
      connection1.airline = "LH";
      connection1.connectionId = "0400";
      connection1.departureAirport = "FRA";
      connection1.arrivalAirport = "JFK";

      Flight flight1 = new Flight();
      flight1.flightConnection = connection1;
      flight1.flightDate = LocalDate.of(2026, 4, 25);
      flight1.flightPriceInEuro = 489.12;

      Flight flight2 = new Flight();
      flight2.flightConnection = connection1;
      flight2.flightDate = LocalDate.of(2026, 5, 18);
      flight2.flightPriceInEuro = 788.88;

      System.out.println(connection1);
      System.out.println(flight1);
      System.out.println(flight2);

      /* Methoden */
      String[] names = new String[2];

      names = StringArrayHelper.add(names, "Hans");
      names = StringArrayHelper.add(names, "Peter");
      names = StringArrayHelper.add(names, "Lisa");
      StringArrayHelper.print(names);

      StringArray names2 = new StringArray();
      names2.array = names;
      names2.add("Heidi");
      names2.add("Max");
      names2.print();
   }

}
