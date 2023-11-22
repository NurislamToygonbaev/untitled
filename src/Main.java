import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance: ");
        double nums = scanner.nextDouble();
        System.out.println("Car: " + TransportType.CAR.calculateTravelCost(nums) + " $");
        System.out.println("Bus: " + TransportType.BUS.calculateTravelCost(nums) + " $");
        System.out.println("Truck: " + TransportType.TRUCK.calculateTravelCost(nums) + " $");
    }
}