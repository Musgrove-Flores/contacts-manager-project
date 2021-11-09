import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.*;

public class fileIO {



    public static void main(String[] args) throws IOException {
        ArrayList<Contact> myContacts;
        String directory = "./src/data";
        String fileName = "contacts.txt";

        Path contactDirectory = Paths.get(directory);
        Path contactFile = Paths.get(directory, fileName);

        System.out.println(contactFile);

        if (Files.notExists(contactDirectory)) {
            Files.createDirectories(contactDirectory); //a plural method worked with one
//            Files.createDirectory(contactDirectory);
        }

        if (Files.notExists(contactFile)) {
            Files.createFile(contactFile);
        }

        Path contactListPath = Paths.get(directory, fileName);
        System.out.println("contactListPath = " + contactListPath);
        System.out.println("Files.exists(contactsListPath) = " + Files.exists(contactListPath));

        List<String> mainMenuList = Arrays.asList("View Contacts", "Add a New Contact", "Search A Contact By Name", "Delete An Existing Contact", "Exit");

        Files.write(contactListPath, mainMenuList);
        System.out.println();

        List<String> printList = Files.readAllLines(contactListPath);
        System.out.println("printList = " + printList);

        for (int i = 0; i < printList.size(); i++) {
            System.out.println((i + 1) + ": " + printList.get(i));
        }


        System.out.println();

        printList = Files.readAllLines(contactListPath);
        System.out.println(printList);

        for(int i = 0; i < printList.size(); i++){
            System.out.println((i + 1) + ": " + printList.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter An Option: [1, 2, 3, 4, or 5]\n");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("View Contacts");
                break;

                case 2:
                System.out.println("Add A New Contact");
                break;

                case 3:
                System.out.println("Search A Contact By Name");
                break;

                case 4:
                System.out.println("Delete An Existing Contact");
                break;

                case 5:
                System.out.println("Exit");
                break;



        }
//        public void viewContact() {
//            System.out.println("Contact List");
//            for (int i = 0; i < this.myContacts.size(); i++) {
//                System.out.println((i + 1) + " ." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
//            }
//        }
//
//        public static void addContact() {
//            System.out.println("Enter Contact Name.\n");
//            String newContact = scanner.nextLine();
//
//
//        }


    }
}
