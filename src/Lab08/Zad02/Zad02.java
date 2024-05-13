package Lab08.Zad02;

class Zad02 {
    public static void main(String[] args) {
        RuntimeExceptionSpam object = new RuntimeExceptionSpam();
        try {
            object.exception();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
