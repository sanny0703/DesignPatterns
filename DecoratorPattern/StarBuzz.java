import beverage.Beverage;
import beverage.Espresso;
import decoratedBeverage.DecoratedBeverage;
import decoratedBeverage.Mocha;
import decoratedBeverage.Whip;

public class StarBuzz {
    public static void main(String[] args) {
        // order and espresso with no condiments
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+" : "+espresso.cost());

        // order doubleWhippedEspressoWithMocha
        Beverage customEspresso = new Espresso();
        customEspresso = new Mocha(customEspresso);
        customEspresso = new Whip(customEspresso);
        customEspresso = new Whip(customEspresso);
        System.out.println(customEspresso.getDescription()+" : "+customEspresso.cost());
    }
}
