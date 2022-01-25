package com.CapstoneTeam18.app;

public class App {
    public static void main(String[] args) {
        CSVParser test = new CSVParser("csv/valid.csv");
        System.out.println(test.toString());
    }
}

