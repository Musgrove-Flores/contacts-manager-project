import java.util.ArrayList;

public class Contact {

    private String name;
    private int phoneNumber;



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

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
