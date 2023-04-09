package behavioral.iterator;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JavaDeveloper implements Collection {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator(this);
    }
}

