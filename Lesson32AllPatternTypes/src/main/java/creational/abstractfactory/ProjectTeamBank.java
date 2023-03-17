package creational.abstractfactory;

public class ProjectTeamBank implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new AutomationQA();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagerBank();
    }
}
