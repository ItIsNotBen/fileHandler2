import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileUtils {

// read from files
public static void readFromFile(String fileName) {
    // using best-practice exception handling
    try (
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
    ) {
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}

// Write over files

public static void writeToFile(String fileName, String text, boolean append) {
    ArrayList<String> names = new ArrayList<>();
    try (
            java.io.FileWriter fw = new java.io.FileWriter (fileName, append);
            PrintWriter pw = new PrintWriter(fw)
    ) {
        pw.println(text);
    }
}
        catch (IOException e;) {
        e.printStackTrace();
    }

}


// Handle files
public static void bestWholeFileRead() {
    try {
        FileReader fr = new FileReader("names.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}

}
