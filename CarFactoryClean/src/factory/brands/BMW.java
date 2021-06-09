package factory.brands;

import factory.Brand;

public class BMW implements Brand {


    public String getBrand() {
        return "BMW";
    }
    public String toString(){
        return getBrand();
    }
}
