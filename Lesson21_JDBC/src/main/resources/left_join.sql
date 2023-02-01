SELECT students_db.students.id, name, surname, age, course, city_id
from students_db.students
         left join students_db.city c on students.city_id = c.cityId;
