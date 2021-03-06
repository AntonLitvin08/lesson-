package com.javarush.task.task15.task1525;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        File file = new File(Statics.FILE_NAME);
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                lines.add(scanner.nextLine());
               // System.out.println(lines);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
