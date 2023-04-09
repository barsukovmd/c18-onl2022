package behavioral.memento;

public class MainMemento {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();
        System.out.println("Creating new Project 1.0...");
        System.out.println("___");

        project.setVersionAndDate("Version 1.0");
        System.out.println(project);
        System.out.println("___");

        System.out.println("Saving current version to Github...");
        gitHubRepo.setSave(project.save());

        System.out.println("Updating my project to Version 1.1...");
        System.out.println("Writing poor code...");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1...");
        System.out.println(project);
        System.out.println("Something went wrong...");
        project.load(gitHubRepo.getSave());
        System.out.println("Project after rollback...");
        System.out.println(project);
    }
}
