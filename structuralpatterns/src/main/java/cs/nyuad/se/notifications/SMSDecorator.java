package cs.nyuad.se.notifications;

public class SMSDecorator extends NotifierDecorator {

    public SMSDecorator(Notifier wrappee) {
        super(wrappee);
    }

    public void sendNotification(String message) {
        super.sendNotification(message);
        sendSMS(message);
    }

    public void sendSMS(String message) {
        System.out.println("Sent SMS to phone");
    }

    public void confirmSMS(String message) {
        System.out.println("SMS was seen");
    }
    
}
