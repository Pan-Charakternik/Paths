package com.jjozwik;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try{

            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("isDirectory = " + attrs.isDirectory());
            System.out.println("isReqularFile = " + attrs.isRegularFile());



            //CREATE
            //directories:
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir2/Dir3/Dir4/Dir5/Dir6");
//            Files.createDirectories(dirToCreate);

            //folder:

//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);

            //directory:

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

            //DELETE
//
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.delete(fileToDelete);

            //RENAME/MOVE

//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Files.move(fileToMove, destination);

            //COPY/REPLACE

//            Path sourceFile =  FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile,StandardCopyOption.REPLACE_EXISTING);
//
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
////        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filePath = FileSystems.getDefault().getPath(".","files","SubdirectoryFile.txt");
//        printFile(filePath);
//
//        filePath = Paths.get("C:\\Users\\Jakub_Jozwik\\IdeaProjects\\OutThere.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath()+"\n");
//
//        Path path2 = FileSystems.getDefault().getPath(".","files","..","files","SubdirectoryFile.txt");
//        printFile(path2);
//
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//
//        Path path3 = FileSystems.getDefault().getPath("nonexisting.txt ");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("D:\\","abcdef.dat");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exits = " + Files.exists(filePath));
//
//        System.out.println("Exisis = " + Files.exists(path4));
//
//
//    }
//
//    private static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while ((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        System.out.println("-----------------");
//    }
//}
