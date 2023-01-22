package tms.homework.task1.jdbc.models;

public class City {
    private String cityName;
    private Student student;

    public City(String cityName, Student student) {
        this.cityName = cityName;
        this.student = student;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
