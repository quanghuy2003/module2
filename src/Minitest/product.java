package Minitest;
import java.util.Scanner;
public class product {
      int code;
      String name;
      double price;
      String type;
      String currencyUnit;


    public product(int code, String name, double price, String type, String currencyUnit) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.currencyUnit = currencyUnit;
    }

    public product() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @Override
    public String toString() {
        return "product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", currencyUnit='" + currencyUnit + '\'' +
                '}';
    }
}
