package Lab08.Zad03;

import java.io.IOException;

public class Zad03 {
    public static void main(String[] args) {
        IoExceptionSpam object = new IoExceptionSpam();
        try {
            object.exceptionSpam();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
