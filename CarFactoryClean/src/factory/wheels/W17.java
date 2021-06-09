package factory.wheels;

import factory.Wheels;

public class W17 implements Wheels {
    public String getWheel() {
        return "17'";
    }

    public String toString(){
        return getWheel();
    }
}
