public class WaterBottle {

private int volume;

public WaterBottle(int volume){
    this.volume = volume;
}


    public int takeDrink() {
    return volume - 10;
    }

    public int getVolume() {
    return this.volume;
    }

    public int emptyBottle() {
    volume = this.getVolume();
    return this.volume - this.volume;
    }

    public int fillBottle() {
    volume = this.getVolume();
        int refill = 100 - volume;
    return this.volume + refill;

    }
}
