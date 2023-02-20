package repository;

import model.Students;

import java.util.List;

public interface StudentsRepository {
  List<Students> searchStudents();

  List<Students> insertNewStudents(Students students);

  List<Students> deleteStudents(int id);
}
