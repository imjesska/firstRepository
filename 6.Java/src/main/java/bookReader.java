import java.awt.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bookReader {
    public static void main(String[] args) throws Exception{

       FileInputStream fStream = new FileInputStream("src/bookReader/taleOfTwoCities.txt");
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(fStream));
        var logList = new List<string>(buffReader);

          for(String line; (line = buffReader.readLine()) != null;){
              System.out.println(line);
              String[] words = line.split( " ");


           }


       }

    }

