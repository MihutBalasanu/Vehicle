public class Bus extends Vehicle{
    @Override
    public void printState() {
        System.out.println("Bus state: " + "gear " + getGear()+ " speed " + getSpeed() );

    }
    
     public Bus(int speed, int gear) {
        super(speed, gear);
    }
}
