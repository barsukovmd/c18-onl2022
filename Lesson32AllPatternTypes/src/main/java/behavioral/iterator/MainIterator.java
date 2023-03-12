package behavioral.iterator;

public class MainIterator {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "SQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Yauhen Barsukov", skills);
        SkillIterator skillIterator = new SkillIterator();
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
