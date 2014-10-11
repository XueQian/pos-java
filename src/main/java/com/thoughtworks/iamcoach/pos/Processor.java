package com.thoughtworks.iamcoach.pos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Processor {

    public static List readFile(String fileName) {
        List<String> list = new ArrayList<String>();
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }



}
