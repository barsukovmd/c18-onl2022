package service;

import lombok.Getter;
import lombok.Setter;
import model.Students;
import repository.StudentRepositoryAware;

import java.util.List;

@Getter
@Setter

public class StudentService {
    private final StudentRepositoryAware studentsRepositoryAware;

    public StudentService(StudentRepositoryAware studentsRepositoryAware) {
        this.studentsRepositoryAware = studentsRepositoryAware;
    }

    public List<Students> searchStudents() {
        return studentsRepositoryAware.searchStudents();
    }

    public List<Students> insertNewStudents(Students students) {
        return studentsRepositoryAware.insertNewStudents(students);
    }

    public List<Students> deleteStudents(int id) {
        return studentsRepositoryAware.deleteStudents(id);
    }
}
