import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class CSVParser {
    File csvFile;

    public CSVParser(String fileName) {;
        csvFile = new File(fileName);
    }

    // Reads lines of csv file into an ArrayList for getCSV()
    private ArrayList<String> readLines() {
        ArrayList<String> lines = new ArrayList<String>();

        try {
            Scanner scan = new Scanner(csvFile);

            while(scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }

            scan.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<String>();
        }

        return lines;
    }

    // Splits lines from readLine() into 2d array
    public ArrayList<String[]> getCSV() {
        ArrayList<String[]> csv = new ArrayList<String[]>();
        ArrayList<String> lines = readLines();

        // For each line from readLine() split by "," and add to ArrayList
        for(int i = 0; i < lines.size(); i++){
            csv.add(lines.get(i).split(",", 0));
        }

        return csv;
    }

    // Just for printing
    public String getCSVString() {
        String out = new String();
        ArrayList<String[]> csv = getCSV();

        for(int i = 0; i < csv.size(); i++) {
            for(int j = 0; j < csv.get(i).length; j++) {
                out = out + csv.get(i)[j] + " ";
            }
            out = out + "\n";
        }

        return out;
    }
}