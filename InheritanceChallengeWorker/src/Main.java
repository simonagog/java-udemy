public class Main {
    public static void main(String[] args) {

        Employee simo = new Employee("Simo", "11/07/1992","01/03/2020");
        System.out.println(simo);
        System.out.println("Age = " + simo.getAge());
        System.out.println("Pay = " + simo.collectPay());

        Employee dan = new Employee("Dan", "21/08/1988", "03/03/2019");
        System.out.println(dan);
    }
}
