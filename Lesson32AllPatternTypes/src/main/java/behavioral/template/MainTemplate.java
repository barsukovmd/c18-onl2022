package behavioral.template;

public class MainTemplate {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();
        WebsiteTemplate sportPage = new SportPage();
        System.out.println("---");
        welcomePage.showPage();
        newsPage.showContent();
        System.out.println("---");
        welcomePage.showPage();
        sportPage.showContent();
        System.out.println("---");
    }
}
