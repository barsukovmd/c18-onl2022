package models;

import lombok.Getter;

@Getter
public abstract class CarCharacteristicImpl {
   void getDistance() {
      System.out.println("1000");
   }

   ;

   void getSpeed() {
      System.out.println("100");
   }

   ;

   void getInsurance() {
      System.out.println("1 year");
   }

   ;
}
