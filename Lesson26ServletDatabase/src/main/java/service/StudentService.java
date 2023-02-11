package service;

import model.Students;
import repository.StudentsRepository;

import java.util.List;

public class StudentService {
    private final StudentsRepository studentsRepository;

    public StudentService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public List<Students> searchStudents() {
        return studentsRepository.searchStudents();
    }
}
