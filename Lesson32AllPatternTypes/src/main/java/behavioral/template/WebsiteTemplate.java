package behavioral.template;

public abstract class WebsiteTemplate {
   final void showPage() {//сделать финальным, чтобы нельзя было переопределить
       System.out.println("Header");
       showContent();
       System.out.println("Footer");
   }

    public abstract void showContent();
}
