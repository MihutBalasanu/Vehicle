public class Truck extends Vehicle {
    @Override
    public void printState() {
        System.out.println("Truck state: " + "gear " + getGear()+ " speed " + getSpeed() );
    }
}
