package behavioral.template;

public abstract class WebsiteTemplate {
    void showPage() {
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();
}
