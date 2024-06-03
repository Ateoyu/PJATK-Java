package Lab08.Zad04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Person {
    private String forename;
    private String surname;
    private String dateOfBirth;

    Person(String forename, String surname, String dateOfBirth) throws IllegalArgumentException {
        inputValidation(forename, surname, dateOfBirth);
        this.forename = forename;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    boolean inputValidation(String forename, String surname, String dateOfBirth) throws NullPointerException, IllegalArgumentException {
        if (!isAlphabetic(forename)) {
            throw new IllegalArgumentException("Forename must be alphabetic");
        } else if (forename.isBlank()) {
            throw new IllegalArgumentException("Forename is Blank");
        } else if (!isAlphabetic(surname)) {
            throw new IllegalArgumentException("Surname must be alphabetic");
        } else if (surname.isBlank()) {
            throw new IllegalArgumentException("Surname is Blank");
        } else if (!isDateOfBirth(dateOfBirth)) {
            throw new IllegalArgumentException("Date of Birth must be a valid date");
        }
        return true;
    }

    private boolean isAlphabetic(String name) {
        char[] nameChars = name.toCharArray();
        for (char ch : nameChars) {
            if (!(ch >= 65 && ch <= 90) && !(ch >= 97 && ch <= 122)) { //ascii solution
                return false;
            }
        }
        return true;
    }

    private boolean isDateOfBirth(String dateOfBirth) {
        DateFormat dateFormatSlash = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dateFormatDot = new SimpleDateFormat("dd.MM.yyyy");
        dateFormatSlash.setLenient(false);
        dateFormatDot.setLenient(false);
        try {
            dateFormatSlash.parse(dateOfBirth);
            return true;
        } catch (ParseException e) {
            try {
                dateFormatDot.parse(dateOfBirth);
                return true;
            } catch (ParseException ex) {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Forename:" + this.forename + "\n" +
                "Surname: " + this.surname + "\n" +
                "Date of Birth: " + this.dateOfBirth;
    }
}
