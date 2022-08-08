package decoratedBeverage;

import beverage.Beverage;

public class Soy extends DecoratedBeverage{
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost()+0.23;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
