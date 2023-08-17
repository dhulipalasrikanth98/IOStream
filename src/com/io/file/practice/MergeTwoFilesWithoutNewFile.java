package com.io.file.practice;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class MergeTwoFilesWithoutNewFile {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("sub-dir/abc3.txt");
        //PrintWriter printWriter1 = new PrintWriter("sub-dir/abc3.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("sub-dir/abc.txt"));
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("sub-dir/abc2.txt"));
        String str = null,str2 = null;

        while((str = bufferedReader.readLine()) != null && (str2 = bufferedReader1.readLine()) !=null){
            printWriter.println(str);
            printWriter.println(str2);
        }
        while(str != null){
            printWriter.println(str);
            str = bufferedReader.readLine();
        }
        while(str2 != null){
            printWriter.println(str2);
            str2 = bufferedReader1.readLine();
        }
        bufferedReader1.close();
        bufferedReader1.close();
        printWriter.flush();
    }
}
