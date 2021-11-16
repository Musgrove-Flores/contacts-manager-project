import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.*;

public class fileIO {
//    private String myPhone;
//    private static ArrayList<String> myContact;
//    private static Scanner scanner = new Scanner(System.in);
////    private static fileIO mobilePhone;
//
//    public fileIO(String myPhone) {
//        this.myPhone = myPhone;
////        List<Object> myContacts = new ArrayList<>();
//    }
//
//
//// //Getting contact list method:
//
//    public static void getContactsList() throws IOException {
//        String directory = "./src/data";
//        String fileName = "contacts.txt";
////        Path contactDirectory = Paths.get(directory);
////        Path contactFile = Paths.get(directory, fileName);
//
//        Path contactListPath = Paths.get(directory, fileName);
//
//        List<String> getContacts = Files.readAllLines(contactListPath);
//
//
//
//
////        for(Contact contact: myContacts){
////            System.out.print(contact.printContactList());
////        }
//
//        try {
//
//
//            for (int i = 0; i < getContacts.size(); i++) {
//                System.out.println((i + 1) + " . " + getContacts.get(i));
//
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//
//        }
//
//
////        Path contactListPath = Paths.get(directory, fileName);
////        List<String> myContacts = Files.readAllLines(contactListPath);
////
////        for (int i = 0; i < printList.size(); i++) {
////            System.out.println((i + 1) + " | " + printList.get(i));
////
////
////        }
//
////        Path contactListPath = Paths.get(directory, fileName);
////        List<String> printList = Files.readAllLines(contactListPath);
////
////        for (int i = 5; i < printList.size(); i++) {
////            System.out.println((i + 1) + " | " + printList.get(i));
////        }
//
//
////Adding contact method:
//    }
//    public static void addNewContact() throws IOException {
//        String directory = "./src/data";
//        String fileName = "contacts.txt";
////        Path contactDirectory = Paths.get(directory);
////        Path contactFile = Paths.get(directory, fileName);
//        Path contactListPath = Paths.get(directory, fileName);
//        List<String> myContacts = Files.readAllLines(contactListPath);
//        ArrayList<Contact> addContactList = new ArrayList<>();
//
//
//        System.out.println("Enter Contact Name.\n");
//        String newName = scanner.next();
//        System.out.println("Please enter phone number.\n");
//        String newNumber = scanner.next(); // had to put number as a string instead of double to work with List<String> printList on line 39.
//        String newContact = newName + " | " + newNumber;
////        myContacts.add(newContact);
//
//
////        System.out.print(newContact.printContactList());
//        if (myContact.add(newContact)) {
//            System.out.printf("Successfully added!%n" + newContact + "%n");
//        } else {
//            System.out.println("Contact is already on file.%n" + newContact);
//        }
//    }
//
//
//
//
//
//
//
//            public static int searchByName () {
//                try {
//                    Scanner contactlist = new Scanner("/Users/dezmonemusgrove/IdeaProjects/contacts-manager-project/src/data/contacts.txt");
//                    Scanner looking = new Scanner(System.in);
//
//                    boolean found = false;
//                    int counter = 0;
//
//                    System.out.println("Enter the name");
//                    String name = looking.nextLine();
//                    System.out.println();
//
//                    while (contactlist.hasNext()) {
//
//                        String currentName = contactlist.nextLine();
//
//                        if (currentName.equalsIgnoreCase(name)) {
//                            found = true;
//                            System.out.println("Here it is!" + currentName);
//                        }
//                        counter++;
//                    }
//
//                } catch (Exception e) {
//                    System.out.println(e.toString());
//
//                }
//                return -1;
//            }
//
//            public static void deleteContact () throws IOException{
//                String directory = "./src/data";
//                String fileName = "contacts.txt";
//                Path contactListPath = Paths.get(directory, fileName);
//                List<String> contact = Files.readAllLines(contactListPath);
//
//
//
//                System.out.println("Enter the name of the contact you want to delete: ");
//                String deleteName = scanner.next();
//
//                if(myContact.contains(deleteName)){
//                    Files.write(contactListPath, contact);
//                    System.out.println("Deleting number...%n" + deleteName );
//
//                }else{
//                    System.out.println("That contact doesn't exist...");
//                }
//
//
//                    }
//
//
//
//
//
//
//
//
//            public static void getMenu () throws IOException {
//                Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter An Option: [1, 2, 3, 4, or 5]\n");
//                ArrayList<Contact> myContacts;
//                String directory = "./src/data";
//                String fileName = "contacts.txt";
//
////
//
//                Path contactListPath = Paths.get(directory, fileName);
////
//
//                List<String> printList = Files.readAllLines(contactListPath);
//
//
//
//
//                for (int i = 0; i < printList.size(); i++) {
//                    System.out.println((i + 1) + ": " + printList.get(i)); //first print with numbers
//                }
//
//
//                System.out.println();
//
//                printList = Files.readAllLines(contactListPath);
//                System.out.println(printList);
//
////
//            }
//
//
//
//
//
//    public static void main(String[] args) throws IOException{
//
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        getMenu();
//        System.out.println("Enter An Option: [1, 2, 3, 4, or 5]\n");
//
//
//// got the do while loop to work so when user types "y" it will return to main menu!
//        boolean confirm;
//
//
//        do {
//
//            int userChoice = scanner.nextInt();
//            String userAnswer1 = scanner.nextLine();
//
//
//            switch (userChoice) {
//                case 1:
//                    System.out.println("View Contacts");
//                    getContactsList();
//                    break;
//
//
//                case 2:
//                    System.out.println("Add A New Contact");
//                    addNewContact();
//                    break;
//
//                case 3:
//                    System.out.println("Search A Contact By Name");
//                    searchByName();
//                    break;
//
//                case 4:
//                    System.out.println("Delete An Existing Contact");
//                    deleteContact();
//                    break;
//
//
//                case 5:
//                    System.out.println("Exit");
//                    break;
//
//
//            }
//
//            System.out.println("Would you like to see the menu? [y / n]");
//            String userAnswer2 = scanner.nextLine();
//            confirm = userAnswer2.equalsIgnoreCase("y");
//
//            if (confirm) {
//                getMenu();
//            } else {
//                System.out.println("Bye Bye!");
//            }
//
//
//        } while (confirm);
//
//    }
public static void main(String[] args) {
//    ContactsManager contactsManager = new ContactsManager();
//
//    contactsManager.addContact(new Contact("Dezmone Musgrove", "1234567890"));
//    contactsManager.addContact(new Contact("Kristy Wilder", "1234567890"));
//
//    contactsManager.printOutContacts();
//
//    List<Contact> searchResults = contactsManager.searchContactByName("Musgrove");
//    System.out.println(searchResults);
//    contactsManager.deleteContact(searchResults.get(0));
//    contactsManager.printOutContacts();
//    contactsManager.deleteContact("Musgrove");

    System.out.println("5\n");
    System.out.println(ColouredSystemOutPrintln.ANSI_BRIGHT_BG_GREEN + "Green Background " + ColouredSystemOutPrintln.ANSI_RESET + ColouredSystemOutPrintln.ANSI_PURPLE + " and Red text\n");
    System.out.println(ColouredSystemOutPrintln.ANSI_RESET);
    System.out.println(ColouredSystemOutPrintln.ANSI_BRIGHT_BG_BLUE + "Green Background " + ColouredSystemOutPrintln.ANSI_RESET + ColouredSystemOutPrintln.ANSI_BRIGHT_PURPLE + "and Bright Red text\n");
    System.out.println(ColouredSystemOutPrintln.ANSI_RESET);
}

}



















