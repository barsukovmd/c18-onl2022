package behavioral.chain_of_responsibility;

import static behavioral.chain_of_responsibility.Priority.*;

public class MainChainNotifiers {
    public static void main(String[] args) {
//        Notifier reportNotifier = new SimpleReportNotifier(LOW);
//        reportNotifier.setNextNotifier(reportNotifier);
//        Notifier sms = new SmsNotifier(MIDDLE);
//        Notifier email = new EmailNotifier(HIGH);
//        reportNotifier.setNextNotifier(email);
//        reportNotifier.setNextNotifier(sms);
//        reportNotifier.notifyManager("No worries, everything is fine", LOW);
//        reportNotifier.notifyManager("Need help with application", MIDDLE);
//        reportNotifier.notifyManager("Can't download application, extremely need help!!!", HIGH);
        Notifier reportNotifier = new SimpleReportNotifier(LOW);
        Notifier emailNotifier = new EmailNotifier(MIDDLE);
        Notifier smsNotifier = new SmsNotifier(HIGH);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK", LOW);
        System.out.println("----");
        reportNotifier.notifyManager("Something went wrong!", MIDDLE);
        System.out.println("----");
        reportNotifier.notifyManager("Houston, we've had a problem!!!", HIGH);
        System.out.println("----");
    }
}
