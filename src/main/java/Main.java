public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Bo", "Maassen", new VisaCard(0), new EmailContact("bomaassen@live.nl"), new SmsContact("0620861438"));
        customer.printName();
        Customer customer2 = new Customer("Bob", "Hendriks",new MasterCard(0),new EmailContact("bobhendriks@live.nl"), new SmsContact("0698457239"));
        customer2.printName();

        customer.getCreditCard().pay(100);
        customer2.getCreditCard().pay(100);
        System.out.println(customer.getCreditCard().getDebt() + " " + customer2.getCreditCard().getDebt());
        customer2.getContactInfo().sendMessage();

    }
}
