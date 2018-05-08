package com.jjozwik;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);

//        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        Path filePath = FileSystems.getDefault().getPath(".","files","SubdirectoryFile.txt");
        printFile(filePath);

        filePath = Paths.get("C:\\Users\\Jakub_Jozwik\\IdeaProjects\\OutThere.txt");
        printFile(filePath);

        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath()+"\n");

        Path path2 = FileSystems.getDefault().getPath(".","files","..","files","SubdirectoryFile.txt");
        printFile(path2);

        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());
    }

    private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("-----------------");
    }
}
