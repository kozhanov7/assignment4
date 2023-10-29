import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a delivery method: CAR or SHIP");
        String deliveryMethod = scanner.nextLine();

        Transport transport = Factory.getTransport(deliveryMethod);
        if (transport == null) {
            System.out.println("Invalid choice!");
            return;
        }

        transport.deliver();
        System.out.println(transport.getDetails());
    }
}
