package com.io.file.practice;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DeleteDataFromFile {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter("sub-dir/abc4.txt");
        BufferedReader abcReader = new BufferedReader(new FileReader("sub-dir/abc.txt"));

        String str1 = abcReader.readLine();
        BufferedReader abc2Reader = new BufferedReader(new FileReader("sub-dir/abc2.txt"));
        String str2 = null;
        Set<String> set = new HashSet<>();

        while((str2 = abc2Reader.readLine()) != null){
            set.add(str2);

        }
        while(str1 != null){

             if(!set.contains(str1)){
                 printWriter.println(str1);
             }
            str1 = abcReader.readLine();
           // abcReader.close();
        }
        abcReader.close();
        printWriter.flush();
        printWriter.close();
        abc2Reader.close();

    }
}
