package com.io.file.practice;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws FileNotFoundException {
       try(PrintWriter printWriter = new PrintWriter("sub-dir/abc3.txt");
        BufferedReader abcReader = new BufferedReader(new FileReader("sub-dir/abc.txt"));
        BufferedReader abc2Reader = new BufferedReader(new FileReader("sub-dir/abc2.txt"))) {
           String str = null;
           while((str = abcReader.readLine()) != null){
               printWriter.println(str);
           }
           str = null;
           while((str = abc2Reader.readLine()) != null){
               printWriter.println(str);
           }
       } catch (IOException e) {
           throw new RuntimeException(e);
       } ;


    }
}
