package behavioral.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class JavaDeveloper implements Collection {
    private String name;
    private String[] skills;

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }
}

