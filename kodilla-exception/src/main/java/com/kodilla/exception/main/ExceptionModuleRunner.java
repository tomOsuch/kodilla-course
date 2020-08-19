package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderExceptio;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.nio.file.FileAlreadyExistsException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderExceptio e) {
            System.out.println("Problem while reading a file!");
        }

    }
}
