package model;

import lombok.Getter;
import lombok.ToString;

/**
 * Plug Type
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString
public enum PlugType {

   TYPE_F("Typ F", "CEE7/4", "Europa"), TYPE_I("Typ I", "AS/NZS 3112", "ANZ");

   private final String description;
   private final String norm;
   private final String region;

   PlugType(String description, String norm, String region) {
      this.description = description;
      this.norm = norm;
      this.region = region;
   }

}
