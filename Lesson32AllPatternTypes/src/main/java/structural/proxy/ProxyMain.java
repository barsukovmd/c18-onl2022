package structural.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://wwww.github.com/my_real_project");
        project.runProject();
    }
}
