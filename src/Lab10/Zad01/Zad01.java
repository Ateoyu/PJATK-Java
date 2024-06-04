package Lab10.Zad01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad01 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/Lab10/Zad01/Input");
            Scanner fileReader = new Scanner(inputFile);
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (i % 2 == 0) {
                    stringBuilder.append(line).append(" ");
                }
                i++;
            }
            System.out.println(stringBuilder);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
