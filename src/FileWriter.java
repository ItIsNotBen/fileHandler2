import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileWriter;


public class FileWriter {

    FileWriter() {
    }


    // Writing to files
    public static void writeToFile(String fileName, String text, boolean append) {

        ArrayList<String> names = new ArrayList<>();
        try (
                java.io.FileWriter fw = new FileWriter (fileName, append);
                PrintWriter pw = new PrintWriter(fw)
        ) {
            pw.println(text);
        }
    }
        catch (IOException e;) {
            e.printStackTrace();
        }

    }
    }
