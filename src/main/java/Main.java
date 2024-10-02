public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Bo", "Maassen", new VisaCard(1234));
        customer.printName();
        Customer customer2 = new Customer("Bob", "Hendriks",new MasterCard(2345));
        customer2.printName();

        customer.getCreditCard().pay(10);
        System.out.println(customer.getCreditCard().getDebt());


    }
}
