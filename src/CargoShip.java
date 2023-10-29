public class CargoShip implements Transport{
    private int speed;
    private int capacity;

    public CargoShip(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    @Override
    public void deliver() {
        System.out.println("Cargo ship is sailing!");
    }

    @Override
    public String getDetails() {
        return "Cargo Ship: " + "Speed - " + speed + "knots, " + "Capacity - " + capacity + "tonnes";
    }
}
