package VillagePereNoel.Characters;

import VillagePereNoel.Food;
import TD_PERE_NOEL.Batiments.Batiment;

public abstract class Character {

    protected enum Genre {Femme, Homme};

    private String name ;
    private Genre gender ;
    private int age ;
    private int tirednessStatus ;
    private boolean isResting ;
    private int hungerStatus ;
    private int xmasMagicStatus ;
    private Batiment position ;

    public Character (String name, Genre gender, int age){

        this.name = name ;
        this.gender = gender ;
        this.age = age ;
        this.isResting = false ;
        this.tirednessStatus = 100 ;
        this.hungerStatus = 100 ;
        this.xmasMagicStatus = 100 ; 

    } ;
    public abstract void makeSound(String sound) ;
    public void moveTo(Batiment destination){

        if (destination.welcome(this)) {

            this.position = destination ;
            
        }
        if (!destination.welcome(this)) {

            System.out.println("Le batiment est plein.");
            
        }
        else {

            System.out.println("Ce n'est pas une destination valide.");

        }

    } ;
    public void eat(Food food){

        if(this.getHungerStatus() < 100){

            this.setHungerStatus(this.getHungerStatus() + food.getNutritionalValue());
        }

    }
    
    public abstract String toString();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Genre getGender() {
        return gender;
    }
    public void setGender(Genre gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getTirednessStatus() {
        return tirednessStatus;
    }
    public void setTirednessStatus(int tirednessStatus) {
        this.tirednessStatus = tirednessStatus;
    }
    public boolean isResting() {
        return isResting;
    }
    public void setResting(boolean isResting) {
        this.isResting = isResting;
    }
    public int getHungerStatus() {
        return hungerStatus;
    }
    public void setHungerStatus(int hungerStatus) {
        this.hungerStatus = hungerStatus;
    }
    public int getXmasMagicStatus() {
        return xmasMagicStatus;
    }
    public void setXmasMagicStatus(int xmasMagicStatus) {
        this.xmasMagicStatus = xmasMagicStatus;
    }
    public Batiment getPosition() {
        return position;
    }
    public void setPosition(Batiment position) {
        this.position = position;
    }
    
}
