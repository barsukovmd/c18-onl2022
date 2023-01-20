package tms.homework.task1.jdbc.models;

public class City {
    private Students students;

    public City(Students students) {
        this.students = students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Students getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "City{" +
                "students=" + students +
                '}';
    }
}
