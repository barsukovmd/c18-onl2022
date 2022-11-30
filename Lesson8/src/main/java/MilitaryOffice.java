import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public String checkRecruits() {
        for (Person person : personRegistry.getPersons()) {
            
        }
        }
    }

}
//    Военкомат должен уметь:
//    a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
//    T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
//            (годными считать мужчин от 18 до 27 лет, проверяем пол и возраст)
//    б) вывести количество годных призывников в городе Минске.
//            в) вывести количество призывников от 25 до 27 лет
//    г) вывести количество призывников у которых имя Александр.

//    public boolean checkRecruits(Person person) {
//        for (int i = 0; i < personRegistry.getPersons().length; i++) {
//            Person persons = personRegistry.getPersons()[i];
//            int personAge = person.getAge();
//            boolean personSex = person.isSex();
//            if (personAge > 18 && personAge < 27 && personSex) {
//                return persons;
//            } else if (personAge < 18 || personAge > 27) {
//                return persons + " Not compatible for army";
//            }
//        }
//        return person.getName();//???
//    }

//    public void checkRecruitsAge25To27() {
//        for (int i = 0; i < personRegistry.getPersons().length; i++) {
//            Person person = personRegistry.getPersons()[i];
//            int personAge = person.getAge();
//            if (personAge >= 25 && personAge <= 27) {
//                System.out.println(Arrays.toString(personRegistry.getPersons()) + " is ready for army");
//            } else {
//                System.out.println(Arrays.deepToString(personRegistry.getPersons()) + " Not compatible for army");
//            }
//        }
//    }


//    public Person[] checkRecruitsName(String name) {
//        Person[] person = personRegistry.getPersons();
//        Person[] personRecruits = new Person[person.length];
//        int count = 0;
//        for (int i = 0; i < person.length; i++) {
//            Person persons = person[i];
//            count++;
//            if (checkRecruits(persons) && persons.getName().equalsIgnoreCase(name)) {
//                personRecruits[i] = persons;
//        }
//    }
//        return personRecruits;
//    }

//    public void checkRecruitsAddress(String address) {
//        if (address.equals("Minsk")) {
//            System.out.println(personRegistry + "Minsk");
//        } else {
//            System.out.println(personRegistry + " not from Minsk");
//        }
//    }
//}

