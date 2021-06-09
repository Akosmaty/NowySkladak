package factory.colors;

import factory.Color;

public class Blue implements Color {


    public String getColor() {
        return "Blue";
    }

    public String toString(){
        return getColor();
    }
}
