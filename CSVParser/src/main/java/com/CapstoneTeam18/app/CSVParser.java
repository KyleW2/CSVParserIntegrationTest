package com.CapstoneTeam18.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class CSVParser {
    File csvFile;
    ArrayList<String[]> csv;

    // Constructor
    public CSVParser(String fileName) {;
        csvFile = new File(fileName);
        csv = this.getCSV();
    }

    public int getNumRows() {
        return csv.size();
    }

    public int getNumColumns() {
        return csv.get(0).length;
    }

    // Reads lines/rows of csv file into an ArrayList for getCSV()
    private ArrayList<String> readLines() {
        // ArrayList of rows to return
        ArrayList<String> lines = new ArrayList<String>();

        // Try catch for FileNotFound
        try {
            Scanner scan = new Scanner(csvFile);
            
            // Adds each row of the csv to the ArrayList
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
        // 2D array to return
        ArrayList<String[]> csv = new ArrayList<String[]>();
        // ArrayList to hold rows
        ArrayList<String> lines = readLines();

        // Split each row by "," into an array of columns
        for(int i = 0; i < lines.size(); i++){
            csv.add(lines.get(i).split(",", 0));
        }

        return csv;
    }

    // Just for printing
    public String toString() {
        // Return string
        String out = new String();
        // CSV ArrayList
        ArrayList<String[]> csv = getCSV();

        // Loop thru rows
        for(int i = 0; i < csv.size(); i++) {
            // Loop thru columns in the row
            for(int j = 0; j < csv.get(i).length; j++) {
                out = out + csv.get(i)[j] + " ";
            }
            out = out + "\n";
        }

        return out;
    }
}