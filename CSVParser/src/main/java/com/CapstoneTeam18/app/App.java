package com.capstoneteam18.app;

public class App {
    public static void main(String[] args) {
        CSVParser test = new CSVParser("./CSVParser/src/test/java/com/CapstoneTeam18/app/csv/valid.csv");
        System.out.println(test.toString());
    }
}

