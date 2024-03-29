package behavioral.iterator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SkillIterator implements Iterator {
    private JavaDeveloper javaDeveloper;
    private int index;

    public SkillIterator(JavaDeveloper javaDeveloper) {
        this.javaDeveloper = javaDeveloper;
    }

    @Override
    public boolean hasNext() {
        return index < javaDeveloper.getSkills().length;
    }

    @Override
    public Object next() {
        return javaDeveloper.getSkills()[index++];
    }
}
