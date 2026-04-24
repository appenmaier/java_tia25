package model;

/**
 * String Array
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringArray {

   /* Attribute */
   public String[] array;

   /* Methoden */
   public void add(String value) {
      for (int i = 0; i < array.length; i++) {
         String element = array[i];
         if (element == null) {
            array[i] = value;
            return;
         }
      }

      String[] tmp = new String[array.length * 2];
      for (int i = 0; i < array.length; i++) {
         tmp[i] = array[i];
      }
      tmp[array.length] = value;
      array = tmp;
   }

   public void print() {
      for (int i = 0; i < array.length; i++) {
         System.out.println(array[i]);
      }
   }

}
