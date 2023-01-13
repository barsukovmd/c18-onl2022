package homework.task5;

import java.util.List;


public class ServiceOptional {
    private List<Person> personList;

    //еще не доделал, тяжело связывать все в голове
    public boolean getSurnamesWithD(Person person) {
        return person.getSurname().startsWith("Д");
    }
}
