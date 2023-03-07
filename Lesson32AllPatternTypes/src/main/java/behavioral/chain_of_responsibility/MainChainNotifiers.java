package behavioral.chain_of_responsibility;

import static behavioral.chain_of_responsibility.Priority.*;

public class MainChainNotifiers {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(LOW);
        Notifier sms = new SmsNotifier(MIDDLE);
        Notifier email = new EmailNotifier(HIGH);
        reportNotifier.setNextNotifier(email);
        reportNotifier.setNextNotifier(sms);
        reportNotifier.notifyManager("No worries, everything is fine", LOW);
        reportNotifier.notifyManager("Need help with application", MIDDLE);
        reportNotifier.notifyManager("Can't download application, extremely need help!!!", HIGH);
    }
}
