package behavioral.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.text.StrMatcher;

@Setter
@Getter
public class JavaDeveloper implements Collection {
    private SkillIterator skillIterator;
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }
}

