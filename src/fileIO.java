import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.*;

public class fileIO {
    private String myPhone;
    private ArrayList<Contact> myContacts;
    private static Scanner scanner = new Scanner(System.in);
    private static fileIO mobilePhone;

    public fileIO(String myPhone) {
        this.myPhone = myPhone;
        this.myContacts = new ArrayList<Contact>();
    }

// //Getting contact list method:

//     public static void getContactsList() throws IOException {
//         String directory = "./src/data";
//         String fileName = "contacts.txt";
//         Path contactDirectory = Paths.get(directory);
//         Path contactFile = Paths.get(directory, fileName);
// <<<<<<< flores-contact-project

// //        Path contactListPath = Paths.get(directory, fileName);
// //        List<String> printList = Files.readAllLines(contactListPath);
// //
// //        for (int i = 0; i < printList.size(); i++) {
// //            System.out.println((i + 1) + " | " + printList.get(i));
// //
// //
// //
// //        }
// =======
//         Path contactListPath = Paths.get(directory, fileName);
//         List<String> printList = Files.readAllLines(contactListPath);

//         for (int i = 5; i < printList.size(); i++) {
//             System.out.println((i + 1) + " | " + printList.get(i));
//         }
// >>>>>>> main
    }

//Adding contact method:

// <<<<<<< flores-contact-project
//     public static boolean addContact(Contact contacts) throws IOException {
// =======
//     public static void addContact() throws IOException {
// >>>>>>> main
//         Scanner scanner = new Scanner(System.in);

        String directory = "./src/data";
        String fileName = "contacts.txt";
        Path contactDirectory = Paths.get(directory);
        Path contactFile = Paths.get(directory, fileName);
        Path contactListPath = Paths.get(directory, fileName);
        List<String> printList = Files.readAllLines(contactListPath);

// <<<<<<< flores-contact-project
// =======
//         ArrayList<Contact> contacts = new ArrayList<>();
// >>>>>>> main

        System.out.println("Enter Contact Name.\n");
        String newContact = scanner.nextLine();
        System.out.println("Please enter phone number.\n");
        String newNumber = scanner.nextLine(); // had to put number as a string instead of double to work with List<String> printList on line 39.
        String nameAndNumber = newContact + " | " + newNumber;


        System.out.printf("Name: %s%nNumber: %s%n", newContact, newNumber);


        for (int i = 0; i < printList.size(); i++) {
            if (Files.notExists(contactDirectory)) {
                Files.createDirectories(contactDirectory); //a plural method worked with one
//            Files.createDirectory(contactDirectory);
            }

            if (Files.notExists(contactFile)) {
                Files.createFile(contactFile);
            } else if (printList.contains(newContact) && printList.contains(newNumber)) {
                System.out.println("Sorry, that number is already in your contacts!");
            }
            System.out.println(nameAndNumber);
            break;
        }

        Files.write(contactListPath, List.of(nameAndNumber), StandardOpenOption.APPEND);

        printList = Files.readAllLines(contactListPath);

        for (int i = 5; i < printList.size(); i++) {
            System.out.println((i + 1) + ": " + printList.get(i));
        }

//        for (Contact contact : contacts) {
//            String adding = newContact;
//            adding = contact.getName();
//                        for(int i = 5; i < adding.length(); i++){
//                System.out.println((i + 1) + ": " + adding.length());
//            }
//        }
//        for (Contact contact : contacts) {
//            double nums = newNumber;
//            nums = contact.getPhoneNumber();
//            for(int i = 5; i < nums; i++){
//                System.out.println((i + 1) + ": " + nums);
//            }
//            contact.setName();
//            contact.setPhoneNumber((int) newNumber);
//        }
// <<<<<<< flores-contact-project
//         return false;

