package factory.wheels;

import factory.Wheels;

public class W19 implements Wheels {
    public String getWheel() {
        return "19'";
    }

    public String toString(){
        return getWheel();
    }
}
