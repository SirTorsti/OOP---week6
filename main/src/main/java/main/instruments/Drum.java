package main.instruments;

public class Drum extends Instrument {

    public Drum(String manufacturer, int price) {
        super(manufacturer, price);
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void playBeat () {
        System.out.println(manufacturer + " rummut soittavat komppia!");
    }
}