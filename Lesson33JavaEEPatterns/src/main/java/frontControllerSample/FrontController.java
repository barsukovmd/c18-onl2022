package frontControllerSample;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public boolean isAuthenticUser() {
        System.out.println("User is Authenticated successfully");
        return true;
    }

    public void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
