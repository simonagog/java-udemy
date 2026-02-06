public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
        car.setModel("Porsche");
        car.setColor("red");
        car.setDoors(2);
        System.out.println("make: " + car.getMake());
        System.out.println("model: " + car.getModel());
        System.out.println("color: " + car.getColor());
    }
}
