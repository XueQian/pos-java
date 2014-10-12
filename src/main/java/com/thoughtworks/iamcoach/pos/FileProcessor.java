package com.thoughtworks.iamcoach.pos;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public List readFile(String fileName) {

//        String filePath = this.getFilePath(fileName);
        List<String> data = new ArrayList<String>();
     try{

         data= Files.readAllLines(Paths.get(fileName),
         Charset.defaultCharset());
     }catch (IOException e){

         System.out.print("读取文件失败。。。。。。");
     }
        return data;
    }

    private static String getFilePath(String fileName) {

        File file = new File(fileName);
        return file.getAbsolutePath();
    }
}