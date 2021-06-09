package factory;

public class carSeller implements Cars {
    public String brand;
    public String engine;
    public String color;
    public String wheel;


    public carSeller(String brand, String engine, String color, String wheel) {
        this.brand = brand;
        this.engine = engine;
        this.color = color;
        this.wheel = wheel;
    }

    public String getCar() {
        return brand +" "+ engine+" " + color + " "+ wheel;
    }
    public String toString(){
        return  getCar();
    }

}
