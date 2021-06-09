package factory.wheels;

import factory.Wheels;

public class W15 implements Wheels {
    public String getWheel() {
        return "15'";
    }


    public String toString(){
        return getWheel();
    }
}
