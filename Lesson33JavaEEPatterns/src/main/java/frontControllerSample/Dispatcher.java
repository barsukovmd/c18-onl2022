package frontControllerSample;

public class Dispatcher {
    private HomeView homeView;
    private DashboardView dashboardView;
    private StudentView studentView;
    private ErrorView errorView;

    public Dispatcher() {
        homeView = new HomeView();
        dashboardView = new DashboardView();
        studentView = new StudentView();
        errorView = new ErrorView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("Home")) {
            homeView.showView();
        } else if (request.equalsIgnoreCase("Dashboard")) {
            dashboardView.showView();
        } else if (request.equalsIgnoreCase("Student")) {
            studentView.showView();
        } else {
            errorView.showView();
        }
    }
}
