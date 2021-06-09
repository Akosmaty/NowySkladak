package factory;

public class carSeller implements Cars {
    public Brand brand;
    public Engine engine;
    public Color color;
    public Wheels wheel;


    public carSeller(Brand brand, Engine engine, Color color, Wheels wheel) {
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.wheel = wheel;
    }

    public Brand getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public Color getColor() {
        return color;
    }

    public Wheels getWheel() {
        return wheel;
    }

    public String toString(){
        return getBrand() + " " + getEngine() + " " + getColor()  + " " + getWheel();
    }

}
