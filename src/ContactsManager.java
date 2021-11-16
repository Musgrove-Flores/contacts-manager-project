import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContactsManager<Contact> {
    private List<Contact> contacts;

    public ContactsManager(){
        this.contacts = new ArrayList<>();
//        readContactData();
    }

    public void readContactData() throws IOException {
        String directory = "data";
        String filename = "contactList.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory,  filename);

        if (Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }

        if (!Files.exists(dataFile)){
            Files.createDirectories(dataFile);
        }

        List<String> lines = Files.readAllLines(dataFile);
        for (String line : lines){
            System.out.println("Creating contact from File: " + line);
//            this.contacts.add(new Contact(line));
        }
    }

    public void printOutContacts(){
        System.out.println("Name | Phone Number\n" + "-------------");
        for (Contact contact : this.contacts) {
            System.out.println(contact.toString());
        }
    }

    public void addContact(Contact newContact) {
        contacts.add(newContact);
//        this.contacts.remove();
    }

    public List<Contact> searchContactByName(String name) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : this.contacts) {
//            if (contact.getName().toLowerCase().contains(name.toLowerCase()) {
//                results.add(contact);
//            }
        }
        return results;
    }

    public void deleteContact(Contact contact){

    }

    public void writeContactDataFile() throws IOException {
        String directory = "data";
        String filename = "contactList.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory,  filename);

        if (Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }

        if (!Files.exists(dataFile)){
            Files.createDirectories(dataFile);
        }

        List<String> fileContents = new ArrayList<>();
//        for (Contact contact : )
    }


}
