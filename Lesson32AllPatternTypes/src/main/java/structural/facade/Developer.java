package structural.facade;

public class Developer {

    public void develop(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is running");
        } else {
            System.out.println("Developer is developing project");
        }
    }
}
