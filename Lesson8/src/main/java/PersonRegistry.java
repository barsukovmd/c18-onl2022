import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonRegistry {
    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }
}
