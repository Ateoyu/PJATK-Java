package Lab10.Zad02;

import java.io.File;
import java.util.*;

public class countFilesInDir {
    public static void main(String[] args) {
        try {
            File targetDirectory = new File("src/Lab10/Zad02/basedir");
            Map<String, Integer> MapOfDirectoryFileNum = new HashMap<>();
            for (File directory : targetDirectory.listFiles()) {
                if (directory.isDirectory()) {
                    MapOfDirectoryFileNum.put(directory.getName(), directory.list().length);
                }
            }
            int maxCount = 0;
            String maxDirectory = "";
            for (Map.Entry<String, Integer> entry : MapOfDirectoryFileNum.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                if (maxCount < value) {
                    maxCount = value;
                    maxDirectory = key;
                }
            }
            System.out.println("The directory with the highest number of files is: " + maxDirectory + ", totalling: " + maxCount);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}

