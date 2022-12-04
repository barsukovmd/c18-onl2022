import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class PersonRegistry {
    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }
}
