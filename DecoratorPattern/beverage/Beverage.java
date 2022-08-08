package beverage;

public abstract class Beverage {
     String description;
    public Beverage(){
        description = "Unknown";
    }
    public String getDescription(){
        return  description;
    }
    public abstract  double cost();
}
