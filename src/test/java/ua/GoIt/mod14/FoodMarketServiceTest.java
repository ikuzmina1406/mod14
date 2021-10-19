package ua.GoIt.mod14;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FoodMarketServiceTest {

    @Test
    public void CalculateTotalPriceOfDiscountProduct() {
        int actionAmount = 3;
        int counter = 3;
        double actionPrice = 3.00;
        double price = 1.25;
        Assert.assertEquals(3, FoodMarketService.CalculateTotalPriceOfDiscountProduct(actionAmount, counter, actionPrice, price), 0.0001);

        actionAmount = 3;
        counter = 6;
        actionPrice = 3.00;
        price = 1.25;
        Assert.assertEquals(6, FoodMarketService.CalculateTotalPriceOfDiscountProduct(actionAmount, counter, actionPrice, price), 0.0001);

        actionAmount = 3;
        counter = 10;
        actionPrice = 3.00;
        price = 1.25;
        Assert.assertEquals(10.25, FoodMarketService.CalculateTotalPriceOfDiscountProduct(actionAmount, counter, actionPrice, price), 0.0001);

        actionAmount = 3;
        counter = 12;
        actionPrice = 3.00;
        price = 1.25;
        Assert.assertEquals(12, FoodMarketService.CalculateTotalPriceOfDiscountProduct(actionAmount, counter, actionPrice, price), 0.0001);

    }

    @Test
    public void calculateTotalCostTest() {

        String goodsInCart = "AaabccccDDBBBnnn";
        Map<String, Double> test = new HashMap<>();
        test.put(goodsInCart, FoodMarketService.calculateTotalCost(goodsInCart));

        Assert.assertNotNull(test.get(goodsInCart));
        Assert.assertEquals(24.50, FoodMarketService.calculateTotalCost(goodsInCart), 0.001);

    }
}