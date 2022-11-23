public class ProteinBar extends Product {

    Integer calories;

    public ProteinBar(String name) {
        super(name);
    } 
    
    public ProteinBar(String name, Double price) {
        super(name, price);
    }

    public ProteinBar(String name, Double price, Integer calories) {
        super(name, price);
        this.calories = calories;
    }
    
    public Integer getCalories(){
        return this.calories;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Calories: " + calories);
    }
}
