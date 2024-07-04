public class Bicycle {
    int gear;
    int speed;

    Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

}
