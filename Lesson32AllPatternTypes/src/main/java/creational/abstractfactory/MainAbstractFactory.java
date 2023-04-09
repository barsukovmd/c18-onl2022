package creational.abstractfactory;

public class MainAbstractFactory {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new ProjectTeamBank();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        developer.writeCode();
        tester.testProject();
        projectManager.manageProject();
    }
}
