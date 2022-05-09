package com.solvd.university.stax;

public class Executor {
    public static void main(String[] args) {

        //parse from file src/main/resources/from.xml
        StaxReader.parceFromFile();

        //parse to file src/main/resources/to.xml
        StaxWriter.parceToFile();
    }

}
