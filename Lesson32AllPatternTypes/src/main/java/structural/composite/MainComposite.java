package structural.composite;

public class MainComposite {

    public static void main(String[] args) {
        Team team = new Team();
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new PhpDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.writeCode();
    }
}
