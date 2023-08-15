package com.io.file.practice;

import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamPractice {
    public static void main(String[] args) throws IOException {
        char c;
        try (FileInputStream inputStream = new FileInputStream("abc.txt")) {

         int data = inputStream.read();
         while(data != -1){
             System.out.print((char)data);
             data = inputStream.read();
         }
        }
        //System.out.println(c);
    }

}
