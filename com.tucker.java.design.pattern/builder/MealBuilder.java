package builder;

/**
 * @author tonyc
 */
public class MealBuilder {
    public Meal prepareVegBurger() {
        Meal meal = new Meal();
        VegBurger vegBurger = new VegBurger();
        meal.addItems(vegBurger);
        CokeCola cokeCola = new CokeCola();
        meal.addItems(cokeCola);
        return meal;
    }

    public Meal prepareChickenBurger() {
        Meal meal = new Meal();
        ChickenBurger chickenBurger = new ChickenBurger();
        meal.addItems(chickenBurger);
        Pepsi pepsi = new Pepsi();
        meal.addItems(pepsi);
        return meal;
    }
}
