import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save{
    public static void save(String toSave, String pathToFile){
        try {
            File file = new File(pathToFile + "/emails.txt");
            FileWriter fw = new FileWriter(file);

            fw.write(toSave);

            fw.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}