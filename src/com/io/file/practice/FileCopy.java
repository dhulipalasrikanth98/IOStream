package com.io.file.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws FileNotFoundException {

        try( FileInputStream abcInputStream = new FileInputStream("abc.txt");
             FileOutputStream newFileInputStream = new FileOutputStream("new_file.txt")){
            int data = abcInputStream.read();
            while(data != -1){
                newFileInputStream.write(data);
                data = abcInputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
