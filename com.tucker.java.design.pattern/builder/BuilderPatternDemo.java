package builder;

/**
 * @author tonyc
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal mealVegBurger = builder.prepareVegBurger();
        Meal mealChickenBurger = builder.prepareChickenBurger();
        mealVegBurger.showItems();
        System.out.println(mealVegBurger.getCost());
        mealChickenBurger.showItems();
        System.out.println(mealChickenBurger.getCost());
    }
}
