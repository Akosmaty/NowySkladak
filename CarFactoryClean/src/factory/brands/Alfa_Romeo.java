package factory.brands;

import factory.Brand;

public class Alfa_Romeo implements Brand {


    public String getBrand() {
        return "Alfa Romeo";
    }

    public String toString(){
        return getBrand();
    }

}
