public abstract class Vehicle {

    private int speed;
    private int gear;

    public Vehicle() {
        this.speed = 0;
        this.gear = 0;
    }
    
     public Vehicle(int speed, int gear){
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
        speed = speed + increment;
    }

    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public abstract void printState();


}
