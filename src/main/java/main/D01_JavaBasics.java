package main;

import java.util.Scanner;

public class D01_JavaBasics {

   public static void main(String[] args) {
      int length = "Hello World".length();
      System.out.println(length);

      Scanner scanner = new Scanner(System.in);

      System.out.print("Gib bitte Deinen Namen ein: ");
      String name = scanner.next();

      System.out.print("Gib bitte Dein Alter ein: ");
      int age = scanner.nextInt();

      System.out.print("Gib bitte Deine Größe in Meter ein: ");
      double sizeInM = scanner.nextDouble();

      System.out.print("Gib bitte Dein Geschlecht ein (m, w, d): ");
      char gender = scanner.next().charAt(0);

      System.out.print("Gib bitte ein, ob Du glücklich bist (true, false): ");
      boolean isHappy = scanner.nextBoolean();

      // Vergleichsoperatoren: >, >=, <, <=, ==, !=
      // Logische Operatoren: &&, ||, !
      if ((gender == 'm' || gender == 'M') && age >= 18) {
         System.out.println("Hallo Herr " + name);
      } else if ((gender == 'w' || gender == 'W') && age >= 18) {
         System.out.println("Hallo Frau " + name);
      } else {
         System.out.println("Hallo " + name);
      }

      if (age > 65) {
         System.out.println("Hallo, Du alter Sack");
      } else {
         System.out.println("Wie gehts, Jungspund?");
      }

      System.out.println((age > 65) ? "Hallo Du alter Sack" : "Wie gehts, Jungspund?");

      System.out.println(name);
      System.out.println(age);
      System.out.println(sizeInM);
      System.out.println(gender);
      System.out.println(isHappy);
   }

}
