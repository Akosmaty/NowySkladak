package factory.engines;

import factory.Engine;

public class E2L implements Engine {


    public String getEngine() {
        return "2000_CC";
    }

    public String toString(){
        return getEngine();
    }
}
