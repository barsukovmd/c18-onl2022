SELECT students_db.students.id, name, surname, age, course, id_for_city
from students_db.students
         left join students_db.city c on students.city_id = c.id_for_city;
