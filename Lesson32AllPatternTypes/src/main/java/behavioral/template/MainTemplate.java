package behavioral.template;

public class MainTemplate {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();
        WebsiteTemplate sportPage = new SportPage();
        welcomePage.showPage();
        System.out.println("---");
        newsPage.showPage();
        System.out.println("---");
        sportPage.showPage();
        System.out.println("---");
    }
}
