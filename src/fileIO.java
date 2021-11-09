import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileIO {


    public static void main(String[] args) throws IOException {

        String directory = "./src/data";
        String fileName = "contacts.txt";

        Path contactDirectory = Paths.get(directory);
        Path contactFile = Paths.get(directory, fileName);

        System.out.println(contactFile);

        if(Files.notExists(contactDirectory)){
        Files.createDirectories(contactDirectory); //a plural method worked with one
//            Files.createDirectory(contactDirectory);
        }

        if(Files.notExists(contactFile)){
            Files.createFile(contactFile);
        }

//        Path


    }

}
