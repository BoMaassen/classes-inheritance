public class Customer {
    String name;
    String lastName;
    int customerNumber;
    private CreditCard creditcard;
    private ContactInfo contactInfo;
    private ContactInfo contactInfo2;

    public void printName(){
        System.out.println("Customer " + name);
    }

    public Customer(String name, String lastName, CreditCard creditcard, ContactInfo contactInfo, ContactInfo contactInfo2){
        this.name = name;
        this.lastName = lastName;
        this.creditcard = creditcard;
        this.contactInfo = contactInfo;
        this.contactInfo2 = contactInfo2;

    }

    public Customer(String name, String lastName, int customerNumber, CreditCard creditcard, ContactInfo contactInfo){
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditcard =creditcard;
        this.contactInfo = contactInfo;
    }

    public CreditCard getCreditCard() {
        return creditcard;
    }

    public void setCreditCard(CreditCard creditcard){
        this.creditcard = creditcard;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(ContactInfo contactInfo){
        this.contactInfo = contactInfo;
    }
    public ContactInfo getContactInfo2() {
        return contactInfo2;
    }
    public void setContactInfo2(ContactInfo contactInfo2){
        this.contactInfo2 = contactInfo2;
    }
}
