public class DeliveryCar implements Transport{
    private int speed;
    private int capacity;

    public DeliveryCar(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    @Override
    public void deliver() {
        System.out.println("Delivery car is on the way!");
    }

    @Override
    public String getDetails() {
        return "Delivery Car: " + "Speed - " + speed + "km/h, " + "Capacity - " + capacity + "kg";
    }
}
