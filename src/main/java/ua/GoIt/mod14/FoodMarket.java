package ua.GoIt.mod14;

import java.util.ArrayList;
import java.util.List;

public class FoodMarket {
    public static List<Product> foodmarket = new ArrayList<>();

    static {
        foodmarket.add(new DiscountProduct("A", 1.25, 3, 3.00));
        foodmarket.add(new Product("B", 4.25));
        foodmarket.add(new DiscountProduct("C", 1.00, 6, 5.00));
        foodmarket.add(new Product("D", 0.25));
    }


}