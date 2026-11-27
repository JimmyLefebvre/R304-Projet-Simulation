package VillagePereNoel;

public class Food {

    private String name ;
    private int nutritionalValue ;

    public Food(String name, int nutritionalValue){

        this.name = name ;
        this.nutritionalValue = nutritionalValue;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(int nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", nutritionalValue=" + nutritionalValue + "]";
    }

    
   

}
