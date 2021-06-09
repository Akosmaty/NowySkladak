package factory.engines;

import factory.Engine;

public class E1L implements Engine {


    public String getEngine() {
        return "1000_CC";
    }

    public String toString(){
        return getEngine();
    }
}
