public class Main {
    public static void main(String[] args) {

        Employee simo = new Employee("Simo", "11/07/1992","01/03/2020");
        System.out.println(simo);
        System.out.println("Age = " + simo.getAge());
        System.out.println("Pay = " + simo.collectPay());

        SalariedEmployee dan = new SalariedEmployee("Dan", "21/08/1988", "03/03/2019", 35000);
        System.out.println(dan);
        System.out.println("Dan's Paycheck = $" + dan.collectPay());

        dan.retire();
        System.out.println("Dan's Pension check = $" + dan.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "07/03/1977", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
