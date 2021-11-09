public class Contact {

    private String name;
    private int phoneNumber;

    public Contact() {}

    public void Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }
}
