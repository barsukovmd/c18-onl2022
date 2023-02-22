package service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.Students;
import repository.StudentRepositoryAware;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class StudentService {
    private final StudentRepositoryAware studentRepositoryAware;

    public List<Students> searchStudents() {
        return studentRepositoryAware.searchStudents();
    }

    public List<Students> insertNewStudents(Students students) {
        return studentRepositoryAware.insertNewStudents(students);
    }

    public List<Students> deleteStudents(int id) {
        return studentRepositoryAware.deleteStudents(id);
    }
}
