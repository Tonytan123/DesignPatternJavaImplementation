package builder;

import java.util.ArrayList;

/**
 * @author tonyc
 */
public class Meal {

    private ArrayList<Items> items = new ArrayList<Items>();

    public void addItems(Items item) {
        items.add(item);
    }

    public void showItems() {
        for (Items item : items) {
            System.out.println(item.getName());
        }
    }

    public double getCost() {
        double price = 0;
        for (Items item : items) {
            price += item.getPrice();
        }
        return price;
    }
}
