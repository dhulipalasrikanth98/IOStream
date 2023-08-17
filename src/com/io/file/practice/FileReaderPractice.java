package com.io.file.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPractice {
    public static void main(String[] args) throws FileNotFoundException {

        try(FileReader fileReader = new FileReader("abc.txt")){
            int i = fileReader.read();
            while(i != -1){
                System.out.print((char)i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
