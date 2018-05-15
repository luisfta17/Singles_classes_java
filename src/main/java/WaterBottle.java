public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        if (this.volume >= 10){
            this.volume -= 10;
        }

    }

    public int emptyBottle() {
        return volume = 0;
    }

    public int refillBottle() {
        return volume = 100;
    }
}
