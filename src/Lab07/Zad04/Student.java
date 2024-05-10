package Lab07.Zad04;

public class Student {
    private final String forename;
    private final String surname;
    private final int index;
    private final int classroomNum;
    private final int  year;

    Student(String forename, String surname, int index, int classroomNum, int year) {
        this.forename = forename;
        this.surname = surname;
        this.index = index;
        this.classroomNum = classroomNum;
        this.year = year;
    }

    public String toString(){
        return forename + " " + surname + " " + index + " " + classroomNum + " " + year;
    }
}
