package factory.colors;

import factory.Color;

public class Red implements Color {


    public String getColor() {
        return "Red";
    }

    public String toString(){
        return getColor();
    }


}
