package ua.GoIt.mod14;

public class Product {

    protected String code;
    protected Double price;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Product(String code, Double price) {
        this.code = code;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}



