public class SmsContact implements ContactInfo {
    private String SmsContact;

    public SmsContact(String SmsContact){
        this.SmsContact = SmsContact;
    }

    public void setSmsContact(String SmsContact){
        this.SmsContact = SmsContact;
    }

    public String getSmsContact() {
        return SmsContact;
    }

    @Override
    public void sendMessage(){
        System.out.println("Call phone number " + SmsContact);
    }

}
