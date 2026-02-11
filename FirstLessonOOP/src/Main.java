public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Porsche");
        car.setColor("red");
        car.setDoors(2);

        car.describeCar();

        System.out.println("make: " + car.getMake());
        System.out.println("model: " + car.getModel());
        System.out.println("color: " + car.getColor());
    }
}
