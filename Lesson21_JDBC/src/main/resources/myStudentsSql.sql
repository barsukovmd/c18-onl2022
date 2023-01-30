SELECT *
FROM students_db.students
         left join students_db.students on students_db.students.city_id = students_db.city.city_id;


