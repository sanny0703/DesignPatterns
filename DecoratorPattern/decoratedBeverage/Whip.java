package decoratedBeverage;

import beverage.Beverage;

public class Whip extends DecoratedBeverage{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost()+0.34;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
