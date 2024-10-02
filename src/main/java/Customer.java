public class Customer {
    String name;
    String lastName;
    int customerNumber;
    private CreditCard creditcard;

    public void printName(){
        System.out.println("Customer " + name);
    }

    public Customer(String name, String lastName, CreditCard creditcard){
        this.name = name;
        this.lastName = lastName;
        this.creditcard = creditcard;
    }

    public Customer(String name, String lastName, int customerNumber, CreditCard creditcard){
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditcard =creditcard;
    }

    public CreditCard getCreditCard() {
        return creditcard;
    }

    public void setCreditCard(CreditCard creditcard){
        this.creditcard = creditcard;
    }
}
