package ua.GoIt.mod14;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class FoodMarketService {

    public static double calculateTotalCost(@NotNull String goodsInCart) {
        double result = 0.00;


        final Map<String, Integer> totalCard = new HashMap<>();
        String cart = goodsInCart.toUpperCase();
        int counterB = 0, counterD = 0, counterA = 0, counterC = 0;
        for (char element : cart.toCharArray()) {
            if (element == 'B') counterB++;
            if (element == 'D') counterD++;
            if (element == 'A') counterA++;
            if (element == 'C') counterC++;
        }
        totalCard.put("A", counterA);
        totalCard.put("B", counterB);
        totalCard.put("C", counterC);
        totalCard.put("D", counterD);

        System.out.println("A: " + counterA);
        System.out.println("C: " + counterC);
        System.out.println("B: " + counterB);
        System.out.println("D: " + counterD);


        for (Product goods : FoodMarket.foodmarket) {
            if (totalCard.get(goods.getCode()) == null)
                continue;
            if (goods instanceof DiscountProduct) {
                DiscountProduct good = (DiscountProduct) goods;
                result += CalculateTotalPriceOfDiscountProduct(good.getActionAmount(), totalCard.get(good.getCode()), good.getActionPrice(), good.getPrice());
            } else {
                result += goods.getPrice() * totalCard.get((goods.getCode()));


            }
        }
        return result;

    }

    public static double CalculateTotalPriceOfDiscountProduct(Integer actionAmount, Integer counter, Double actionPrice, Double price) {
        final double resultOdDiscount = ((counter / actionAmount) * actionPrice) + ((counter % actionAmount) * price);
        return resultOdDiscount;
    }
}
