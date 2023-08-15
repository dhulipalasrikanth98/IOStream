package com.io.file.practice;


import java.io.File;
import java.io.IOException;

public class FileOutputStream {
    public static void main(String[] args) {


       try(java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream("abc.txt",true)){
           byte[] c = {'h','i',' ',' ','m','y'};
           fileOutputStream.write(c);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

}
