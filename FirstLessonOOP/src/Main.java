public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
        System.out.println("make: " + car.getMake());
        System.out.println("mode: " + car.getModel());
        System.out.println("color: " + car.getColor());
    }
}
