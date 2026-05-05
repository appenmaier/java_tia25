package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@ToString
@EqualsAndHashCode
@Getter
public class TableLight {

   private boolean isConnected;
   private boolean isOn;
   private LightBulb lightBulb;
   private final PlugType plugType;

   public final static String DESCRIPTION = "Tischleuchte";

   /** Creates a table light without a light bulb. */
   public TableLight() {
      plugType = PlugType.TYPE_F;
   }

   /**
    * Creates a table light with the given light bulb.
    *
    * @param lightBulb the initial light bulb
    */
   public TableLight(LightBulb lightBulb) {
      this.lightBulb = lightBulb;
      plugType = PlugType.TYPE_F;
   }

   /**
    * Creates a table light and installs a new light bulb of the given color.
    *
    * @param colorOfLightBulb the color of the light bulb to install
    */
   public TableLight(String colorOfLightBulb, PlugType plugType) {
      lightBulb = new LightBulb(colorOfLightBulb);
      this.plugType = plugType;
   }

   /** Turns the light on. */
   public void switchOn() {
      isOn = true;
   }

   /** Turns the light off. */
   public void switchOff() {
      isOn = false;
   }

   /** Connects the light to the power supply. */
   public void plugIn() {
      isConnected = true;
   }

   /** Disconnects the light from the power supply. */
   public void pullThePlug() {
      isConnected = false;
   }

   /**
    * Replaces the current light bulb with a new one and returns the old one.
    *
    * @param newLightBulb the light bulb to install
    * @return the removed light bulb, or {@code null} if none was installed
    */
   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   /**
    * Returns whether the light is currently emitting light.
    *
    * @return {@code true} if connected, switched on, and a bulb is installed
    */
   public boolean isShining() {
      return isConnected && isOn && lightBulb != null;
   }

   /**
    * Returns whether the light is connected to the power supply.
    *
    * @return {@code true} if plugged in
    */
   public boolean isConnected() {
      return isConnected;
   }

   /**
    * Returns whether the light switch is in the on position.
    *
    * @return {@code true} if switched on
    */
   public boolean isOn() {
      return isOn;
   }

   /**
    * Returns the currently installed light bulb.
    *
    * @return the light bulb, or {@code null} if none is installed
    */
   public LightBulb getLightBulb() {
      return lightBulb;
   }

}
