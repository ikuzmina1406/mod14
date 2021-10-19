package ua.GoIt.mod14;

public class DiscountProduct extends Product {
    private Integer actionAmount;
    private Double actionPrice;

    public Integer getActionAmount() {
        return actionAmount;
    }

    public void setActionAmount(Integer actionAmount) {
        this.actionAmount = actionAmount;
    }

    public Double getActionPrice() {
        return actionPrice;
    }

    public void setActionPrice(Double actionPrice) {
        this.actionPrice = actionPrice;
    }


    public DiscountProduct(String code, Double price, Integer actionAmount, Double actionPrice) {

        this.code = code;
        this.price = price;
        this.actionAmount = actionAmount;
        this.actionPrice = actionPrice;
    }

    @Override
    public String toString() {
        return "DiscountProduct{" +
                "actionAmount=" + actionAmount +
                ", actionPrice=" + actionPrice +
                ", code='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}



