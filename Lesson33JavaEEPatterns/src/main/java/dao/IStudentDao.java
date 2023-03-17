package dao;

import dao.domain.Student;

import java.util.List;

public interface IStudentDao {

    List<Student> getAllStudents();

    Student getStudentById(int id);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);
}
