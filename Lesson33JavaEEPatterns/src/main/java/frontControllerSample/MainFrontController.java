package frontControllerSample;

public class MainFrontController {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Home");
        System.out.println("___________________");
        frontController.dispatchRequest("Student");
        System.out.println("___________________");
        frontController.dispatchRequest("Dashboard");
        System.out.println("___________________");
        frontController.dispatchRequest("Error");
    }
}
