package Lab08.Zad03;

class Main {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        int chosenOption = stringUtils.stringOperation();

        try {
            switch (chosenOption) {
                case 1 -> {
                    String result = stringUtils.toLowerCase();
                    if (stringUtils.isSameAsOriginal(result)) {
                        throw new Exception("String same as original");
                    }
                    System.out.println(stringUtils.toLowerCase());
                }
                case 2 -> {
                    String result = stringUtils.toUpperCase();
                    if (stringUtils.isSameAsOriginal(result)) {
                        throw new Exception("String same as original");
                    }
                    System.out.println(stringUtils.toUpperCase());
                }
                case 3 -> {
                    String result = stringUtils.invert();
                    if (stringUtils.isSameAsOriginal(result)) {
                        throw new Exception("String same as original");
                    }
                    System.out.println(stringUtils.invert());
                }
                case 4 -> {
                    String result = stringUtils.encrypt(5);
                    if (stringUtils.isSameAsOriginal(result)) {
                        throw new Exception("String same as original");
                    }
                    System.out.println(stringUtils.encrypt(5));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
