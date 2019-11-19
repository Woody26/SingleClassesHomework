public class WaterBottle {
    private int volume;



public WaterBottle(int volume){
    this.volume = 100;
}

public void drink(){
    this.volume -= 10;
}

public void empty(){
   this.volume = 0;
}

public void full(){
    this.volume = 100;
}

    public int getVolume() {
        return volume;
    }
}