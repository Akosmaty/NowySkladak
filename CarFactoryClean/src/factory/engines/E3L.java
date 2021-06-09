package factory.engines;

import factory.Engine;

public class E3L implements Engine {


    public String getEngine() {
        return "3000_CC";
    }


    public String toString(){
        return getEngine();
    }
}
