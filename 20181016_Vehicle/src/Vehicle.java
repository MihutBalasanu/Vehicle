public abstract class Vehicle {

    private int speed;
    private int gear;

    public Vehicle() {
        this.speed = speed;
        this.gear = gear;
    }


    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int increment){
        int newSpeed = speed + increment;
        speed = newSpeed;
    }

    public void applyBrakes(int decrement){
        int newSpeed = speed - decrement;
        speed = newSpeed;

    }

    public abstract void printState();


}
