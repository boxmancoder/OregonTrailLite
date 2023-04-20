package org.yup.oregontrail;

public class Traveler {

 private String name;
 private int health;

 private boolean isHealthy;

 private int food;

    public Traveler(String name, int health, int food) {
        this.name = name;
        this.health = health;
        this.food = food;
        this.isHealthy = true;
    }

    public String hunt(){

        // user needs to hunt
        // they have a 50% chance of success
        if(Math.random()>.5){

            // if they are successful we add 100 to their food and 0 if not
            this.setFood(this.getFood() + 100);

            return "The hunt was successful for the traveler : " + this.getName() + " and their food is now at: " + this.getFood();
        }

        return "The hunt was unsuccessful for the traveler : " + this.getName() + " and he's starving :( . The food is still at " + this.getFood();

    }

         public String eat(){
             // Consumes 20 of the traveler's food. If the traveler doesn't have 20 food, the traveler is no longer healthy.
             if(this.getFood() >= 20){
               this.setFood(this.getFood() - 20);
               this.setHealthy(true);
               this.setHealth(100);
               return "That was good af";
             } else {
                 this.setHealthy(false);
                 this.setHealth(0);
                 return "I cannot let the intrusive thoughts win";
             }


         }
    public String getName() {
        return name;
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
