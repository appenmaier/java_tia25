package main;

import java.util.Scanner;

public class D01_JavaBasics {

   public static void main(String[] args) {
      /* Datentypen und Datenobjekte */
      int length = "Hello World".length();
      System.out.println(length);

      Scanner scanner = new Scanner(System.in);

      System.out.print("Gib bitte Deinen Namen ein: ");
      String name = scanner.next();

      int age = 0;
      boolean loop;
      do {
         System.out.print("Gib bitte Dein Alter ein: ");
         age = scanner.nextInt();
         if (age > 0 && age < 150) {
            loop = false;
         } else {
            System.out.println("ungültiger Wertebereich");
            loop = true;
         }
      } while (loop);

      System.out.print("Gib bitte Deine Größe in Meter ein: ");
      double sizeInM = scanner.nextDouble();

      System.out.print("Gib bitte Dein Geschlecht ein (m, w, d): ");
      char gender = scanner.next().charAt(0);

      System.out.print("Gib bitte ein, ob Du glücklich bist (true, false): ");
      boolean isHappy = scanner.nextBoolean();

      /* Verzweigungen */
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

      /* Fallunterscheidungen */
      String genderText;
      genderText = switch (gender) {
         case 'm', 'M' -> "männlich";
         case 'w', 'W' -> "weiblich";
         case 'd', 'D' -> "divers";
         default       -> gender + "";
      };
      System.out.println(genderText);

      /* Schleifen */
      int x = 1;
      while (x <= 10) {
         System.out.println(x);
         x++;
      }
      System.out.println();

      int z = 1;
      do {
         System.out.println(z);
         z++;
      } while (z <= 10);
      System.out.println();

      for (int i = 1; i <= 10; i++) {
         System.out.println(i);
      }

      /* Vergleich von Zeichenketten */
      String text = "Hello";
      System.out.print("Gib bitte die Zeichenkette \"Hello\" ein: ");
      String input = scanner.next();

      if (text.equals(input)) {
         System.out.println("Gut gemacht!");
      } else {
         System.out.println("Nö, das war wohl nix");
         System.out.println(text);
         System.out.println(input);
      }
   }

}
