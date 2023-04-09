package structural.facade;

public class WorkFlow {

    private BugTracker bugTracker = new BugTracker();
    private Job job = new Job();
    private Developer developer = new Developer();

    public void workFlow() {
        job.doJob();
        bugTracker.finishSprint();
        developer.develop(bugTracker);
    }
}
