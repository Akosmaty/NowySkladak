package factory.brands;

import factory.Brand;

public class SKoda implements Brand {


    public String getBrand() {
        return "Skoda";
    }

    public String toString(){
        return getBrand();
    }
}
