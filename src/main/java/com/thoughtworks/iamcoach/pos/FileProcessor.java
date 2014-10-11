package com.thoughtworks.iamcoach.pos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List readFile(String fileName) {

        List<String> data = new ArrayList<String>();
        data.add(0,"qqq");
        data.add(1,"www");
        return data;
    }

    private static String getFilePath(String fileName) {

        File file = new File(fileName);
        return file.getAbsolutePath();
    }
}
