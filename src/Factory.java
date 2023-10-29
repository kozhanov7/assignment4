public class Factory {
    public static Transport getTransport(String type) {
        if (type == null) {
            return null;
        }

        switch (type.toUpperCase()) {
            case "CAR":
                return new DeliveryCar(120, 500);  // Default car values: speed 120km/h, capacity 500kg

            case "SHIP":
                return new CargoShip(25, 20000);  // Default ship values: speed 25 knots, capacity 20000 tonnes

            default:
                return null;
        }
    }
}
