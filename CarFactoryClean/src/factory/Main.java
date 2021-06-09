package factory;

import factory.brands.Alfa_Romeo;
import factory.colors.Red;
import factory.engines.E3L;
import factory.wheels.W19;

public class Main {
    public static void main(String[] args) {


        Cars car = new carSeller(new Alfa_Romeo().getBrand(), new E3L().getEngine(), new Red().getColor(), new W19().getWheel());
        System.out.println(car);
    }

}
