import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Contact {

    private String name;
    private String phoneNumber;


    public Contact(String pipDelimitedContact) {
        String[] contactinfo = pipDelimitedContact.split(" \\| ");
        System.out.println(contactinfo);
        this.name = contactinfo[0];
        this.phoneNumber = contactinfo[1];
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    //    public void createContact(String name, String phoneNumber){
//         new Contact (name, phoneNumber);
//
//    }
//    ArrayList<String> contactList = new ArrayList<String>();
//
//    public ArrayList<String> getContactList() {
//        return contactList;
//    }
//
//    public void setContact(String name) {
//        contactList.add(name);
//
//    }
}


//    public void int printContactList(){
//        System.out.println("Your contact list: "+contactList.size());
//        for(int i=0;i<contactList.size();i++){
//        System.out.println(i+" - "+contactList.get(i));
//        }
//        return
//}