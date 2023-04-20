package org.yup.oregontrail;

public class OregonTrailApp {

    public static void main(String [] args){

        Traveler isaac = new Traveler("Isaac", 100, 100);

        System.out.println("before hunting food:" + isaac.getFood());

        System.out.println(isaac.hunt());

      System.out.println("After hunting " + isaac.getFood());
        System.out.println(isaac.hunt());
        System.out.println(isaac.eat());
        System.out.println(isaac.eat());
        System.out.println(isaac.eat());
        System.out.println(isaac.getFood());
    }
}
