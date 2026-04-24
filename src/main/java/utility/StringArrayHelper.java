package utility;

/**
 * String Array Helper
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringArrayHelper {

   public static String[] add(String[] array, String value) {
      for (int i = 0; i < array.length; i++) {
         String element = array[i];
         if (element == null) {
            array[i] = value;
            return array;
         }
      }

      String[] tmp = new String[array.length * 2];
      for (int i = 0; i < array.length; i++) {
         tmp[i] = array[i];
      }
      tmp[array.length] = value;
      return tmp;
   }

   public static void print(String[] array) {
      for (int i = 0; i < array.length; i++) {
         System.out.println(array[i]);
      }
   }

}
