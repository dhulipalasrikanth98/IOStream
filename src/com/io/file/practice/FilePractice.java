package com.io.file.practice;

import java.io.File;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        //creating new file
        File newFile = new File("new_file.txt");
        System.out.println(newFile.exists());
        newFile.createNewFile();

        //adding file to subfolder
        File file1 = new File("sub-dir");
        file1.mkdir();
        File file = new File(file1,"abc.txt");
        file.createNewFile();
         File file2 = new File("sub-dir","abc2.txt");
         file2.createNewFile();

         File f = new File("D:\\xyz");
         f.mkdir();
         File newFileInOtherDirectory = new File(f,"demo.txt");
         newFileInOtherDirectory.createNewFile();


    }
}