// }
// =======
//     }
// >>>>>>> main

    public static void searchByName() {
        try {
            Scanner contactlist = new Scanner("/Users/dezmonemusgrove/IdeaProjects/contacts-manager-project/src/data/contacts.txt");
            Scanner looking = new Scanner(System.in);

            boolean found = false;
            int counter = 0;

            System.out.println("Enter the name");
            String name = looking.nextLine();
            System.out.println();

            while (contactlist.hasNext()) {

                String currentName = contactlist.nextLine();

                if (currentName.equalsIgnoreCase(name)) {
                    found = true;
                    System.out.println("Here it is!" + currentName);
                }
                counter++;
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void deleteContact() {


    }


    public static void getMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter An Option: [1, 2, 3, 4, or 5]\n");
        ArrayList<Contact> myContacts;
        String directory = "./src/data";
        String fileName = "contacts.txt";

        Path contactDirectory = Paths.get(directory);
        Path contactFile = Paths.get(directory, fileName);

//        System.out.println(contactFile);

//            if (Files.notExists(contactDirectory)) {
//                Files.createDirectories(contactDirectory); //a plural method worked with one
////            Files.createDirectory(contactDirectory);
//            }
//
//            if (Files.notExists(contactFile)) {
//                Files.createFile(contactFile);
//            }

        Path contactListPath = Paths.get(directory, fileName);
//        System.out.println("contactListPath = " + contactListPath);
//        System.out.println("Files.exists(contactsListPath) = " + Files.exists(contactListPath));

        List<String> mainMenuList = Arrays.asList("View Contacts", "Add a New Contact", "Search A Contact By Name", "Delete An Existing Contact", "Exit");
        //menuList should be a method

        Files.write(contactListPath, mainMenuList);
        System.out.println();

        List<String> printList = Files.readAllLines(contactListPath);

//        System.out.println("printList = " + printList);


        for (int i = 0; i < printList.size(); i++) {
            System.out.println((i + 1) + ": " + printList.get(i)); //first print with numbers
        }


        System.out.println();

        printList = Files.readAllLines(contactListPath);
        System.out.println(printList);

        for (int i = 0; i < printList.size(); i++) {
            System.out.println((i + 1) + ": " + printList.get(i));
        }
    }

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        getMenu();
        System.out.println("Enter An Option: [1, 2, 3, 4, or 5]\n");


// got the do while loop to work so when user types "y" it will return to main menu!
        boolean confirm;


        do {

            int userChoice = scanner.nextInt();
            String userAnswer1 = scanner.nextLine();

// <<<<<<< flores-contact-project
//                     case 2:
//                         System.out.println("Add A New Contact");
//                         addNewContact();
//                         break;
// =======
//             switch (userChoice) {
//                 case 1:
//                     System.out.println("View Contacts");
//                     getContactsList();
//                     break;
// >>>>>>> main

                case 2:
                    System.out.println("Add A New Contact");
                    addContact();
                    break;

                case 3:
                    System.out.println("Search A Contact By Name");
                    searchByName();
                    break;

                case 4:
                    System.out.println("Delete An Existing Contact");
                    deleteContact();
                    break;


                case 5:
                    System.out.println("Exit");
                    break;


            }

            System.out.println("Would you like to see the menu? [y / n]");
            String userAnswer2 = scanner.nextLine();
            confirm = userAnswer2.equalsIgnoreCase("y");


// <<<<<<< flores-contact-project

//             } while (confirm);
// //
//         }
//         private static void addNewContact() throws IOException {
//             System.out.println("Enter Contact Name.\n");
//             String newName = scanner.nextLine();
//             System.out.println("Please enter phone number.\n");
//             String newNumber = scanner.nextLine(); // had to put number as a string instead of double to work with List<String> printList on line 39.
//             Contact newContact = Contact.createContact(newName, newNumber);
// =======
//             if (confirm) {
//                 getMenu();
//             } else {
//                 System.out.println("Bye Bye!");
//             }
// >>>>>>> main

            try {
                if (addContact(newContact)) {
                    System.out.println("New Contact is Added: " + newName + newNumber );

                }else{
                    System.out.println("This contact is already on file: " + newName);
                }
            }catch(Exception e){
                System.out.println(e.toString());

            }

        } while (confirm);


// <<<<<<< flores-contact-project
//         }
// =======
// //
//     }
// >>>>>>> main

}


